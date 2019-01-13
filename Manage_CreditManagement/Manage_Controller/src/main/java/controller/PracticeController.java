package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import pojo.Practicerules;
import pojo.Type;
import service.PraticeService;
import service.TypeService;

import java.util.List;
@Controller
public class PracticeController
{
    @Value("${PageSize}")
    private  Integer pageSize;
    @Autowired
    private TypeService typeService;
    @Autowired
    private  PraticeService  praticeService;
    @RequestMapping("/practiceRules")
    public  String getPracticeRules(Model model)
    {
        List<Type> typeList = typeService.getAllType();
        List<Practicerules> practiceRulesList = praticeService.getPracticeRules();
        model.addAttribute("typeList",typeList);
        model.addAttribute("practiceRulesList",practiceRulesList);
        return  "practiceRules";
    }
    @RequestMapping("/practice")
    public  String getPractice(Model model)
    {
        List<Type> typeList = typeService.getAllType();
        model.addAttribute("typeList",typeList);
        return  "practice";
    }
}
