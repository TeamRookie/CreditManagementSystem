package Impl;

import mapper.PracticeItemMapper;
import mapper.PracticerulesMapper;
import mapper.PracticetypeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pojo.*;
import service.PracticeService;


import java.util.HashMap;
import java.util.List;

@Service
@Transactional
public class PracticeServiceImpl implements PracticeService
{
    @Autowired
    private PracticerulesMapper practicerulesMapper;
    @Autowired
    private PracticeItemMapper practiceItemMapper;
    @Autowired
    private PracticetypeMapper practicetypeMapper;
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
        totalCount=practiceItemMapper.getTotalCount();
        PageBean pageBean=new PageBean(pageSize,currentPage,totalCount);
        Integer start=(pageBean.getCurrentPage()-1)*pageBean.getPageSize();
        pageBean.setStart(start);
        List<Practicerules> practiceRulesList = practiceItemMapper.getPageBean(pageBean);
        pageBean.setPageList(practiceRulesList);
        return  pageBean;
    }

    @Override
    public PageBean getPracticeImportPageBean(String practiceTime, String practiceName, Integer currentPage, Integer pageSize)
    {
        Integer totalCount=0;
        totalCount=practiceItemMapper.getPracticeImportTotalCount(practiceTime,practiceName);
        PageBean pageBean=new PageBean(pageSize,currentPage,totalCount);
        Integer start=(pageBean.getCurrentPage()-1)*pageBean.getPageSize();
        pageBean.setStart(start);
        HashMap map=new HashMap();
        map.put("pageBean",pageBean);
        map.put("practiceName",practiceName);
        map.put("practiceTime",practiceTime);
        List<Practicetype> practiceTypeList = practiceItemMapper.getPracticeImportPageBean(map);
        pageBean.setPageList(practiceTypeList);
        return  pageBean;
    }

    @Override
    public void addPracticeType(Practicetype practicetype)
    {
        practicetypeMapper.insertSelective(practicetype);
    }

    @Override
    public PageBean getPracticePageBean(String practiceName, String practiceTime, String practiceType, String practiceLevel, String practiceScore, Integer currentPage, Integer pageSize)
    {
        Integer totalCount=practiceItemMapper.getPracticeTotalCount(practiceName,practiceTime,practiceType,practiceLevel,practiceScore);
        PageBean pageBean=new PageBean(pageSize,currentPage,totalCount);
        Integer start=(pageBean.getCurrentPage()-1)*pageBean.getPageSize();
        pageBean.setStart(start);
        HashMap map=new HashMap();
        map.put("pageBean",pageBean);
        map.put("practiceTime",practiceTime);
        map.put("practiceType",practiceType);
        map.put("practiceName",practiceName);
        map.put("practiceLevel",practiceLevel);
        map.put("practiceScore",practiceScore);
        List<Practice> practiceList=practiceItemMapper.getPracticePageBean(map);
        pageBean.setPageList(practiceList);
        return pageBean;
    }
}
