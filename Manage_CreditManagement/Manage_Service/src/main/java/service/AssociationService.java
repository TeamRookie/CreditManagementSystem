package service;

import pojo.Associationrules;
import pojo.PageBean;

import java.util.List;

public interface AssociationService
{
    PageBean getPageBean(Integer pageSize,Integer currentPage);
    List<Associationrules> getAssociationRules();
}
