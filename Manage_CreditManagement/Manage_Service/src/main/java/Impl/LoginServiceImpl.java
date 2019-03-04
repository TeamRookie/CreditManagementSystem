package Impl;


import mapper.AdminMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pojo.Admin;
import service.LoginService;

@Service
@Transactional
public class LoginServiceImpl implements LoginService
{
    @Autowired
    private AdminMapper adminMapper;
    @Override
    public boolean authentication(Admin admin)
    {
        /*

         * @Author: shize duan

         * @param : admin 管理员账号密码

         * @return : 验证管理员信息

         * @Description:

         * 管理员登录验证

         */
        Admin adminCheck = adminMapper.selectByPrimaryKey(admin.getAdminname());
        if (adminCheck==null||!(adminCheck.getPassword().equals(admin.getPassword()))||(adminCheck.getRole()!=1))
        {
            return  false;
        }
        admin.setRole(1);
        return  true;
    }
}
