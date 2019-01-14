package Impl;

import mapper.ContestItemMapper;
import mapper.ContestrulesMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pojo.*;
import service.ContestService;

import java.util.List;
@Service
@Transactional
public class ContestServiceImpl implements ContestService
{
    @Autowired
    private ContestrulesMapper contestRulesMapper;
    @Autowired
    private ContestItemMapper contestRulesItemMapper;
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
        totalCount=contestRulesItemMapper.getTotalCount();
        PageBean pageBean=new PageBean(pageSize,currentPage,totalCount);
        Integer start=(pageBean.getCurrentPage()-1)*pageBean.getPageSize();
        pageBean.setStart(start);
        List<Contestrules> contestRulesList = contestRulesItemMapper.getPageBean(pageBean);
        pageBean.setPageList(contestRulesList);
        return  pageBean;
    }


}
