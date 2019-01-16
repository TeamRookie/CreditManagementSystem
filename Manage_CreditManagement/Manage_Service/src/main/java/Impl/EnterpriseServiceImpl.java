package Impl;

import mapper.EnterpriseItemMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pojo.Credentialrules;
import pojo.Enterpriserules;
import pojo.PageBean;
import pojo.Trainrules;
import service.EnterpriseService;

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
}
