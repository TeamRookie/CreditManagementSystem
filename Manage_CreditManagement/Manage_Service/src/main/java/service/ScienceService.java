package service;

import pojo.PageBean;

public interface ScienceService
{
    PageBean getSciencePageBean(String studentNumber, String faculty, String major, String grade, String scienceType, String scienceTime, String scienceLevel, Integer pageSize, Integer currentPage);

    PageBean getScienceRulesPageBean(Integer currentPage, Integer pageSize);
}
