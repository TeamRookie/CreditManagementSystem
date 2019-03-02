package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pojo.PageBean;
import service.EnterpriseService;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

@Controller
public class EnterpriseController
{
    @Value("${PageSize}")
    private  Integer pageSize;
    @Autowired
    private EnterpriseService enterpriseService;
    @RequestMapping("/enterpriseRules")
    public  String getEnterpriseRules(Model model,Integer currentPage)
    {
        PageBean pageBean = enterpriseService.getPageBean(currentPage, pageSize);
        model.addAttribute("pageBean",pageBean);
        return  "rules/enterpriseRules";
    }
    @RequestMapping("/enterprise")
    public  String getEnterprise(Model model,String studentNumber,String faculty,String major,String grade,String enterpriseType,String enterpriseTime,Integer currentPage)
    {
        PageBean pageBean=enterpriseService.getEnterprisePageBean(studentNumber,faculty,major,grade,enterpriseType,enterpriseTime,currentPage,pageSize);
        model.addAttribute("pageBean",pageBean);
        model.addAttribute("enterpriseType",enterpriseType);
        model.addAttribute("enterpriseTime",enterpriseTime);
        model.addAttribute("studentNumber",studentNumber);
        model.addAttribute("faculty",faculty);
        model.addAttribute("major",major);
        model.addAttribute("grade",grade);
        return "information/enterprise";
    }
    @RequestMapping("/enterpriseDownload")
    @ResponseBody
    public String enterpriseDownload(HttpServletResponse response, String name, String faculty, String major, String grade, String date)
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

            String[] titles = {"学号","姓名","学院","专业","班级","统一社会信用代码","企业名称","企业类型","等级","住所","法定代表人","成立日期","经营范围","股东名称","学分"};
            enterpriseService.enterpriseExport(titles, out,faculty,major,grade,date);
            return "success";
        } catch(Exception e){
            e.printStackTrace();
            return "导出信息失败";
        }
    }
}
