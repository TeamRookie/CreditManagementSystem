package Impl;

import mapper.ProjectItemMapper;
import mapper.ProjectrulesMapper;
import mapper.ProjecttypeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pojo.*;
import service.ProjectService;

import java.util.HashMap;
import java.util.List;
@Service
@Transactional
public class ProjectServiceImpl implements ProjectService
{
    @Autowired
    private ProjectrulesMapper projectRulesMapper;
    @Autowired
    private ProjectItemMapper projectItemMapper;
    @Autowired
    private  ProjecttypeMapper projecttypeMapper;
    @Override
    public List<Projectrules> getProjectRules()
    {
        ProjectrulesExample projectrulesExample=new ProjectrulesExample();
        List<Projectrules> projectRulesList = projectRulesMapper.selectByExample(projectrulesExample);
        return projectRulesList;
    }
    public PageBean getPageBean(Integer pageSize, Integer currentPage)
    {
        Integer totalCount=0;
        totalCount=projectItemMapper.getTotalCount();
        PageBean pageBean=new PageBean(pageSize,currentPage,totalCount);
        Integer start=(pageBean.getCurrentPage()-1)*pageBean.getPageSize();
        pageBean.setStart(start);
        List<Projectrules> projectRulesList = projectItemMapper.getPageBean(pageBean);
        pageBean.setPageList(projectRulesList);
        return  pageBean;
    }

    @Override
    public PageBean getProjectImportPageBean(String projectTime, String projectName, Integer pageSize, Integer currentPage)
    {
        Integer totalCount=0;
        totalCount=projectItemMapper.getProjectImportTotalCount(projectTime,projectName);
        PageBean pageBean=new PageBean(pageSize,currentPage,totalCount);
        Integer start=(pageBean.getCurrentPage()-1)*pageBean.getPageSize();
        pageBean.setStart(start);
        HashMap map=new HashMap();
        map.put("pageBean",pageBean);
        map.put("projectName",projectName);
        map.put("projectTime",projectTime);
        System.out.println(projectName);
        System.out.println(totalCount);
        List<Projecttype> projectTypeList = projectItemMapper.getProjectImportPageBean(map);
        pageBean.setPageList(projectTypeList);
        return  pageBean;
    }

    @Override
    public void deleteProjectTypeById(Integer id)
    {
        projecttypeMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void addProjectType(Projecttype projecttype)
    {
        projecttypeMapper.insertSelective(projecttype);
    }

    @Override
    public PageBean getProjectPageBean(String studentNumber, String projectTime, String projectType, String projectId, String projectLevel, String projectScore, Integer currentPage, Integer pageSize)
    {

        Integer totalCount =projectItemMapper.getProjectTotalCount(studentNumber,projectTime,projectType,projectId,projectLevel,projectScore);
        PageBean pageBean=new PageBean(pageSize,currentPage,totalCount);
        Integer start=(pageBean.getCurrentPage()-1)*pageBean.getPageSize();
        pageBean.setStart(start);
        HashMap map=new HashMap();
        map.put("pageBean",pageBean);
        map.put("studentNumber",studentNumber);
        map.put("projectTime",projectTime);
        map.put("projectType",projectType);
        map.put("projectId",projectId);
        map.put("projectLevel",projectLevel);
        map.put("projectScore",projectScore);
        List<Project> projectList=projectItemMapper.getProjectPageBean(map);
        pageBean.setPageList(projectList);
        return pageBean;
    }

}
