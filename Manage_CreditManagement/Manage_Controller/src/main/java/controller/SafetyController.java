package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import pojo.PageBean;
import pojo.Type;
import service.SafetyService;
import service.TypeService;

import java.util.List;
@Controller
public class SafetyController
{
    @Value("${PageSize}")
    private  Integer pageSize;
    @Autowired
    private SafetyService safetyService;
    @RequestMapping("/safetyRules")
    public  String getSafetyRules(Model model,Integer currentPage)
    {
        PageBean pageBean = safetyService.getPageBean(pageSize, currentPage);
        model.addAttribute("pageBean",pageBean);
        return "rules/safetyRules";
    }
    @RequestMapping("/safety")
    public  String getSafety(Model model)
    {
        return  "safety";
    }
}
