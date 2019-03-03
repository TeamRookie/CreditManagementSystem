package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pojo.PageBean;
import service.PatentsService;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.ResponseWrapper;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

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
    public  String getPatents(Model model,Integer currentPage,String patentsType,String studentNumber,String faculty,String major,String grade)
    {
        PageBean pageBean=patentsService.getPatentsPageBean(studentNumber,faculty,major,grade,patentsType,currentPage,pageSize);
        model.addAttribute("pageBean",pageBean);
        model.addAttribute("studentNumber",studentNumber);
        model.addAttribute("patentsType",patentsType);
        model.addAttribute("faculty",faculty);
        model.addAttribute("major",major);
        model.addAttribute("grade",grade);
        return "information/patents";
    }
    @RequestMapping("/patentsDownload")
    public   @ResponseBody
    String patentsExport(HttpServletResponse response, String name, String faculty, String major, String grade, String patentsType , String date)
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

            String[] titles = {"学号","姓名","学院","专业","班级","团队职责","专利类型","申请号","申请日","申请人","发明人","专利名称","学分"};
            patentsService.patentsExport(titles, out,faculty,major,grade,patentsType,date);
            return "success";
        } catch(Exception e){
            e.printStackTrace();
            return "导出信息失败";
        }
    }
}
