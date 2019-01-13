package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import pojo.Contestrules;
import pojo.Type;
import service.ContestService;
import service.TypeService;

import java.util.List;
@Controller
public class ContestController
{

    @Value("${PageSize}")
    private  Integer pageSize;
    @Autowired
    private TypeService typeService;
    @Autowired
    private ContestService contestService;
    @RequestMapping("/contestRules")
    public  String getContestRules(Model model)
    {
        List<Type> typeList = typeService.getAllType();
        List<Contestrules> contestRulesList = contestService.getContestRules();
        model.addAttribute("typeList",typeList);
        model.addAttribute("contestRulesList",contestRulesList);
        return  "contestRules";
    }
    @RequestMapping("/contest")
    public  String getContest(Model model)
    {
        List<Type> typeList = typeService.getAllType();
        model.addAttribute("typeList",typeList);
        return  "contest";
    }
}
