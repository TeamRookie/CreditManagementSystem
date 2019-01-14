package service;

import pojo.PageBean;
import pojo.Productionrules;

import java.util.List;

public interface ProductionService
{
    List<Productionrules> getProductionRules();
    PageBean getPageBean(Integer pageSize, Integer currentPage);
}
