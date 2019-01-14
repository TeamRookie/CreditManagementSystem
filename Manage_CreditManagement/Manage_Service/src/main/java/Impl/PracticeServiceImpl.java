package Impl;

import mapper.PracticeItemMapper;
import mapper.PracticerulesMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pojo.PageBean;
import pojo.Practicerules;
import pojo.PracticerulesExample;
import service.PraticeService;

import java.util.List;

@Service
@Transactional
public class PracticeServiceImpl implements PraticeService
{
    @Autowired
    private PracticerulesMapper practicerulesMapper;
    @Autowired
    private PracticeItemMapper practiceRulesItemMapper;
    @Override
    public List<Practicerules> getPracticeRules()
    {
        PracticerulesExample practicerulesExample=new PracticerulesExample();
        List<Practicerules> practiceRulesList = practicerulesMapper.selectByExample(practicerulesExample);
        return  practiceRulesList;
    }
    public PageBean getPageBean(Integer pageSize, Integer currentPage)
    {
        Integer totalCount=0;
        totalCount=practiceRulesItemMapper.getTotalCount();
        PageBean pageBean=new PageBean(pageSize,currentPage,totalCount);
        Integer start=(pageBean.getCurrentPage()-1)*pageBean.getPageSize();
        pageBean.setStart(start);
        List<Practicerules> practiceRulesList = practiceRulesItemMapper.getPageBean(pageBean);
        pageBean.setPageList(practiceRulesList);
        return  pageBean;
    }
}
