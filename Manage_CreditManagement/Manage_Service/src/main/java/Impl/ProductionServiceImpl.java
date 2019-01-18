package Impl;

import mapper.ProductionItemMapper;
import mapper.ProductionrulesMapper;
import org.omg.CORBA.MARSHAL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pojo.PageBean;
import pojo.Production;
import pojo.Productionrules;
import pojo.ProductionrulesExample;
import service.ProductionService;

import java.util.HashMap;
import java.util.List;
@Service
@Transactional
public class ProductionServiceImpl implements ProductionService
{
    @Autowired
    private ProductionrulesMapper productionRulesMapper;
    @Autowired
    private ProductionItemMapper productionItemMapper;
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
        totalCount=productionItemMapper.getTotalCount();
        PageBean pageBean=new PageBean(pageSize,currentPage,totalCount);
        Integer start=(pageBean.getCurrentPage()-1)*pageBean.getPageSize();
        pageBean.setStart(start);
        List<Productionrules> productionRulesList = productionItemMapper.getPageBean(pageBean);

        pageBean.setPageList(productionRulesList);
        return  pageBean;
    }

    @Override
    public PageBean getProductionPageBean(String studentNumber, String productionType, String productionTime, Integer currentPage, Integer pageSize)
    {
        Integer totalCount=productionItemMapper.getProductionTotalCount(studentNumber,productionType,productionTime);
        PageBean pageBean=new PageBean(pageSize,currentPage,totalCount);
        Integer start=(pageBean.getCurrentPage()-1)*pageBean.getPageSize();
        pageBean.setStart(start);
        HashMap map=new HashMap();
        map.put("studentNumber",studentNumber);
        map.put("productionType",productionType);
        map.put("productionTime",productionTime);
        map.put("pageBean",pageBean);
        List<Production> productionList=productionItemMapper.getProductionPageBean(map);
        pageBean.setPageList(productionList);
        return pageBean;
    }
}
