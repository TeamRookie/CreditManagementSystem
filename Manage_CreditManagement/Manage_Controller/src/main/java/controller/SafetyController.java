package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import pojo.PageBean;
import service.SafetyService;


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
    public String getSafety(Model model, String safetyTime,String studentNumber, Integer currentPage)
    {
        PageBean pageBean = safetyService.getSafetyPageBean(studentNumber,safetyTime, currentPage, pageSize);
        model.addAttribute("pageBean", pageBean);
        model.addAttribute("safetyTime", safetyTime);
        model.addAttribute("studentNumber",studentNumber);
        return "information/safety";
    }

}
