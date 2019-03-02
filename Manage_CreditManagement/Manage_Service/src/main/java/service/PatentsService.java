package service;

import pojo.PageBean;

public interface PatentsService
{
    PageBean getPageBean(Integer currentPage,Integer pageSize);



    PageBean getPatentsPageBean(String studentNumber, String faculty, String major, String grade,String patentType, Integer currentPage, Integer pageSize);
}
