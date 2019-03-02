package service;


public interface ChangePasswordService
{
    int checkPassword(String name, String password);
    int changePassword(String name, String password, String newPassword);
}
