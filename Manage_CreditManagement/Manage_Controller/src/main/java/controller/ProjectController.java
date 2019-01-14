package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import pojo.PageBean;
import pojo.Type;
import service.ProjectService;
import service.TypeService;

import java.util.List;
@Controller
public class ProjectController
{
    @Value("${PageSize}")
    private  Integer pageSize;
    @Autowired
    private ProjectService projectService;
    @RequestMapping("/projectRules")
    public  String getProjectRules(Model model,Integer currentPage)
    {
        PageBean pageBean = projectService.getPageBean(pageSize, currentPage);
        model.addAttribute("pageBean",pageBean);
        return "rules/projectRules";
    }
    @RequestMapping("/project")
    public  String getProject(Model model)
    {
        return  "project";
    }
}
