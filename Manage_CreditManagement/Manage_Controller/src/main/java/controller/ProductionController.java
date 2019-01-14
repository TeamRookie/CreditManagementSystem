package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import pojo.PageBean;
import pojo.Type;
import service.ProductionService;
import service.TypeService;

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
    public  String getProduction(Model model)
    {
        return  "production";
    }
}
