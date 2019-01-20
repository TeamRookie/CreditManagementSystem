package service;

import pojo.PageBean;

import java.util.List;

public interface TrainService
{


    PageBean  getTrainImportPageBean(String trainContent, String trainTime, Integer currentPage, Integer pageSize);


    PageBean getTrainPageBean(String studentNumber, String trainTime, String trainContent, String trainDepartment, Integer currentPage, Integer pageSize);



    List<String> getTrainContent();

    void addTrainImport(String trainContent);

    void deleteTrainType(Integer id);

    PageBean getPageBean(Integer currentPage, Integer pageSize);
}
