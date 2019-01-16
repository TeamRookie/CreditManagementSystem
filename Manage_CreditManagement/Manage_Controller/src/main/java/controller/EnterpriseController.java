package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import pojo.PageBean;
import service.EnterpriseService;

@Controller
public class EnterpriseController
{
    @Value("${PageSize}")
    private  Integer pageSize;
    @Autowired
    private EnterpriseService enterpriseService;
    @RequestMapping("/enterpriseRules")
    public  String getEnterpriseRules(Model model,Integer currentPage)
    {
        PageBean pageBean = enterpriseService.getPageBean(currentPage, pageSize);
        model.addAttribute("pageBean",pageBean);
        return  "rules/enterpriseRules";
    }
}
