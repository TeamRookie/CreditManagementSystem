package Impl;

import mapper.AssociationItemMapper;
import mapper.AssociationrulesMapper;
import mapper.AssociationtypeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pojo.*;
import service.AssociationService;

import java.util.HashMap;
import java.util.List;
@Service
@Transactional
public class AssociationServiceImpl implements AssociationService
{
    @Autowired
    private AssociationrulesMapper associationRulesMapper;
    @Autowired
    private AssociationItemMapper associationItemMapper;
    @Autowired
    private AssociationtypeMapper associationtypeMapper;
    @Override
    public PageBean getPageBean(Integer pageSize, Integer currentPage)
    {
        int totalCount = associationItemMapper.getTotalCount();
        PageBean pageBean=new PageBean(pageSize,currentPage,totalCount);
        Integer start=(pageBean.getCurrentPage()-1)*pageBean.getPageSize();
        pageBean.setStart(start);
        List<Associationrules> associationRulesList = associationItemMapper.getPageBean(pageBean);
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

    @Override
    public PageBean getAssociationImportPageBean(String associationName, String associationTime, Integer currentPage, Integer pageSize)
    {
        Integer totalCount=0;
        totalCount=associationItemMapper.getAssociationImportTotalCount(associationName,associationTime);
        PageBean pageBean=new PageBean(pageSize,currentPage,totalCount);
        Integer start=(pageBean.getCurrentPage()-1)*pageBean.getPageSize();
        pageBean.setStart(start);
        HashMap map=new HashMap();
        map.put("pageBean",pageBean);
        map.put("associationName",associationName);
        map.put("associationTime",associationTime);
        List<Associationtype> associationTypeList = associationItemMapper.getAssociationImportPageBean(map);
        pageBean.setPageList(associationTypeList);
        return pageBean;
    }

    @Override
    public void addAssociationType(Associationtype associationtype)
    {
        associationtypeMapper.insertSelective(associationtype);
    }

    @Override
    public void deleteAssociationTypeById(Integer id)
    {
        associationtypeMapper.deleteByPrimaryKey(id);
    }

    @Override
    public PageBean getAssociationPageBean(String studentNumber, String associationTime, String associationName, String associationLevel, Integer currentPage, Integer pageSize)
    {
        Integer totalCount=associationItemMapper.getAssociationTotalCount(studentNumber,associationTime,associationName,associationLevel);
        PageBean pageBean=new PageBean(pageSize,currentPage,totalCount);
        Integer start=(pageBean.getCurrentPage()-1)*pageBean.getPageSize();
        pageBean.setStart(start);
        HashMap map=new HashMap();
        map.put("pageBean",pageBean);
        map.put("associationName",associationName);
        map.put("associationTime",associationTime);
        map.put("studentNumber",studentNumber);
        map.put("associationLevel",associationLevel);
        List<Association> associationList=associationItemMapper.getAssociationPageBean(map);
        pageBean.setPageList(associationList);
        return pageBean;
    }
}
