package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pojo.AcademicPageBean;
import pojo.PageBean;
import pojo.Type;

import service.AcademicService;
import service.TypeService;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.List;

@Controller
public class AcademicController
{
    @Value("${PageSize}")
    private  Integer pageSize;
    @Autowired
    private AcademicService academicService;
    @RequestMapping("/academicRules")
    public  String getAcademicRules(Model model,Integer curremtPage)
    {
    /*    final PageBean pageBean = academicService.getPageBean(pageSize, curremtPage);*/
    /*     model.addAttribute("pageBean",pageBean);*/
        return "rules/academicRules";
    }

    @RequestMapping("/academic")
    public  String getAcademic(Model model,String faculty,String major,String grade,String studentNumber,String academicTime,String academicDepartment,Integer currentPage)
    {
        PageBean pageBean = academicService.getAcademicPageBean(studentNumber,faculty,major,grade, academicTime,academicDepartment, currentPage,pageSize);
        model.addAttribute("pageBean",pageBean);
        model.addAttribute("studentNumber",studentNumber);
        model.addAttribute("academicTime",academicTime);
        model.addAttribute("academicDepartment",academicDepartment);
        model.addAttribute("faculty",faculty);
        model.addAttribute("major",major);
        model.addAttribute("grade",grade);
        return  "information/academic";
    }
    @RequestMapping("/academicDownload")
    public   @ResponseBody
    String academicDownload(HttpServletResponse response,String name, String faculty, String major, String grade, String department, String date)
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

            String[] titles = {"学号","姓名","学院","专业","班级","时间","主题内容","地点","组织单位","参加人数"};
            academicService.academicExport(titles, out,faculty,major,grade,department,date);
            return "success";
        } catch(Exception e){
            e.printStackTrace();
            return "导出信息失败";
        }
    }
}
