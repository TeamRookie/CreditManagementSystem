package service;

import pojo.Credentialrules;
import pojo.Credentialtype;
import pojo.PageBean;

import javax.servlet.ServletOutputStream;
import java.util.List;

public interface CredentialService
{
    List<Credentialrules> getCredentialRules();
    PageBean getPageBean(Integer pageSize, Integer currentPage);

    PageBean  getCredentialImportPageBean(String information, Integer currentPage, Integer pageSize);

    void addCredentialType(String addInformation);

    void deleteCredentialTypeById(Integer id);

    PageBean getCredentialPageBean(String studentNumber, String faculty, String major, String grade,String credentialTime, String credentialType, Integer currentPage, Integer pageSize);

    List<Credentialtype> getAllCredentialType();

    void credentialExport(String[] titles, ServletOutputStream out, String faculty, String major, String grade, String date, String type);
}
