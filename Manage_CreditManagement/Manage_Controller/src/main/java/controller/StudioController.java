package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import pojo.Studiorules;
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
    private TypeService typeService;
    @Autowired
    private StudioService studioService;
    @RequestMapping("/studioRules")
    public  String getStudioRules(Model model)
    {
        List<Studiorules> studioRulesList = studioService.getStudioRules();
        List<Type> typeList = typeService.getAllType();
        model.addAttribute("studioRulesList",studioRulesList);
        model.addAttribute("typeList",typeList);
        return  "studioRules";
    }
    @RequestMapping("/studio")
    public  String getStudio(Model model)
    {
        List<Type> typeList = typeService.getAllType();
        model.addAttribute("typeList",typeList);
        return  "studio";
    }
}
