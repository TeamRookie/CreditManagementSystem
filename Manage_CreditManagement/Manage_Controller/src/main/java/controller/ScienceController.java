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
    public String getScience(Model model, String studentNumber, String scienceType, String scienceTime, String scienceLevel, Integer currentPage)
    {
        PageBean pageBean=scienceService.getSciencePageBean(studentNumber,scienceType,scienceTime,scienceLevel,pageSize,currentPage);
        model.addAttribute("studentNumber",studentNumber);
        model.addAttribute("scienceType",scienceType);
        model.addAttribute("scienceTime",scienceTime);
        model.addAttribute("scienceLevel",scienceLevel);
        model.addAttribute("pageBean",pageBean);
        return "information/science";
    }
}
