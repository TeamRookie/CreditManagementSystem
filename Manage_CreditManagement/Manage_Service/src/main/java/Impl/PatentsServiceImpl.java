package Impl;

import mapper.PatentsItemMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pojo.PageBean;
import pojo.Patentsrules;
import service.PatentsService;

import java.util.List;

@Service
public class PatentsServiceImpl implements PatentsService
{
    @Autowired
    private PatentsItemMapper patentsItemMapper;
    public PageBean getPageBean(Integer currentPage, Integer pageSize)
    {
        Integer totalCount=0;
        totalCount=patentsItemMapper.getTotalCount();
        PageBean pageBean=new PageBean(pageSize,currentPage,totalCount);
        Integer start=(pageBean.getCurrentPage()-1)*pageBean.getPageSize();
        pageBean.setStart(start);
        List<Patentsrules> patentsRulesList = patentsItemMapper.getPageBean(pageBean);
        pageBean.setPageList(patentsRulesList);
        return  pageBean;
    }
}
