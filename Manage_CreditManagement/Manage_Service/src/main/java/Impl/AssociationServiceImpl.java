package Impl;

import mapper.AssociationRulesItemMapper;
import mapper.AssociationrulesMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pojo.AssociationExample;
import pojo.Associationrules;
import pojo.AssociationrulesExample;
import pojo.PageBean;
import service.AssociationService;

import java.util.List;
@Service
public class AssociationServiceImpl implements AssociationService
{
    @Autowired
    private AssociationrulesMapper associationRulesMapper;
    @Autowired
    private AssociationRulesItemMapper associationRulesItemMapper;
    @Override
    public PageBean getPageBean(Integer pageSize, Integer currentPage)
    {
        int totalCount = associationRulesItemMapper.getTotalCount();
        PageBean pageBean=new PageBean(pageSize,currentPage,totalCount);
        Integer start=(pageBean.getCurrentPage()-1)*pageBean.getPageSize();
        pageBean.setStart(start);
        List<Associationrules> associationRulesList = associationRulesItemMapper.getPageBean(pageBean);
        pageBean.setPageList(associationRulesList);
        return  pageBean;
    }

    @Override
    public List<Associationrules> getAssociationRules()
    {
        AssociationrulesExample associationRulesExample=new AssociationrulesExample();
        List<Associationrules> associationRulesList = associationRulesMapper.selectByExample(associationRulesExample);
        return associationRulesList;
    }
}
