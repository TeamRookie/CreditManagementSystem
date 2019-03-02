package service;

import pojo.Associationrules;
import pojo.Associationtype;
import pojo.PageBean;

import javax.servlet.ServletOutputStream;
import java.util.List;

public interface AssociationService
{
    PageBean getPageBean(Integer pageSize,Integer currentPage);
    List<Associationrules> getAssociationRules();

    PageBean getAssociationImportPageBean(String associationName, String associationTime, Integer currentPage, Integer pageSize);

    void addAssociationType(Associationtype associationtype);

    void deleteAssociationTypeById(Integer id);

    PageBean getAssociationPageBean(String studentNumber, String faculty, String major, String grade, String associationTime, String associationName, String associationLevel, Integer currentPage, Integer pageSize);

    void associationExport(String[] titles, ServletOutputStream out, String faculty, String major, String grade, String date, String associationName, String associationTime, String associationLevel);
}
