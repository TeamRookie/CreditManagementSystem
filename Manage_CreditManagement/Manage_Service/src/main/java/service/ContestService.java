package service;

import pojo.Contestrules;
import pojo.PageBean;
import java.util.List;

public interface ContestService
{
    List<Contestrules> getContestRules();
    PageBean getPageBean(Integer pageSize,Integer currentPage);
    PageBean getContestImportPageBean(Integer pageSize, Integer currentPage, String contestDate, String contestName);
    void deleteContestTypeById(Integer id);
    void addContestType(String addContestDate, String addContestName);
    PageBean getContestPageBean(String studentNumber, String contestTime, String contestLevel, String contestName, String contestRank, Integer currentPage, Integer pageSize);
}

