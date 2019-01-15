package Impl;
import mapper.AcademicMapper;
import mapper.AcademicItemMapper;
import mapper.AcademicrulesMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pojo.*;
import service.AcademicService;

import java.util.List;

@Service
@Transactional
public class AcademicServiceImpl implements AcademicService
{

    @Autowired
    private AcademicrulesMapper academicRulesMapper;
    @Autowired
    private AcademicItemMapper academicItemMapper;
    @Autowired
    private AcademicMapper academicMapper;
    @Override
    public PageBean getPageBean(Integer pageSize, Integer currentPage)
    {
        Integer totalCount=0;
        totalCount= academicItemMapper.getTotalCount();
        PageBean pageBean=new PageBean(pageSize,currentPage,totalCount);
        Integer start=(pageBean.getCurrentPage()-1)*pageBean.getPageSize();
        pageBean.setStart(start);
        List<Academicrules> academicRulesList = academicItemMapper.getPageBean(pageBean);
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

    @Override
    public AcademicPageBean getAcademicPageBean(String stuNum, String searchDate,Integer pageSize, Integer currentPage)
    {
        int totalCount = academicItemMapper.getAcademicTotalCount(stuNum,searchDate);
        AcademicPageBean academicPageBean=new AcademicPageBean(pageSize,currentPage,totalCount);
        academicPageBean.setSearchDate(searchDate);
        academicPageBean.setStuNum(stuNum);
        Integer start=(academicPageBean.getCurrentPage()-1)*academicPageBean.getPageSize();
        academicPageBean.setStart(start);
        List<Academic> academicList = academicItemMapper.getAcademicPageBean(academicPageBean);
        academicPageBean.setPageList(academicList);
        return  academicPageBean;
    }


}
