package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import pojo.PageBean;
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
    private ContestService contestService;
    @RequestMapping("/contestRules")
    public  String getContestRules(Model model,Integer currrentPage)
    {
        PageBean pageBean = contestService.getPageBean(pageSize, currrentPage);
        model.addAttribute("pageBean",pageBean);
        return "rules/contestRules";
    }
    @RequestMapping("/contest")
    public  String getContest(Model model)
    {
        return  "contest";
    }
}
