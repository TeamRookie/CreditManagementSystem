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
    public  String getTrain(Model model,String studentNumber,String trainTime,String trainContent,String trainDepartment,Integer currentPage)
    {
        PageBean pageBean=trainService.getTrainPageBean(studentNumber,trainTime,trainContent,trainDepartment,currentPage,pageSize);
        model.addAttribute("trainTime",trainTime);
        model.addAttribute("trainContent",trainContent);
        model.addAttribute("studentNumber",studentNumber);
        model.addAttribute("pageBean",pageBean);
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
    public String addTrainType(String trainContent)
    {
        trainService.addTrainImport(trainContent);
        return "redirect:trainImport.action";
    }
    @RequestMapping("/deleteTrainType")
    public  String deleteTrainType(Integer id)
    {
        trainService.deleteTrainType(id);
        return "redirect:trainImport.action";
    }
}
