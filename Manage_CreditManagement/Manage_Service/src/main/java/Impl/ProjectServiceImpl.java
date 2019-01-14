package Impl;

import mapper.ProjectItemMapper;
import mapper.ProjectrulesMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pojo.PageBean;
import pojo.Projectrules;
import pojo.ProjectrulesExample;
import service.ProjectService;

import java.util.List;
@Service
@Transactional
public class ProjectServiceImpl implements ProjectService
{
    @Autowired
    private ProjectrulesMapper projectRulesMapper;
    @Autowired
    private ProjectItemMapper projectRulesItemMapper;
    @Override
    public List<Projectrules> getProjectRules()
    {
        ProjectrulesExample projectrulesExample=new ProjectrulesExample();
        List<Projectrules> projectRulesList = projectRulesMapper.selectByExample(projectrulesExample);
        return projectRulesList;
    }
    public PageBean getPageBean(Integer pageSize, Integer currentPage)
    {
        Integer totalCount=0;
        totalCount=projectRulesItemMapper.getTotalCount();
        PageBean pageBean=new PageBean(pageSize,currentPage,totalCount);
        Integer start=(pageBean.getCurrentPage()-1)*pageBean.getPageSize();
        pageBean.setStart(start);
        List<Projectrules> projectRulesList = projectRulesItemMapper.getPageBean(pageBean);
        pageBean.setPageList(projectRulesList);
        return  pageBean;
    }
}
