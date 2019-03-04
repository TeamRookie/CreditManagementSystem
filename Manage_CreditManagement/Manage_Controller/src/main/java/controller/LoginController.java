package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import pojo.Admin;

import service.LoginService;

import javax.servlet.http.HttpSession;


@Controller
public class LoginController
{
    @Autowired
    private LoginService loginService;

    @RequestMapping("/index")
    public  String getIndexHtml()
    {
        return  "redirect:getStudent.action";
    }
    @RequestMapping("/login")
    public String adminLogin(Admin admin, HttpSession session)
    {
        System.out.println("admin = "+admin.getAdminname()+"        "+"admin = "+admin.getPassword());
        if ( admin.getAdminname() == null || admin.getPassword() == null || StringUtils.isEmpty(admin.getAdminname()) || StringUtils.isEmpty(admin.getPassword()))
        {
            return "login";
        }
        if (!loginService.authentication(admin))
        {
            return "login";
        }
        else
        {
            session.setAttribute("admin",admin);
        }
        return "redirect:index.action";
    }
    @RequestMapping("/exist")
    public  String existAdmin(HttpSession session)
    {
        session.setAttribute("admin",null);
        return "redirect:login.action";
    }
}
