package service;

import pojo.Contestrules;
import pojo.PageBean;
import java.util.List;

public interface ContestService
{
    List<Contestrules> getContestRules();
    PageBean getPageBean(Integer pageSize,Integer currentPage);
}

