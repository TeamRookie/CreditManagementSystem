package service;

import pojo.PageBean;

public interface EnterpriseService
{
    PageBean getPageBean(Integer currentPage,Integer pageSize);
}
