package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pojo.PageBean;
import service.ScienceService;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

@Controller
public class ScienceController
{

    @Value("${PageSize}")
    private  Integer pageSize;
    @Autowired
    private ScienceService scienceService;
    @RequestMapping("science")
    public String getScience(Model model, String studentNumber,String faculty,String major,String grade, String scienceType, String scienceTime, String scienceLevel, Integer currentPage)
    {
        PageBean pageBean=scienceService.getSciencePageBean(studentNumber,faculty,major,grade,scienceType,scienceTime,scienceLevel,pageSize,currentPage);
        model.addAttribute("studentNumber",studentNumber);
        model.addAttribute("scienceType",scienceType);
        model.addAttribute("scienceTime",scienceTime);
        model.addAttribute("scienceLevel",scienceLevel);
        model.addAttribute("pageBean",pageBean);
        model.addAttribute("faculty",faculty);
        model.addAttribute("major",major);
        model.addAttribute("grade",grade);
        return "information/science";
    }
    @RequestMapping("/scienceRules")
    public  String getScienceRules(Model model,Integer currentPage)
    {
        PageBean pageBean=scienceService.getScienceRulesPageBean(currentPage,pageSize);
        model.addAttribute("pageBean",pageBean);
        return  "rules/scienceRules";
    }
    @RequestMapping("/scienceDownload")
    public   @ResponseBody
    String scienceDownload(HttpServletResponse response, String name, String faculty, String major, String grade, String startTime,String scienceLevel,String scienceType)
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

            String[] titles = {"学号","姓名","学院","专业","班级","科研项目名称","课题类型","课题级别","课题开始时间","课题结束时间","指导教师","职责","学分"};
            scienceService.scienceExport(titles, out,faculty,major,grade,startTime,scienceLevel,scienceType);
            return "success";
        } catch(Exception e){
            e.printStackTrace();
            return "导出信息失败";
        }
    }
}
