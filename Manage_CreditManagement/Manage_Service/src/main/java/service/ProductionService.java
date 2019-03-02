package service;

import pojo.PageBean;
import pojo.Productionrules;

import javax.servlet.ServletOutputStream;
import java.util.List;

public interface ProductionService
{
    List<Productionrules> getProductionRules();
    PageBean getPageBean(Integer pageSize, Integer currentPage);

    PageBean getProductionPageBean(String studentNumber, String faculty, String major, String grade, String productionType, String productionTime, Integer currentPage, Integer pageSize);

    void productionExport(String[] titles, ServletOutputStream out, String faculty, String major, String grade, String date, String productionTime, String productionType);
}
