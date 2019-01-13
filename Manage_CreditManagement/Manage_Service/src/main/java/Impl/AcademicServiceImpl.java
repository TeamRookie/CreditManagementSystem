package Impl;
import mapper.AcademicRulesItemMapper;
import mapper.AcademicrulesMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pojo.Academicrules;
import pojo.AcademicrulesExample;
import pojo.PageBean;
import service.AcademicService;

import java.util.List;

@Service
public class AcademicServiceImpl implements AcademicService
{

    @Autowired
    private AcademicrulesMapper academicRulesMapper;
    @Autowired
    private  AcademicRulesItemMapper  academicRulesItemMapper;
    @Override
    public PageBean getPageBean(Integer pageSize, Integer currentPage)
    {
        Integer totalCount=0;
        totalCount=academicRulesItemMapper.getTotalCount();
        PageBean pageBean=new PageBean(pageSize,currentPage,totalCount);
        List<Academicrules> academicRulesList = academicRulesItemMapper.getPageBean(pageBean);
        pageBean.setPageList(academicRulesList);
        return  pageBean;
    }

    @Override
    public List<Academicrules> getAcademicRules()
    {
        AcademicrulesExample academicrulesExample= new AcademicrulesExample();
        List<Academicrules> academicRulesList = academicRulesMapper.selectByExample(academicrulesExample);
        return  academicRulesList;
    }
}
