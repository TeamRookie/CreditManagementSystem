package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import pojo.PageBean;
import pojo.Projecttype;
import pojo.Type;
import service.ProjectService;
import service.TypeService;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
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
    public  String getProject(Model model,String studentNumber,String faculty,String major,String grade,String projectTime,String projectType,String projectId,String projectLevel,String projectScore,Integer currentPage)
    {
        PageBean pageBean= projectService.getProjectPageBean(studentNumber,faculty,major,grade,projectTime,projectType,projectId,projectLevel,projectScore,currentPage,pageSize);
        model.addAttribute("pageBean",pageBean);
        model.addAttribute("studentNumber",studentNumber);
        model.addAttribute("projectTime",projectTime);
        model.addAttribute("projectType",projectType);
        model.addAttribute("projectId",projectId);
        model.addAttribute("projectLevel",projectLevel);
        model.addAttribute("projectScore",projectScore);
        model.addAttribute("currentPage",currentPage);
        model.addAttribute("faculty",faculty);
        model.addAttribute("major",major);
        model.addAttribute("grade",grade);
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
    @RequestMapping("/projectDownload")
    @ResponseBody
    public  String projectDownload(HttpServletResponse response, String name, String faculty, String major, String grade, String date,String projectId,String projectLevel,String score,String projectType)
    {
        response.setContentType("application/binary;charset=UTF-8");
        try{
            ServletOutputStream out=response.getOutputStream();
            try {
                //设置文件头：最后一个参数是设置下载文件名(这里我们叫：张三.pdf)
                response.setHeader("Content-Disposition", "attachment;fileName=" + URLEncoder.encode(name+".xlsx", "UTF-8"));
            } catch (UnsupportedEncodingException e1) {
                e1.printStackTrace();
            }

            String[] titles = {"学号","姓名","学院","专业","班级","项目时间","项目类别","项目编号","项目名称","项目级别","结题成绩","团队成员","指导教师","学分"};
            projectService.projectExport(titles, out,faculty,major,grade,date,projectLevel,projectId,score,projectType);
            return "success";
        } catch(Exception e){
            e.printStackTrace();
            return "导出信息失败";
        }
    }
}
