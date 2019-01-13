package Impl;

import mapper.ProductionrulesMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pojo.Productionrules;
import pojo.ProductionrulesExample;
import service.ProductionService;

import java.util.List;
@Service
public class ProductionServiceImpl implements ProductionService
{
    @Autowired
    private ProductionrulesMapper productionRulesMapper;
    @Override
    public List<Productionrules> getProductionRules()
    {
        ProductionrulesExample productionrulesExample=new ProductionrulesExample();
        List<Productionrules> productionRulesList = productionRulesMapper.selectByExample(productionrulesExample);
        return  productionRulesList;
    }
}
