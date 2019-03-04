package service;

import pojo.PageBean;

import javax.servlet.ServletOutputStream;

public interface ScienceService
{
    PageBean getSciencePageBean(String studentNumber, String faculty, String major, String grade, String scienceType, String scienceTime, String scienceLevel, Integer pageSize, Integer currentPage);

    PageBean getScienceRulesPageBean(Integer currentPage, Integer pageSize);

    void scienceExport(String[] titles, ServletOutputStream out, String faculty, String major, String grade, String startTime, String scienceLevel, String scienceType);
}
