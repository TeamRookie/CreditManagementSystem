package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import pojo.PageBean;
import pojo.Projecttype;
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
    public  String getProject(Model model,String studentNumber,String projectTime,String projectType,String projectId,String projectLevel,String projectScore,Integer currentPage)
    {
        PageBean pageBean= projectService.getProjectPageBean(studentNumber,projectTime,projectType,projectId,projectLevel,projectScore,currentPage,pageSize);
        model.addAttribute("pageBean",pageBean);
        model.addAttribute("studentNumber",studentNumber);
        model.addAttribute("projectTime",projectTime);
        model.addAttribute("projectType",projectType);
        model.addAttribute("projectId",projectId);
        model.addAttribute("projectLevel",projectLevel);
        model.addAttribute("projectScore",projectScore);
        model.addAttribute("currentPage",currentPage);
        return  "information/project";
    }
    @RequestMapping("/projectImport")
    public  String getProjectImport(Model model,String projectTime,String projectName,Integer currentPage)
    {
        PageBean pageBean = projectService.getProjectImportPageBean(projectTime, projectName, pageSize, currentPage);
        model.addAttribute("pageBean",pageBean);
        model.addAttribute("projectTime",projectTime);
        model.addAttribute("projectName",projectName);
        return "import/projectImport";
    }
    @RequestMapping("/deleteProjectType")
    public  String  deleteProjectType(Integer id)
    {
        projectService.deleteProjectTypeById(id);
        return  "redirect:projectImport.action";
    }
    @RequestMapping(value = "/addProjectType",method = RequestMethod.POST)
    public  String addProjectType(Projecttype projecttype)
    {
        if (projecttype!=null&&projecttype.getProjectid()!=null&&projecttype.getProjectname()!=null&&projecttype.getProjecttime()!=null)
        {
            projectService.addProjectType(projecttype);
        }
        return "redirect:projectImport.action";
    }
}
