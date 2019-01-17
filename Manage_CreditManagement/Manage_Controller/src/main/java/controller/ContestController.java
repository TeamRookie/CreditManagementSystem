package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
    public  String getContest(Model model,String studentNumber,String contestTime,String contestLevel,String contestName,String contestRank,Integer currentPage)
    {
        PageBean pageBean= contestService.getContestPageBean(studentNumber,contestTime,contestLevel,contestName,contestRank,currentPage,pageSize);
        model.addAttribute("pageBean",pageBean);
        model.addAttribute("contestTime",contestTime);
        model.addAttribute("contestLevel",contestLevel);
        model.addAttribute("contestName",contestName);
        model.addAttribute("contestRank",contestRank);
        model.addAttribute("studentNumber",studentNumber);
        return  "information/contest";
    }
    @RequestMapping("/contestImport")
    public  String getContestImport(Model model,Integer currentPage,String contestDate,String contestName)
    {
        PageBean pageBean = contestService.getContestImportPageBean(pageSize, currentPage, contestDate, contestName);
        model.addAttribute("contestDate",contestDate);
        model.addAttribute("contestName",contestName);
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
    @RequestMapping(value = "/addContestType",method = RequestMethod.POST)
    public  String addContestImport(String addContestDate,String addContestName)
    {
        if (addContestDate!=null&&!addContestDate.isEmpty()&&addContestName!=null&&!addContestName.isEmpty())
        {
            contestService.addContestType(addContestDate,addContestName);
        }
        return  "redirect:contestImport.action" ;
    }
}
