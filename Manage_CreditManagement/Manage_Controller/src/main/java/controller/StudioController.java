package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import pojo.PageBean;
import pojo.Studiotype;
import pojo.Type;
import service.StudioService;
import service.TypeService;

import java.util.List;

@Controller
public class StudioController
{
    @Value("${PageSize}")
    private Integer pageSize;
    @Autowired
    private StudioService studioService;

    @RequestMapping("/studioRules")
    public String getStudioRules(Model model, Integer currentPage)
    {
        PageBean pageBean = studioService.getPageBean(pageSize, currentPage);
        model.addAttribute("pageBean", pageBean);
        return "rules/studioRules";
    }

    @RequestMapping("/studio")
    public String getStudio(Model model)
    {
        return "studio";
    }

    @RequestMapping("/studioImport")
    public String getStudioImport(Model model, String studioName, String studioLevel,String studioDepartment, Integer currentPage)
    {
        PageBean pageBean = studioService.getStudioImportPageBean(studioName, studioLevel,studioDepartment ,currentPage, pageSize);
        model.addAttribute("pageBean", pageBean);
        model.addAttribute("studioName", studioName);
        model.addAttribute("studioLevel", studioLevel);
        model.addAttribute("studioDepartment",studioDepartment);
        return "import/studioImport";
    }
    @RequestMapping("/deleteStudioType")
    public  String deleteStudioType(Integer id)
    {
        studioService.deleteStudioTypeById(id);
        return "redirect:studioImport.action";
    }
    @RequestMapping(value = "/addStudioType",method = RequestMethod.POST)
    public  String addStudioType(Studiotype studiotype)
    {
        if (studiotype!=null&&studiotype.getDepartment()!=null&&!studiotype.getDepartment().isEmpty()&&studiotype.getStudiolevel()!=null&&!studiotype.getStudiolevel().isEmpty()&&studiotype.getStudioname()!=null&&!studiotype.getStudioname().isEmpty())
        {
            studioService.addStudioType(studiotype);
        }
        return "redirect:studioImport.action";
    }
}
