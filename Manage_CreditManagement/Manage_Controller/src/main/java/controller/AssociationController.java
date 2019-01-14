package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import pojo.PageBean;
import pojo.Type;
import service.AssociationService;
import service.TypeService;

import java.util.List;
@Controller
public class AssociationController
{
    @Value("${PageSize}")
    private  Integer pageSize;
    @Autowired
    private AssociationService associationService;
    @RequestMapping("/associationRules")
    public  String getAssociationRules(Model model,Integer currentPage)
    {
        PageBean pageBean=associationService.getPageBean(pageSize,currentPage);
        model.addAttribute("pageBean",pageBean);
        return "rules/associationRules";
    }
    @RequestMapping("/association")
    public  String getAssociation(Model model)
    {
        return  "association";
    }
}
