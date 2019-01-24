package service;

import pojo.PageBean;

public interface ScienceService
{
    PageBean getSciencePageBean(String studentNumber, String scienceType, String scienceTime, String scienceLevel, Integer pageSize, Integer currentPage);
}
