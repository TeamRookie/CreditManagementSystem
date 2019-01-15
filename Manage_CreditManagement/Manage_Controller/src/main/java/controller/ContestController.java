package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
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
    public  String getContest(Model model,String searchDate,String theme,String level,String rank,String stuNum)
    {

        return  "contest";
    }
    @RequestMapping("/contestImport")
    public  String getContestImport(Model model,Integer currentPage,String contestDate,String contestName)
    {
        PageBean pageBean = contestService.getContestTypePageBean(pageSize, currentPage, contestDate, contestName);
        model.addAttribute("pageBean",pageBean);
        return  "import/contestImport";
    }
    @RequestMapping("/deleteContestType")
    public String getContestImport(Integer id)
    {
        if (id!=null&&(!StringUtils.isEmpty(id)))
        {
            contestService.deleteContestTypeById(id);
        }
        return "redirect:contestImport.action";
    }
}