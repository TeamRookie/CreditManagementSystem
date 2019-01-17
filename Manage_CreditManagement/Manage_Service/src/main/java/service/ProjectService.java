package service;

import pojo.PageBean;
import pojo.Projectrules;
import pojo.Projecttype;

import java.util.List;

public interface ProjectService
{
    List<Projectrules> getProjectRules();
    PageBean getPageBean(Integer pageSize, Integer currentPage);
    PageBean getProjectImportPageBean(String projectTime, String projectName,Integer pageSize, Integer currentPage);
    void deleteProjectTypeById(Integer id);

    void addProjectType(Projecttype projecttype);
    PageBean getProjectPageBean(String studentNumber, String projectTime, String projectType, String projectId, String projectLevel, String projectScore, Integer currentPage, Integer pageSize);
}
