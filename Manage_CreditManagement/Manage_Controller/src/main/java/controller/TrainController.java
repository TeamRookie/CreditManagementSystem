package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import pojo.PageBean;
import pojo.Train;
import service.TrainService;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.List;

@Controller
public class TrainController
{
    @Value("${PageSize}")
    private  Integer pageSize;
    @Autowired
    private TrainService trainService;
    @RequestMapping("/trainRules")
    public String getTrainRules(Model model,Integer currentPage)
    {
        PageBean pageBean = trainService.getPageBean(currentPage, pageSize);
        model.addAttribute("pageBean",pageBean);
        return "rules/trainRules";
    }
    @RequestMapping("/trainImport")
    public  String getTrainImport(Model model,String trainContent,String trainTime,Integer currentPage)
    {
        PageBean pageBean = trainService.getTrainImportPageBean(trainContent, trainTime, currentPage, pageSize);
        model.addAttribute("pageBean",pageBean);
        model.addAttribute("trainContent",trainContent);
        model.addAttribute("trainTime",trainTime);
        return "import/trainImport";
    }
    @RequestMapping("/train")
    public  String getTrain(Model model,String studentNumber,String faculty,String major,String grade,String trainTime,String trainContent,String trainDepartment,Integer currentPage)
    {
        PageBean pageBean=trainService.getTrainPageBean(studentNumber,faculty,major,grade,trainTime,trainContent,trainDepartment,currentPage,pageSize);
        model.addAttribute("trainTime",trainTime);
        model.addAttribute("trainContent",trainContent);
        model.addAttribute("studentNumber",studentNumber);
        model.addAttribute("pageBean",pageBean);
        model.addAttribute("faculty",faculty);
        model.addAttribute("major",major);
        model.addAttribute("grade",grade);
        return  "information/train";
    }
    @RequestMapping("/getTrainContent")
    @ResponseBody
    public List<String> getTrainContent()
    {
        List<String>  trainList=trainService.getTrainContent();
        return  trainList;
    }
    @RequestMapping(value = "/addTrainType",method = RequestMethod.POST)
    public String addTrainType(String trainTime,String trainContent)
    {
        trainService.addTrainImport(trainTime,trainContent);
        return "redirect:trainImport.action";
    }
    @RequestMapping("/deleteTrainType")
    public  String deleteTrainType(Integer id)
    {
        trainService.deleteTrainType(id);
        return "redirect:trainImport.action";
    }
    @RequestMapping("/trainDownload")
    @ResponseBody
    public String trainDownload(HttpServletResponse response, String name, String faculty, String major, String grade, String date,String trainTime,String trainContent)
    {
        try{
            ServletOutputStream out=response.getOutputStream();
            try {
                //设置文件头：最后一个参数是设置下载文件名(这里我们叫：张三.pdf)
                response.setHeader("Content-Disposition", "attachment;fileName=" + URLEncoder.encode(name+".xlsx", "UTF-8"));
            } catch (UnsupportedEncodingException e1) {
                e1.printStackTrace();
            }

            String[] titles = {"学号","姓名","学院","专业","班级","培训内容","培训时间","培训地点","校内组织单位","负责教师","学分"};
            trainService.trainExport(titles, out,faculty,major,grade,date,trainContent,trainTime);
            return "success";
        } catch(Exception e){
            e.printStackTrace();
            return "导出信息失败";
        }
    }
}
