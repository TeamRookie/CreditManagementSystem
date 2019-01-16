package service;

import pojo.Credentialrules;
import pojo.PageBean;

import java.util.List;

public interface CredentialService
{
    List<Credentialrules> getCredentialRules();
    PageBean getPageBean(Integer pageSize, Integer currentPage);

    PageBean  getCredentialImportPageBean(String information, Integer currentPage, Integer pageSize);

    void addCredentialType(String addInformation);

    void deleteCredentialTypeById(Integer id);
}
