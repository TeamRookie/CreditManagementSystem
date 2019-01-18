package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import pojo.Associationtype;
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
    public  String getAssociation(Model model,Integer currentPage,String studentNumber,String associationTime, String associationName,String associationLevel)
    {
         PageBean pageBean=associationService.getAssociationPageBean(studentNumber,associationTime,associationName,associationLevel,currentPage,pageSize);
         model.addAttribute("studentNumber",studentNumber);
         model.addAttribute("associationName",associationName);
         model.addAttribute("associationLevel",associationLevel);
         model.addAttribute("associationTime",associationTime);
         model.addAttribute("pageBean",pageBean);
        return  "information/association";
    }
    @RequestMapping("/associationImport")
    public  String getAssociationImport(Model model,String associationName,String associationTime,Integer currentPage)
    {
        PageBean pageBean = associationService.getAssociationImportPageBean(associationName, associationTime, currentPage, pageSize);
        model.addAttribute("pageBean",pageBean);
        model.addAttribute("associationName",associationName);
        model.addAttribute("associationTime",associationTime);
        return "import/associationImport";
    }
    @RequestMapping(value = "/addAssociationType",method = RequestMethod.POST)
    public  String addAssociationType(Associationtype associationtype)
    {
        if (associationtype!=null&&associationtype.getAssociationname()!=null&&!associationtype.getAssociationname().isEmpty()&&associationtype.getAssociationtime()!=null&&!associationtype.getAssociationtime().isEmpty()&&associationtype.getAssociationlevel()!=null&&!associationtype.getAssociationlevel().isEmpty())
        {
            associationService.addAssociationType(associationtype);
        }
        return "redirect:associationImport.action";
    }
    @RequestMapping("/deleteAssociationType")
    public String deleteAssociationType(Integer id)
    {
        associationService.deleteAssociationTypeById(id);
        return "redirect:associationImport.action";
    }
}
