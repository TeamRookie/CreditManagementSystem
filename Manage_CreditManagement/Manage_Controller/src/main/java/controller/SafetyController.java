package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pojo.PageBean;
import service.SafetyService;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;


@Controller
public class SafetyController
{
    @Value("${PageSize}")
    private Integer pageSize;
    @Autowired
    private SafetyService safetyService;

    @RequestMapping("/safetyRules")
    public String getSafetyRules(Model model, Integer currentPage)
    {
        PageBean pageBean = safetyService.getPageBean(pageSize, currentPage);
        model.addAttribute("pageBean", pageBean);
        return "rules/safetyRules";
    }

    @RequestMapping("/safety")
    public String getSafety(Model model,String faculty,String major,String grade, String safetyTime,String studentNumber, Integer currentPage)
    {
        PageBean pageBean = safetyService.getSafetyPageBean(studentNumber,faculty,major,grade,safetyTime, currentPage, pageSize);
        model.addAttribute("pageBean", pageBean);
        model.addAttribute("safetyTime", safetyTime);
        model.addAttribute("studentNumber",studentNumber);
        model.addAttribute("faculty",faculty);
        model.addAttribute("major",major);
        model.addAttribute("grade",grade);
        return "information/safety";
    }
    @RequestMapping("/safetyDownload")
    @ResponseBody
    public String safetyDownload(HttpServletResponse response, String name, String faculty, String major, String grade, String date)
    {
        response.setContentType("application/binary;charset=UTF-8");
        try{
            ServletOutputStream out=response.getOutputStream();
            try {
                //设置文件头：最后一个参数是设置下载文件名(这里我们叫：张三.pdf)
                response.setHeader("Content-Disposition", "attachment;fileName=" + URLEncoder.encode(name+".xlsx", "UTF-8"));
            } catch (UnsupportedEncodingException e1) {
                e1.printStackTrace();
            }

            String[] titles = {"学号","姓名","学院","专业","班级","获得称号时间","指导教师","称号级别","学分"};
            safetyService.safetyExport(titles, out,faculty,major,grade,date);
            return "success";
        } catch(Exception e){
            e.printStackTrace();
            return "导出信息失败";
        }
    }
}
