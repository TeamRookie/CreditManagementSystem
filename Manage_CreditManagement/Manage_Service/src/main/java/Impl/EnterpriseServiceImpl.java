package Impl;

import mapper.EnterpriseItemMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pojo.*;
import service.EnterpriseService;

import java.util.HashMap;
import java.util.List;

@Service
public class EnterpriseServiceImpl implements EnterpriseService
{
    @Autowired
    private EnterpriseItemMapper enterpriseItemMapper;
    @Override
    public PageBean getPageBean(Integer currentPage, Integer pageSize)
    {
        Integer totalCount=0;
        totalCount=enterpriseItemMapper.getTotalCount();
        PageBean pageBean=new PageBean(pageSize,currentPage,totalCount);
        Integer start=(pageBean.getCurrentPage()-1)*pageBean.getPageSize();
        pageBean.setStart(start);
        List<Enterpriserules> enterpriseRulesList = enterpriseItemMapper.getPageBean(pageBean);
        pageBean.setPageList(enterpriseRulesList);
        return  pageBean;
    }

    @Override
    public PageBean getEnterprisePageBean(String studentNumber, String enterpriseType, String enterpriseTime, Integer currentPage, Integer pageSize)
    {
        Integer totalCount=enterpriseItemMapper.getEnterpriseTotalCount(studentNumber,enterpriseType,enterpriseTime);
        PageBean pageBean=new PageBean(pageSize,currentPage,totalCount);
        Integer start=(pageBean.getCurrentPage()-1)*pageBean.getPageSize();
        pageBean.setStart(start);
        HashMap map=new HashMap();
        map.put("pageBean",pageBean);
        map.put("studentNumber",studentNumber);
        map.put("enterpriseType",enterpriseType);
        map.put("enterpriseTime",enterpriseTime);
        List<Enterprise> enterpriseList=enterpriseItemMapper.getEnterprisePageBean(map);
        pageBean.setPageList(enterpriseList);
        return pageBean;
    }
}
