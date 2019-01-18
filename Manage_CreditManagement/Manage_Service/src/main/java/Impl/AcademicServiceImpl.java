package Impl;
import mapper.AcademicMapper;
import mapper.AcademicItemMapper;
import mapper.AcademicrulesMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pojo.*;
import service.AcademicService;

import java.util.HashMap;
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
    public PageBean getAcademicPageBean(String studentNumber, String academicTime, String academicDepartment, Integer currentPage, Integer pageSize)
    {
        int totalCount = academicItemMapper.getAcademicTotalCount(studentNumber,academicTime,academicDepartment);
        PageBean pageBean=new PageBean(pageSize,currentPage,totalCount);
        Integer start=(pageBean.getCurrentPage()-1)*pageBean.getPageSize();
        pageBean.setStart(start);
        HashMap map=new HashMap();
        map.put("pageBean",pageBean);
        map.put("studentNumber",studentNumber);
        map.put("academicTime",academicTime);
        map.put("academicDepartment",academicDepartment);
        List<Academic> academicList = academicItemMapper.getAcademicPageBean(map);
        pageBean.setPageList(academicList);
        return  pageBean;
    }



}
