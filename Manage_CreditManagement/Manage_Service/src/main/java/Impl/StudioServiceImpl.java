package Impl;

import mapper.StudioItemMapper;
import mapper.StudiorulesMapper;
import mapper.StudiotypeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pojo.*;
import service.StudioService;

import java.util.HashMap;
import java.util.List;
@Service
@Transactional
public class StudioServiceImpl implements StudioService
{
    @Autowired
    private StudiorulesMapper studioRulesMapper;
    @Autowired
    private StudioItemMapper studioItemMapper;
    @Autowired
    private StudiotypeMapper studiotypeMapper;
    @Override
    public List<Studiorules> getStudioRules()
    {
        StudiorulesExample studiorulesExample=new StudiorulesExample();
        List<Studiorules> studioRulesList = studioRulesMapper.selectByExample(studiorulesExample);
        return  studioRulesList;
    }
    public PageBean getPageBean(Integer pageSize, Integer currentPage)
    {
        Integer totalCount=0;
        totalCount=studioItemMapper.getTotalCount();
        PageBean pageBean=new PageBean(pageSize,currentPage,totalCount);
        Integer start=(pageBean.getCurrentPage()-1)*pageBean.getPageSize();
        pageBean.setStart(start);
        List<Studiorules> studioRulesList = studioItemMapper.getPageBean(pageBean);
        pageBean.setPageList(studioRulesList);
        return  pageBean;
    }

    @Override
    public PageBean getStudioImportPageBean(String studioName, String studioLevel, String studioDepartment, Integer currentPage, Integer pageSize)
    {
        Integer totalCount=0;
        totalCount=studioItemMapper.getStudioImportTotalCount(studioName,studioLevel,studioDepartment);
        PageBean pageBean=new PageBean(pageSize,currentPage,totalCount);
        Integer start=(pageBean.getCurrentPage()-1)*pageBean.getPageSize();
        pageBean.setStart(start);
        HashMap map=new HashMap();
        /*        System.out.println(contestDate);*/
        map.put("pageBean",pageBean);
        map.put("studioName",studioName);
        map.put("studioLevel",studioLevel);
        map.put("studioDepartment",studioDepartment);
        List<Studiotype> studioTypeList = studioItemMapper.getStudioImportPageBean(map);
        pageBean.setPageList(studioTypeList);
        return pageBean;
    }

    @Override
    public void deleteStudioTypeById(Integer id)
    {
        studiotypeMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void addStudioType(Studiotype studiotype)
    {
        studiotypeMapper.insertSelective(studiotype);
    }

    @Override
    public PageBean getStudioPageBean(String studentNumber, String studioTime, String studioDepartment, String studioName, String studioLevel, Integer currentPage, Integer pageSize)
    {
        Integer totalCount=studioItemMapper.getStudioTotalCount(studentNumber,studioTime,studioDepartment,studioName,studioLevel);
        PageBean pageBean=new PageBean(pageSize,currentPage,totalCount);
        Integer start=(pageBean.getCurrentPage()-1)*pageBean.getPageSize();
        pageBean.setStart(start);
        HashMap map=new HashMap();
        /*        System.out.println(contestDate);*/
        map.put("pageBean",pageBean);
        map.put("studioName",studioName);
        map.put("studioLevel",studioLevel);
        map.put("studioDepartment",studioDepartment);
        map.put("studioTime",studioTime);
        map.put("studentNumber",studentNumber);
        List<Studio> studiosList=studioItemMapper.getStudioPageBean(map);
        pageBean.setPageList(studiosList);
        return pageBean;
    }

    @Override
    public List<String> getAllStudioName()
    {
       List<String> nameList= studioItemMapper.getAllStudioName();
       return  nameList;
    }
}
