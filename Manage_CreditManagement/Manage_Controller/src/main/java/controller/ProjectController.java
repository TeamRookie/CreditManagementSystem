package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import pojo.Projectrules;
import pojo.Type;
import service.ProjectService;
import service.TypeService;
import sun.dc.pr.PRError;

import java.util.List;
@Controller
public class ProjectController
{
    @Value("${PageSize}")
    private  Integer pageSize;
    @Autowired
    private TypeService typeService;
    @Autowired
    private ProjectService projectService;
    @RequestMapping("/projectRules")
    public  String getProjectRules(Model model)
    {
        List<Projectrules> projectRulesList = projectService.getProjectRules();
        List<Type> typeList = typeService.getAllType();
        model.addAttribute("projectRulesList",projectRulesList);
        model.addAttribute("typeList",typeList);
        return  "projectRules";
    }
    @RequestMapping("/project")
    public  String getProject(Model model)
    {
        List<Type> typeList = typeService.getAllType();
        model.addAttribute("typeList",typeList);
        return  "project";
    }
}
