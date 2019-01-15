package Impl;

import mapper.ContestItemMapper;
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
    public ContestPageBean getContestPageBean(String searchDate, String theme, String rank, String stuNum)
    {
        return null;
    }

    @Override
    public PageBean getContestTypePageBean(Integer pageSize, Integer currentPage, String contestDate, String contestName)
    {
        Integer totalCount=0;
        totalCount=contestItemMapper.getContestImportTotalCount(contestName,contestDate);
        PageBean pageBean=new PageBean(pageSize,currentPage,totalCount);
        Integer start=(pageBean.getCurrentPage()-1)*pageBean.getPageSize();
        pageBean.setStart(start);
        HashMap map=new HashMap();
        System.out.println(contestDate);
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


}
