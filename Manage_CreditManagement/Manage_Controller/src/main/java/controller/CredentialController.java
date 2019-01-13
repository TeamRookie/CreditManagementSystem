package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import pojo.Credentialrules;
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
    private TypeService typeService;
    @Autowired
    private CredentialService credentialService;
    @RequestMapping("/credentialRules")
    public  String getCredentialRules(Model model)
    {
        List<Credentialrules> credentialRulesList = credentialService.getCredentialRules();
        List<Type> typeList = typeService.getAllType();
        model.addAttribute("typeList",typeList);
        model.addAttribute("credentialRulesList",credentialRulesList);
        return  "credentialRules";
    }
    @RequestMapping("/credential")
    public  String getCredential(Model model)
    {
        List<Type> typeList = typeService.getAllType();
        model.addAttribute("typeList",typeList);
        return  "credential";
    }
}
