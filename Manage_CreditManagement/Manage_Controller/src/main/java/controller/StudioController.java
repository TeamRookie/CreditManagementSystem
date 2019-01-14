package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import pojo.PageBean;
import pojo.Type;
import service.StudioService;
import service.TypeService;

import java.util.List;
@Controller
public class StudioController
{
    @Value("${PageSize}")
    private  Integer pageSize;
    @Autowired
    private StudioService studioService;
    @RequestMapping("/studioRules")
    public  String getStudioRules(Model model,Integer currentPage)
    {
        PageBean pageBean = studioService.getPageBean(pageSize, currentPage);
        model.addAttribute("pageBean",pageBean);
        return "rules/studioRules";
    }
    @RequestMapping("/studio")
    public  String getStudio(Model model)
    {
        return  "studio";
    }
}
