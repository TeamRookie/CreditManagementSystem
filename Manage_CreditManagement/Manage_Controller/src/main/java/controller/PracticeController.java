package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import pojo.PageBean;
import pojo.Practicetype;
import service.PracticeService;

@Controller
public class PracticeController
{
    @Value("${PageSize}")
    private  Integer pageSize;
    @Autowired
    private PracticeService practiceService;
    @RequestMapping("/practiceRules")
    public  String getPracticeRules(Model model,Integer currentPage)
    {
        PageBean pageBean = practiceService.getPageBean(pageSize, currentPage);
        model.addAttribute("pageBean",pageBean);
        return "rules/practiceRules";
    }
    @RequestMapping("/practice")
    public  String getPractice(Model model)
    {
        return  "practice";
    }
    @RequestMapping("/practiceImport")
    public  String getPracticeImport(Model model,String practiceTime,String practiceName,Integer currentPage)
    {
        PageBean pageBean = practiceService.getPracticeImportPageBean(practiceTime, practiceName, currentPage, pageSize);
        model.addAttribute("pageBean",pageBean);
        model.addAttribute("practiceName",practiceName);
        model.addAttribute("practiceTime",practiceTime);
        return "import/practiceImport";
    }
    @RequestMapping(value = "/addPracticeType",method = RequestMethod.POST)
    public  String addPracticeType(Practicetype practicetype)
    {
        if(practicetype!=null&&practicetype.getPracticename()!=null&&!practicetype.getPracticename().isEmpty()&&practicetype.getPracticetime()!=null&&!practicetype.getPracticetime().isEmpty()&&practicetype.getType()!=null&&!practicetype.getType().isEmpty())
        {
            practiceService.addPracticeType(practicetype);
        }
        return "redirect:practiceImport.action";
    }
}
