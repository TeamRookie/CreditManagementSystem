package service;

import pojo.Academicrules;
import pojo.PageBean;


import java.util.List;

public interface AcademicService
{

    PageBean getPageBean(Integer pageSize, Integer currentPage);
    List<Academicrules> getAcademicRules();

    PageBean getAcademicPageBean(String studentNumber, String academicTime, String academicDepartment, Integer currentPage, Integer pageSize);
}
