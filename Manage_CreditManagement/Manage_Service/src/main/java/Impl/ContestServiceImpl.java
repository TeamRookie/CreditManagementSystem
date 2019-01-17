package Impl;

import mapper.ContestItemMapper;
import mapper.ContestMapper;
import mapper.ContestrulesMapper;
import mapper.ContesttypeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pojo.*;
import service.ContestService;

import java.util.HashMap;
import java.util.List;
@Service
@Transactional
public class ContestServiceImpl implements ContestService
{
    @Autowired
    private ContestrulesMapper contestRulesMapper;
    @Autowired
    private ContestItemMapper contestItemMapper;
    @Autowired
    private ContesttypeMapper contesttypeMapper;
    @Autowired
    private ContestMapper contestMapper;
    @Override
    public List<Contestrules> getContestRules()
    {
        ContestrulesExample contestRulesExample=new ContestrulesExample();
        List<Contestrules> contestRulesList = contestRulesMapper.selectByExample(contestRulesExample);
        return  contestRulesList;
    }

    public PageBean getPageBean(Integer pageSize, Integer currentPage)
    {
        Integer totalCount=0;
        totalCount=contestItemMapper.getTotalCount();
        PageBean pageBean=new PageBean(pageSize,currentPage,totalCount);
        Integer start=(pageBean.getCurrentPage()-1)*pageBean.getPageSize();
        pageBean.setStart(start);
        List<Contestrules> contestRulesList = contestItemMapper.getPageBean(pageBean);
        pageBean.setPageList(contestRulesList);
        return  pageBean;
    }
    @Override
    public PageBean getContestImportPageBean(Integer pageSize, Integer currentPage, String contestDate, String contestName)
    {
        Integer totalCount=0;
        totalCount=contestItemMapper.getContestImportTotalCount(contestName,contestDate);
        PageBean pageBean=new PageBean(pageSize,currentPage,totalCount);
        Integer start=(pageBean.getCurrentPage()-1)*pageBean.getPageSize();
        pageBean.setStart(start);
        HashMap map=new HashMap();
/*        System.out.println(contestDate);*/
        map.put("pageBean",pageBean);
        map.put("contestDate",contestDate);
        map.put("contestName",contestName);
        List<Contesttype>  contestTypeList = contestItemMapper.getContestImportPageBean(map);
        pageBean.setPageList(contestTypeList);
        return pageBean;
    }
    @Override
    public void deleteContestTypeById(Integer id)
    {
        contesttypeMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void addContestType(String addContestDate, String addContestName)
    {
        Contesttype contesttype=new Contesttype();
        contesttype.setContestname(addContestName);
        contesttype.setContesttime(addContestDate);
        contesttypeMapper.insertSelective(contesttype);
    }

    @Override
    public PageBean getContestPageBean(String studentNumber,String contestTime, String contestLevel, String contestName, String contestRank, Integer currentPage, Integer pageSize)
    {
        Integer totalCount=contestItemMapper.getContestTotalCount(studentNumber,contestTime,contestLevel,contestName,contestRank);
        PageBean pageBean=new PageBean(pageSize,currentPage,totalCount);
        Integer start=(pageBean.getCurrentPage()-1)*pageBean.getPageSize();
        pageBean.setStart(start);
        HashMap map=new HashMap();
        map.put("pageBean",pageBean);
        map.put("contestTime",contestTime);
        map.put("contestLevel",contestLevel);
        map.put("contestName",contestName);
        map.put("contestRank",contestRank);
        map.put("studentNumber",studentNumber);
        List<Contest> contestList= contestItemMapper.getContestPageBean(map);
        pageBean.setPageList(contestList);
        return pageBean;
    }


}
