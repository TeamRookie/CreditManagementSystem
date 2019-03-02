package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pojo.PageBean;
import pojo.Type;
import service.ProductionService;
import service.TypeService;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.List;

@Controller
public class ProductionController
{
    @Value("${PageSize}")
    private  Integer pageSize;
    @Autowired
    private ProductionService productionService;
    @RequestMapping("/productionRules")
    public  String getProductionRules(Model model,Integer currentPage)
    {
        PageBean pageBean = productionService.getPageBean(pageSize, currentPage);
        model.addAttribute("pageBean",pageBean);
        return "rules/productionRules";
    }
    @RequestMapping("/production")
    public  String getProduction(Model model,String faculty,String major,String grade,String productionType,String productionTime,Integer currentPage,String studentNumber)
    {
        PageBean pageBean=productionService.getProductionPageBean(studentNumber,faculty,major,grade,productionType,productionTime,currentPage,pageSize);
        model.addAttribute("studentNumber",studentNumber);
        model.addAttribute("productionType",productionType);
        model.addAttribute("productionTime",productionTime);
        model.addAttribute("pageBean",pageBean);
        model.addAttribute("faculty",faculty);
        model.addAttribute("major",major);
        model.addAttribute("grade",grade);
        return  "information/production";
    }
    @RequestMapping("/productionDownload")
    @ResponseBody
    public String productionDownload(HttpServletResponse response, String name, String faculty, String major, String grade, String date,String productionTime,String productionType)
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

            String[] titles = {"学号","姓名","学院","专业","班级","发布时间","论文(文章,作品)名称","类型","题名","职责","作者","来源","学分"};
            productionService.productionExport(titles, out,faculty,major,grade,date,productionTime,productionType);
            return "success";
        } catch(Exception e){
            e.printStackTrace();
            return "导出信息失败";
        }
    }
}
