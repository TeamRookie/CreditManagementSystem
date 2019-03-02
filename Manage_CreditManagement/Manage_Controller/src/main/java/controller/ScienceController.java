package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import pojo.PageBean;
import service.ScienceService;

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
}
