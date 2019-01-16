package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import pojo.PageBean;
import service.TrainService;

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
}
