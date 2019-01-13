package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import pojo.Academicrules;
import pojo.PageBean;
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
    private TypeService typeService;
    @Autowired
    private AcademicService academicService;
    @RequestMapping("/academicRules")
    public  String getAcademicRules(Model model,Integer curremtPage)
    {
        List<Type> typeList = typeService.getAllType();
    /*    final PageBean pageBean = academicService.getPageBean(pageSize, curremtPage);*/
        model.addAttribute("typeList",typeList);
/*        model.addAttribute("pageBean",pageBean);*/
        return  "academicRules";
    }

    @RequestMapping("/academic")
    public  String getAcademic(Model model)
    {
        List<Type> typeList = typeService.getAllType();
        model.addAttribute("typeList",typeList);
        return  "academic";
    }
}
