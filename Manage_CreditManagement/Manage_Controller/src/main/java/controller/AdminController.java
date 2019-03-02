package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import service.ChangePasswordService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class AdminController
{
    @Autowired
    private ChangePasswordService changePasswordService;
    @RequestMapping("/changePassword")
    public  String getChangePassword()
    {
        return  "role/changePassword";
    }
    @RequestMapping("/changePasswordById")
    @ResponseBody
    public String changePasswordById(@RequestParam(defaultValue = "admin") String name, String password, String newPassword)
    {
        /*

         * @Author: shize duan

         * @param : id 管理员id password 管理员密码  newPassword 新密码

         * @return : 返回到修改密码姐界面

         * @Description:

         * 管理员修改密码

         */
        int check=0;
        if((StringUtils.isEmpty(password)||StringUtils.isEmpty(newPassword))||newPassword.length()<8||password.length()<8)
        {
            if (check==0)
                return "fail";
        }
        check = changePasswordService.changePassword(name, password, newPassword);
        if (check==1)
            return  "success";
        else
            return "fail";
    }
    @RequestMapping("/exist")
    public  String existSystem(HttpServletRequest request)
    {
        HttpSession session = request.getSession();
        session.setAttribute("admin",null);
        return "login";
    }
}
