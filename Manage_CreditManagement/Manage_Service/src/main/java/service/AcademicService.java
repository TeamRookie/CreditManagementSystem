package service;

import pojo.Academicrules;
import pojo.PageBean;


import java.util.List;

public interface AcademicService
{

    PageBean getPageBean(Integer pageSize, Integer currentPage);
    List<Academicrules> getAcademicRules();
}
