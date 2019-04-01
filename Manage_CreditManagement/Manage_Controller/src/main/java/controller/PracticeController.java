package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import pojo.PageBean;
import pojo.Practice;
import pojo.Practicetype;
import service.PracticeService;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.List;

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
    public  String getPractice(Model model,String faculty,String major,String grade,String practiceName,String practiceTime,String practiceType,String practiceLevel,String practiceScore,Integer currentPage)
    {
        PageBean pageBean= practiceService.getPracticePageBean(faculty,major,grade,practiceName,practiceTime,practiceType,practiceLevel,practiceScore,currentPage,pageSize);
        model.addAttribute("pageBean",pageBean);
        model.addAttribute("practiceTime",practiceTime);
        model.addAttribute("practiceType",practiceType);
        model.addAttribute("practiceLevel",practiceLevel);
        model.addAttribute("practiceScore",practiceScore);
        model.addAttribute("currentPage",currentPage);
        model.addAttribute("faculty",faculty);
        model.addAttribute("major",major);
        model.addAttribute("grade",grade);
        return  "information/practice";
    }
    @RequestMapping("/practiceImport")
    public  String getPracticeImport(Model model,String practiceTime,String practiceName,Integer currentPage,String practiceType,String practiceLevel,String practiceScore)
    {
        PageBean pageBean = practiceService.getPracticeImportPageBean(practiceTime, practiceName,practiceType,practiceLevel,practiceScore, currentPage, pageSize);
        model.addAttribute("pageBean",pageBean);
        model.addAttribute("practiceName",practiceName);
        model.addAttribute("practiceTime",practiceTime);
        model.addAttribute( "practiceLevel",practiceLevel );
        model.addAttribute( "practiceType",practiceType );
        model.addAttribute( "practiceScore",practiceScore );
        return "import/practiceImport";
    }
    @RequestMapping(value = "/addPracticeType",method = RequestMethod.POST)
    public  String addPracticeType(Practicetype practicetype)
    {
        if(practicetype!=null&&practicetype.getPracticename()!=null&&!practicetype.getPracticename().isEmpty()&&practicetype.getPracticetime()!=null&&!practicetype.getPracticetime().isEmpty()&&!practicetype.getPracticelevel().isEmpty()&&!practicetype.getScore().isEmpty())
        {
            practiceService.addPracticeType(practicetype);
        }
        return "redirect:practiceImport.action";
    }
    @RequestMapping(value = "/deletePracticeType")
    public  String deletePractice(Integer id)
    {
        if (id!=null&&!(StringUtils.isEmpty(id)))
        {
            practiceService.deletePracticeTypeById(id);
        }
        return  "redirect:practiceImport.action";
    }
    @RequestMapping("/practiceDownload")
    @ResponseBody
    public  String practiceDownload(HttpServletResponse response,String name,  String faculty, String major, String grade, String date,String practiceName,String practiceType,String practiceLevel,String practiceScore)
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

            String[] titles = {"学号","姓名","学院","专业","班级","项目时间","项目类别","项目名称","项目级别","结题成绩","团队成员","指导教师","学分"};
            practiceService.practiceExport(titles, out,faculty,major,grade,date,practiceLevel,practiceName,practiceScore,practiceType);
            return "success";
        } catch(Exception e){
            e.printStackTrace();
            return "导出信息失败";
        }
    }
}
