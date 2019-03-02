package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import pojo.Associationtype;
import pojo.PageBean;
import pojo.Type;
import service.AssociationService;
import service.TypeService;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
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
    public  String getAssociation(Model model,Integer currentPage,String studentNumber,String faculty,String major,String grade,String associationTime, String associationName,String associationLevel)
    {
         PageBean pageBean=associationService.getAssociationPageBean(studentNumber,faculty,major,grade,associationTime,associationName,associationLevel,currentPage,pageSize);
         model.addAttribute("studentNumber",studentNumber);
         model.addAttribute("associationName",associationName);
         model.addAttribute("associationLevel",associationLevel);
         model.addAttribute("associationTime",associationTime);
         model.addAttribute("pageBean",pageBean);
        model.addAttribute("faculty",faculty);
        model.addAttribute("major",major);
        model.addAttribute("grade",grade);
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
    @RequestMapping("/associationDownload")
    @ResponseBody
    public String associationDownload(HttpServletResponse response, String name, String faculty, String major, String grade, String date,String associationName,String associationTime,String associationLevel)
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

            String[] titles = {"学号","姓名","学院","专业","班级","创建时间","社团名称","社团级别","团队职责","指导教师","学分"};
            associationService.associationExport(titles, out,faculty,major,grade,date,associationName,associationTime,associationLevel);
            return "success";
        } catch(Exception e){
            e.printStackTrace();
            return "导出信息失败";
        }
    }
}
