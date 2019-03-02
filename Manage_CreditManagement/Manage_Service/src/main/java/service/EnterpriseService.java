package service;

import pojo.PageBean;

import javax.servlet.ServletOutputStream;

public interface EnterpriseService
{
    PageBean getPageBean(Integer currentPage,Integer pageSize);


    PageBean getEnterprisePageBean(String studentNumber, String faculty, String major, String grade, String enterpriseType, String enterpriseTime, Integer currentPage, Integer pageSize);

    void enterpriseExport(String[] titles, ServletOutputStream out, String faculty, String major, String grade, String date);
}
