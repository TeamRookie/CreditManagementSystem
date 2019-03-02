package Impl;

import mapper.AdminMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pojo.Admin;
import pojo.AdminExample;
import service.ChangePasswordService;

import java.util.List;

@Service
@Transactional
public class ChangePasswordImpl implements ChangePasswordService
{
    @Autowired
    private AdminMapper adminMapper;
    @Override
    public int checkPassword(String name,String password)
    {
        /*

         * @Author: shize duan

         * @param : id 管理员id password 管理员密码

         * @return : 1为账号密码验证正确

         * @Description:

         * 修改管理员密码之前首先验证输入的账号以及原密码是否正确

         */
        AdminExample adminExample=new AdminExample();
        final AdminExample.Criteria criteria = adminExample.createCriteria();
        criteria.andPasswordEqualTo(password);
        criteria.andAdminnameEqualTo(name);
        List<Admin> administrators = adminMapper.selectByExample(adminExample);
        if(administrators!=null&&administrators.size()!=0)
        {
            return 1;
        }
        else
            return 0;

    }

    @Override
    public int changePassword(String name,String password,String newPassword)
    {
        /*

         * @Author: shize duan

         * @param : id 管理员账号 password 管理员原密码 newPassword 管理员新密码

         * @return : 1 代表修改成功 0表示出错

         * @Description:

         * 修改管理员密码

         */
        Admin admin=new Admin();
        int check = checkPassword(name, password);
        admin.setAdminname(name);
        admin.setPassword(newPassword);
        admin.setRole("1");
        int updateCheck=0;
        if(check==1)
        {
            updateCheck= adminMapper.updateByPrimaryKey(admin);
            return  updateCheck;
        }
        else
            return  0;

    }


}
