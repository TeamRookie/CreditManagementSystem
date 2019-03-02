package service;

import pojo.Academicrules;
import pojo.PageBean;


import javax.servlet.ServletOutputStream;
import java.util.List;

public interface AcademicService
{

    PageBean getPageBean(Integer pageSize, Integer currentPage);
    List<Academicrules> getAcademicRules();
    void  academicExport(String[] titles , ServletOutputStream outputStream,String faculty, String major, String grade, String department, String date);
    PageBean getAcademicPageBean(String studentNumber, String faculty, String major, String grade, String academicTime, String academicDepartment, Integer currentPage, Integer pageSize);
}
