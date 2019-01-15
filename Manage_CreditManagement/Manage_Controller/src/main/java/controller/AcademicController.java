package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import pojo.AcademicPageBean;
import pojo.Type;

import service.AcademicService;
import service.TypeService;

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
    public  String getAcademic(Model model,String stuNum,String searchDate,Integer currentPage)
    {
        AcademicPageBean pageBean = academicService.getAcademicPageBean(stuNum, searchDate,pageSize, currentPage);
        model.addAttribute("pageBean",pageBean);
        return  "information/academic";
    }
}