package service;

import pojo.PageBean;

public interface TrainService
{
    PageBean getPageBean(Integer currentPage,Integer pageSize);

    PageBean  getTrainImportPageBean(String trainContent, String trainTime, Integer currentPage, Integer pageSize);
}
