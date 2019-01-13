package controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import pojo.Type;
import service.ChangePasswordService;
import service.TypeService;

import java.util.List;

@Controller
public class PasswordController
{
    @Value("${PageSize}")
    private  Integer pageSize;
    @Autowired
    private TypeService typeService;
    @Autowired
    private ChangePasswordService changePasswordService;
    @RequestMapping(value = "/changePassword",method = RequestMethod.POST)
    public String changePassword(Model model, String name, String oldPassword, String newPassword )
    {
        List<Type> typeList = typeService.getAllType();
        model.addAttribute("typeList",typeList);
        int check=-1;
        if (oldPassword==null|| StringUtils.isEmpty(oldPassword)||newPassword==null||StringUtils.isEmpty(newPassword)||name==null||StringUtils.isEmpty(name))
        {
            model.addAttribute("check",check);
            return  "changePassword";
        }
        else
        return "changePassword";
    }
}
