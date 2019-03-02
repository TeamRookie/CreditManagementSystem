package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import pojo.PageBean;
import pojo.Type;
import service.ContestService;
import service.TypeService;

import javax.print.DocFlavor;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.List;
@Controller
public class ContestController
{

    @Value("${PageSize}")
    private  Integer pageSize;
    @Autowired
    private ContestService contestService;
    @RequestMapping("/contestRules")
    public  String getContestRules(Model model,Integer currrentPage)
    {
        PageBean pageBean = contestService.getPageBean(pageSize, currrentPage);
        model.addAttribute("pageBean",pageBean);
        return "rules/contestRules";
    }
    @RequestMapping("/contest")
    public  String getContest(Model model,String studentNumber,String faculty,String major,String grade,String contestTime,String contestLevel,String contestName,String contestRank,Integer currentPage)
    {
        PageBean pageBean= contestService.getContestPageBean(studentNumber,faculty,major,grade,contestTime,contestLevel,contestName,contestRank,currentPage,pageSize);
        model.addAttribute("pageBean",pageBean);
        model.addAttribute("contestTime",contestTime);
        model.addAttribute("contestLevel",contestLevel);
        model.addAttribute("contestName",contestName);
        model.addAttribute("contestRank",contestRank);
        model.addAttribute("studentNumber",studentNumber);
        model.addAttribute("faculty",faculty);
        model.addAttribute("major",major);
        model.addAttribute("grade",grade);
        return  "information/contest";
    }
    @RequestMapping("/contestImport")
    public  String getContestImport(Model model,Integer currentPage,String contestDate,String contestName)
    {
        PageBean pageBean = contestService.getContestImportPageBean(pageSize, currentPage, contestDate, contestName);
        model.addAttribute("contestDate",contestDate);
        model.addAttribute("contestName",contestName);
        model.addAttribute("pageBean",pageBean);
        return  "import/contestImport";
    }
    @RequestMapping("/deleteContestType")
    public String getContestImport(Integer id)
    {
        if (id!=null&&(!StringUtils.isEmpty(id)))
        {
            contestService.deleteContestTypeById(id);
        }
        return "redirect:contestImport.action";
    }
    @RequestMapping(value = "/addContestType",method = RequestMethod.POST)
    public  String addContestImport(String addContestDate,String addContestName)
    {
        if (addContestDate!=null&&!addContestDate.isEmpty()&&addContestName!=null&&!addContestName.isEmpty())
        {
            contestService.addContestType(addContestDate,addContestName);
        }
        return  "redirect:contestImport.action" ;
    }
    @RequestMapping("/contestDownload")
    @ResponseBody
    public String contestDownload(HttpServletResponse response, String name, String faculty, String major, String grade, String contestName, String contestLevel,String contestRank,String date)
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

            String[] titles = {"学号","姓名","学院","专业","班级","竞赛时间","竞赛名称","作品名称","竞赛级别","获奖等级","证书单位公章","证书落款时间","团队成员","指导教师","学分"};
            contestService.contestExport(titles, out,faculty,major,grade,contestLevel,contestRank,contestName,date);
            return "success";
        } catch(Exception e){
            e.printStackTrace();
            return "导出信息失败";
        }
    }
}
