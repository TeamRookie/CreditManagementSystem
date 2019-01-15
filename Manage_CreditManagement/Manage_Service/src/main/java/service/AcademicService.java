package service;

import pojo.AcademicPageBean;
import pojo.Academicrules;
import pojo.PageBean;


import java.util.List;

public interface AcademicService
{

    PageBean getPageBean(Integer pageSize, Integer currentPage);
    List<Academicrules> getAcademicRules();
    AcademicPageBean getAcademicPageBean(String stuNum, String date, Integer pageSize, Integer currentPage);
}
