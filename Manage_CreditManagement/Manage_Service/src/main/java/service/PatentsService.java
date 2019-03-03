package service;

import pojo.PageBean;

import javax.servlet.ServletOutputStream;

public interface PatentsService
{
    PageBean getPageBean(Integer currentPage,Integer pageSize);



    PageBean getPatentsPageBean(String studentNumber, String faculty, String major, String grade,String patentType, Integer currentPage, Integer pageSize);

    void patentsExport(String[] titles, ServletOutputStream out, String faculty, String major, String grade, String patentsType, String date);
}
