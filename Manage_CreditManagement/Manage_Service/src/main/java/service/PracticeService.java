package service;

import pojo.PageBean;
import pojo.Practicerules;
import pojo.Practicetype;

import javax.servlet.ServletOutputStream;
import java.util.List;

public interface PracticeService
{
    List<Practicerules> getPracticeRules();
    PageBean getPageBean(Integer pageSize, Integer currentPage);

    PageBean getPracticeImportPageBean(String practiceTime, String practiceName, String practiceType, String practiceLevel, String practiceScore, Integer currentPage, Integer pageSize);

    void addPracticeType(Practicetype practicetype);



    PageBean getPracticePageBean( String faculty, String major, String grade,String practiceName, String practiceTime, String practiceType, String practiceLevel, String practiceScore, Integer currentPage, Integer pageSize);

    void deletePracticeTypeById(Integer id);

    void practiceExport(String[] titles, ServletOutputStream out, String faculty, String major, String grade, String date, String practiceLevel, String practiceName, String practiceScore, String practiceType);
}
