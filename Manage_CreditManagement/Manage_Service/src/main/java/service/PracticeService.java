package service;

import pojo.PageBean;
import pojo.Practicerules;
import pojo.Practicetype;

import java.util.List;

public interface PracticeService
{
    List<Practicerules> getPracticeRules();
    PageBean getPageBean(Integer pageSize, Integer currentPage);

    PageBean getPracticeImportPageBean(String practiceTime, String practiceName, Integer currentPage, Integer pageSize);

    void addPracticeType(Practicetype practicetype);



    PageBean getPracticePageBean(String practiceName, String practiceTime, String practiceType, String practiceLevel, String practiceScore, Integer currentPage, Integer pageSize);
}
