package Impl;

import mapper.PatentsItemMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pojo.PageBean;
import pojo.Patents;
import pojo.Patentsrules;
import service.PatentsService;

import java.util.HashMap;
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

    @Override
    public PageBean getPatentsPageBean(String studentNumber, String faculty, String major, String grade,String patentsType, Integer currentPage, Integer pageSize)
    {
        Integer totalCount=patentsItemMapper.getPatentsTotalCount(studentNumber,faculty,major,grade,patentsType);
        PageBean pageBean=new PageBean(pageSize,currentPage,totalCount);
        Integer start=(pageBean.getCurrentPage()-1)*pageBean.getPageSize();
        pageBean.setStart(start);
        HashMap map=new HashMap();
        map.put("pageBean",pageBean);
        map.put("studentNumber",studentNumber);
        map.put("patentsType",patentsType);
        map.put("faculty",faculty);
        map.put("major",major);
        map.put("grade",grade);
        List<Patents> patentsList = patentsItemMapper.getPatentsPageBean(map);
        pageBean.setPageList(patentsList);
        return  pageBean;
    }
}
