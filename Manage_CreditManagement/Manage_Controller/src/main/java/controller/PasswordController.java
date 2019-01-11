package controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PasswordController
{

    @RequestMapping("/changePassword")
    public String changePassword(String id,String oldPassword,String newPassword )
    {

        return "hello";
    }
}
