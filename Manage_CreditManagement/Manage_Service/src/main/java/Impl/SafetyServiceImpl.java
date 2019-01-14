package Impl;

import mapper.SafetyItemMapper;
import mapper.SafetyrulesMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pojo.PageBean;
import pojo.Safetyrules;
import pojo.SafetyrulesExample;
import service.SafetyService;

import java.util.List;
@Service
@Transactional
public class SafetyServiceImpl implements SafetyService
{
    @Autowired
    private SafetyrulesMapper safetyRulesMapper;
    @Autowired
    private SafetyItemMapper safetyRulesItemMapper;
    @Override
    public List<Safetyrules> getSafetyRules()
    {
        SafetyrulesExample safetyruleExample=new SafetyrulesExample();
        List<Safetyrules> safetyRulesList = safetyRulesMapper.selectByExample(safetyruleExample);
        return safetyRulesList;
    }
    public PageBean getPageBean(Integer pageSize, Integer currentPage)
    {
        Integer totalCount=0;
        totalCount=safetyRulesItemMapper.getTotalCount();
        PageBean pageBean=new PageBean(pageSize,currentPage,totalCount);
        Integer start=(pageBean.getCurrentPage()-1)*pageBean.getPageSize();
        pageBean.setStart(start);
        List<Safetyrules> safetyRulesList = safetyRulesItemMapper.getPageBean(pageBean);
        pageBean.setPageList(safetyRulesList);
        return  pageBean;
    }
}
