package service;

public interface ChangePasswordService
{
    int checkOldPassword(String name,String oldPassword);
    int changePassword(String name,String newPassword);
}
