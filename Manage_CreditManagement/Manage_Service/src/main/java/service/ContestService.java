package service;

import pojo.ContestPageBean;
import pojo.Contestrules;
import pojo.Contesttype;
import pojo.PageBean;
import java.util.List;

public interface ContestService
{
    List<Contestrules> getContestRules();
    PageBean getPageBean(Integer pageSize,Integer currentPage);
    ContestPageBean getContestPageBean(String searchDate,String theme,String rank,String stuNum);
    PageBean getContestTypePageBean(Integer pageSize, Integer currentPage, String contestDate, String contestName);
    void deleteContestTypeById(Integer id);
}

