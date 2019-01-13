package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import pojo.Productionrules;
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
    private TypeService typeService;
    @Autowired
    private ProductionService productionService;
    @RequestMapping("/productionRules")
    public  String getProductionRules(Model model)
    {
        List<Productionrules> productionRulesList = productionService.getProductionRules();
        List<Type> typeList = typeService.getAllType();
        model.addAttribute("productionRulesList",productionRulesList);
        model.addAttribute("typeList",typeList);
        return  "productionRules";
    }
    @RequestMapping("/production")
    public  String getProduction(Model model)
    {
        List<Type> typeList = typeService.getAllType();
        model.addAttribute("typeList",typeList);
        return  "production";
    }
}
