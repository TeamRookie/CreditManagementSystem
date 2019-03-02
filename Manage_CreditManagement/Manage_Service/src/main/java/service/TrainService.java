package service;

import org.springframework.util.StringUtils;
import pojo.PageBean;

import javax.servlet.ServletOutputStream;
import java.util.List;

public interface TrainService
{


    PageBean  getTrainImportPageBean(String trainContent, String trainTime, Integer currentPage, Integer pageSize);


    PageBean getTrainPageBean(String studentNumber, String faculty, String major, String grade, String trainTime, String trainContent, String trainDepartment, Integer currentPage, Integer pageSize);



    List<String> getTrainContent();

    void addTrainImport(String trainTime,String trainContent);

    void deleteTrainType(Integer id);

    PageBean getPageBean(Integer currentPage, Integer pageSize);

    void trainExport(String[] titles, ServletOutputStream out, String faculty, String major, String grade, String date, String trainContent, String trainTime);
}
