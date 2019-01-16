package service;

import pojo.Associationrules;
import pojo.Associationtype;
import pojo.PageBean;

import java.util.List;

public interface AssociationService
{
    PageBean getPageBean(Integer pageSize,Integer currentPage);
    List<Associationrules> getAssociationRules();

    PageBean getAssociationImportPageBean(String associationName, String associationTime, Integer currentPage, Integer pageSize);

    void addAssociationType(Associationtype associationtype);

    void deleteAssociationTypeById(Integer id);
}
