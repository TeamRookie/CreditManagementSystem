package service;

import pojo.PageBean;
import pojo.Studiorules;
import pojo.Studiotype;

import javax.servlet.ServletOutputStream;
import java.util.List;

public interface StudioService
{
    List<Studiorules> getStudioRules();
    PageBean getPageBean(Integer pageSize, Integer currentPage);

    PageBean getStudioImportPageBean(String studioName, String studioLevel, String studioDepartment,String date, Integer currentPage, Integer pageSize);

    void deleteStudioTypeById(Integer id);

    void addStudioType(Studiotype studiotype);

    PageBean getStudioPageBean(String studentNumber, String faculty, String major, String grade, String studioTime, String studioDepartment, String studioName, String studioLevel, Integer currentPage, Integer pageSize);

    List<String> getAllStudioName();

    void studioExport(String[] titles, ServletOutputStream out, String faculty, String major, String grade, String date, String studioName, String studioLevel, String studioTime);
}
