package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import pojo.PageBean;
import pojo.Studiotype;
import pojo.Type;
import service.StudioService;
import service.TypeService;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
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
    public String getStudio(Model model,String studentNumber,String faculty,String major,String grade,String studioTime,String studioDepartment,String studioName,String studioLevel,Integer currentPage)
    {
        PageBean pageBean=studioService.getStudioPageBean(studentNumber,faculty,major,grade,studioTime,studioDepartment,studioName,studioLevel,currentPage,pageSize);
        model.addAttribute("pageBean",pageBean);
        model.addAttribute("studentNumber",studentNumber);
        model.addAttribute("studioTime",studioTime);
        model.addAttribute("studioDepartment",studioDepartment);
        model.addAttribute("studioName",studioName);
        model.addAttribute("studioLevel",studioLevel);
        model.addAttribute("faculty",faculty);
        model.addAttribute("major",major);
        model.addAttribute("grade",grade);
        return "information/studio";
    }

    @RequestMapping("/studioImport")
    public String getStudioImport(Model model,String date, String studioName, String studioLevel,String studioDepartment, Integer currentPage)
    {
        PageBean pageBean = studioService.getStudioImportPageBean(studioName, studioLevel,studioDepartment ,date,currentPage, pageSize);

        model.addAttribute("pageBean", pageBean);
        model.addAttribute("studioName", studioName);
        model.addAttribute("studioLevel", studioLevel);
        model.addAttribute( "studioTime",date );

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
        if (studiotype!=null&&studiotype.getStudiolevel()!=null&&!studiotype.getStudiolevel().isEmpty()&&studiotype.getStudioname()!=null&&!studiotype.getStudioname().isEmpty())
        {
            studioService.addStudioType(studiotype);
        }
        return "redirect:studioImport.action";
    }
    @RequestMapping("/getAllStudioName")
    @ResponseBody
    public List<String> getAllStudioName()
    {
        List<String> nameList= studioService.getAllStudioName();
        return  nameList;
    }
    @RequestMapping("/studioDownload")
    @ResponseBody
    public  String studioDownload(HttpServletResponse response, String name, String faculty, String major, String grade, String date,String studioName,String studioTime,String studioLevel,String department)
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

            String[] titles = {"学号","姓名","学院","专业","班级","参加时间","工作室名称","工作室等级","负责指导教师","团队职责","学分"};
            studioService.studioExport(titles, out,faculty,major,grade,date,studioName,studioLevel,studioTime);
            return "success";
        } catch(Exception e){
            e.printStackTrace();
            return "导出信息失败";
        }
    }
}
