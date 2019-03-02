package service;

import pojo.PageBean;
import pojo.Projectrules;
import pojo.Projecttype;

import javax.servlet.ServletOutputStream;
import java.util.List;

public interface ProjectService
{
    List<Projectrules> getProjectRules();
    PageBean getPageBean(Integer pageSize, Integer currentPage);
    PageBean getProjectImportPageBean(String projectTime, String projectName,Integer pageSize, Integer currentPage);
    void deleteProjectTypeById(Integer id);

    void addProjectType(Projecttype projecttype);
    PageBean getProjectPageBean(String studentNumber, String faculty, String major, String grade, String projectTime, String projectType, String projectId, String projectLevel, String projectScore, Integer currentPage, Integer pageSize);

    void projectExport(String[] titles, ServletOutputStream out, String faculty, String major, String grade, String date, String projectLevel, String projectId, String score, String projectType);
}
