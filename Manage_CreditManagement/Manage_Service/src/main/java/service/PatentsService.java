package service;

import pojo.PageBean;

public interface PatentsService
{
    PageBean getPageBean(Integer currentPage,Integer pageSize);
}
