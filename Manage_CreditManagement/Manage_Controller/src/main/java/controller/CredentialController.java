package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import pojo.PageBean;
import pojo.Type;
import service.CredentialService;
import service.TypeService;

import java.util.List;
@Controller
public class CredentialController
{
    @Value("${PageSize}")
    private  Integer pageSize;
    @Autowired
    private CredentialService credentialService;
    @RequestMapping("/credentialRules")
    public  String getCredentialRules(Model model,Integer currentPage)
    {
        PageBean pageBean = credentialService.getPageBean(pageSize, currentPage);
        model.addAttribute("pageBean",pageBean);
        return "rules/credentialRules";
    }
    @RequestMapping("/credential")
    public  String getCredential(Model model)
    {
        return  "credential";
    }
}