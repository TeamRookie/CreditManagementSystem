package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pojo.Years;
import service.YearsService;

import java.util.List;

@Controller
public class YearsController
{
    @Autowired
    private YearsService yearsService;
    @RequestMapping("/getYears")
    @ResponseBody
    public List<Years> getYears()
    {
        List<Years> yearsList = yearsService.getALlYears();
        return  yearsList;
    }
}
