package service;

import pojo.PageBean;

import java.util.List;

public interface TrainService
{
    PageBean getPageBean(Integer currentPage,Integer pageSize);

    PageBean  getTrainImportPageBean(String trainContent, String trainTime, Integer currentPage, Integer pageSize);


    PageBean getTrainPageBean(String studentNumber, String trainTime, String trainContent, String trainDepartment, Integer currentPage, Integer pageSize);

    List<String> getTrainContentByYear(String trainTime);
}
