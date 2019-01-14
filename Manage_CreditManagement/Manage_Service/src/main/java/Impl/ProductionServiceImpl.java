package Impl;

import mapper.ProductionItemMapper;
import mapper.ProductionrulesMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pojo.PageBean;
import pojo.Productionrules;
import pojo.ProductionrulesExample;
import service.ProductionService;

import java.util.List;
@Service
@Transactional
public class ProductionServiceImpl implements ProductionService
{
    @Autowired
    private ProductionrulesMapper productionRulesMapper;
    @Autowired
    private ProductionItemMapper productionRulesItemMapper;
    @Override
    public List<Productionrules> getProductionRules()
    {
        ProductionrulesExample productionrulesExample=new ProductionrulesExample();
        List<Productionrules> productionRulesList = productionRulesMapper.selectByExample(productionrulesExample);
        return  productionRulesList;
    }
    public PageBean getPageBean(Integer pageSize, Integer currentPage)
    {
        Integer totalCount=0;
        totalCount=productionRulesItemMapper.getTotalCount();
        PageBean pageBean=new PageBean(pageSize,currentPage,totalCount);
        Integer start=(pageBean.getCurrentPage()-1)*pageBean.getPageSize();
        pageBean.setStart(start);
        List<Productionrules> productionRulesList = productionRulesItemMapper.getPageBean(pageBean);

        pageBean.setPageList(productionRulesList);
        return  pageBean;
    }
}
