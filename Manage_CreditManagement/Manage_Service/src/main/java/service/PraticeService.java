package service;

import pojo.PageBean;
import pojo.Practicerules;

import java.util.List;

public interface PraticeService
{
    List<Practicerules> getPracticeRules();
    PageBean getPageBean(Integer pageSize, Integer currentPage);
}
