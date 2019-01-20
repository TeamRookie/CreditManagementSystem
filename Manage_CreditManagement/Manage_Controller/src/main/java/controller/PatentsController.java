package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import pojo.PageBean;
import service.PatentsService;

import javax.xml.ws.ResponseWrapper;

@Controller
public class PatentsController
{
    @Value("${PageSize}")
    private  Integer pageSize;
    @Autowired
    private PatentsService patentsService;
    @RequestMapping("/patentsRules")
    public   String getPatentsRules(Model model,Integer currentPage)
    {
        PageBean pageBean = patentsService.getPageBean(currentPage, pageSize);
        model.addAttribute("pageBean",pageBean);
        return "rules/patentsRules";
    }
    @RequestMapping("/patents")
    public  String getPatents(Model model,Integer currentPage,String patentsType,String studentNumber)
    {
        PageBean pageBean=patentsService.getPatentsPageBean(studentNumber,patentsType,currentPage,pageSize);
        model.addAttribute("pageBean",pageBean);
        model.addAttribute("studentNumber",studentNumber);
        model.addAttribute("patentsType",patentsType);
        return "information/patents";
    }
}
