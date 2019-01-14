package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import pojo.PageBean;
import pojo.Type;
import service.PraticeService;
import service.TypeService;

import java.util.List;
@Controller
public class PracticeController
{
    @Value("${PageSize}")
    private  Integer pageSize;
    @Autowired
    private  PraticeService  praticeService;
    @RequestMapping("/practiceRules")
    public  String getPracticeRules(Model model,Integer currentPage)
    {
        PageBean pageBean = praticeService.getPageBean(pageSize, currentPage);
        model.addAttribute("pageBean",pageBean);
        return "rules/practiceRules";
    }
    @RequestMapping("/practice")
    public  String getPractice(Model model)
    {
        return  "practice";
    }
}
