package service;

import pojo.PageBean;
import pojo.Safetyrules;

import javax.servlet.ServletOutputStream;
import java.util.List;

public interface SafetyService
{
    List<Safetyrules> getSafetyRules();
    PageBean getPageBean(Integer pageSize, Integer currentPage);

    PageBean getSafetyPageBean(String studentNumber, String faculty, String major, String grade,String safetyTime, Integer currentPage, Integer pageSize);

    void safetyExport(String[] titles, ServletOutputStream out, String faculty, String major, String grade, String date);
}
