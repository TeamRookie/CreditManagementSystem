package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import pojo.Safetyrules;
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
    private TypeService typeService;
    @Autowired
    private SafetyService safetyService;
    @RequestMapping("/safetyRules")
    public  String getSafetyRules(Model model)
    {
        List<Safetyrules> safetyRulesList = safetyService.getSafetyRules();
        List<Type> typeList = typeService.getAllType();
        model.addAttribute("safetyRulesList",safetyRulesList);
        model.addAttribute("typeList",typeList);
        return  "safetyRules";
    }
    @RequestMapping("/safety")
    public  String getSafety(Model model)
    {
        List<Type> typeList = typeService.getAllType();
        model.addAttribute("typeList",typeList);
        return  "safety";
    }
}
