package Impl;

import org.springframework.stereotype.Service;
import service.ChangePasswordService;

@Service
public class ChangePasswordImpl implements ChangePasswordService
{
    @Override
    public int checkOldPassword(String name, String oldPassword)
    {

        return 0;
    }

    @Override
    public int changePassword(String name, String newPassword)
    {
        return 0;
    }
}
