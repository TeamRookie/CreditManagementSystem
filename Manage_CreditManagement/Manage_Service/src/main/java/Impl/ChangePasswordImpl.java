package Impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import service.ChangePasswordService;

@Service
@Transactional
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
