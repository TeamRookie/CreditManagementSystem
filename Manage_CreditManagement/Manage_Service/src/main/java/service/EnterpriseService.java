package service;

import pojo.PageBean;

public interface EnterpriseService
{
    PageBean getPageBean(Integer currentPage,Integer pageSize);


    PageBean getEnterprisePageBean(String studentNumber, String enterpriseType, String enterpriseTime, Integer currentPage, Integer pageSize);
}
