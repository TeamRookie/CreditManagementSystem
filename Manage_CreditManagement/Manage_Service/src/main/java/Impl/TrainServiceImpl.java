package Impl;

import mapper.TrainItemMapper;
import mapper.TraintypeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pojo.*;
import service.TrainService;

import java.util.HashMap;
import java.util.List;

@Service
public class TrainServiceImpl implements TrainService
{
    @Autowired
    private TrainItemMapper trainItemMapper;
    @Autowired
    private TraintypeMapper traintypeMapper;
    public PageBean getPageBean(Integer currentPage, Integer pageSize)
    {
        Integer totalCount=0;
        totalCount=trainItemMapper.getTotalCount();
        PageBean pageBean=new PageBean(pageSize,currentPage,totalCount);
        Integer start=(pageBean.getCurrentPage()-1)*pageBean.getPageSize();
        pageBean.setStart(start);
        List<Trainrules> trainRulesList = trainItemMapper.getPageBean(pageBean);
        pageBean.setPageList(trainRulesList);
        return  pageBean;
    }

    @Override
    public PageBean getTrainImportPageBean(String trainContent, String trainTime, Integer currentPage, Integer pageSize)
    {
        Integer totalCount=0;
        totalCount=trainItemMapper.getTrainImportTotalCount(trainContent,trainTime);
        PageBean pageBean=new PageBean(pageSize,currentPage,totalCount);
        Integer start=(pageBean.getCurrentPage()-1)*pageBean.getPageSize();
        pageBean.setStart(start);
        HashMap map=new HashMap();
        map.put("pageBean",pageBean);
        map.put("trainContent",trainContent);
        map.put("trainTime",trainTime);
        List<Traintype> trainTypeList = trainItemMapper.getTrainImportPageBean(map);
        pageBean.setPageList(trainTypeList);
        return pageBean;
    }

    @Override
    public PageBean getTrainPageBean(String studentNumber, String trainTime, String trainContent, String trainDepartment, Integer currentPage, Integer pageSize)
    {
        Integer totalCount=trainItemMapper.getTrainTotalCount(studentNumber,trainTime,trainContent,trainDepartment);
        PageBean pageBean=new PageBean(pageSize,currentPage,totalCount);
        Integer start=(pageBean.getCurrentPage()-1)*pageBean.getPageSize();
        pageBean.setStart(start);
        HashMap map=new HashMap();
        map.put("trainTime",trainTime);
        map.put("trainContent",trainContent);
        map.put("trainDepartment",trainDepartment);
        map.put("pageBean",pageBean);
        List<Train> trainList=trainItemMapper.getTrainPageBean(map);
        pageBean.setPageList(trainList);
        return  pageBean;
    }

    @Override
    public List<String> getTrainContent()
    {
        List<String> timeList=trainItemMapper.getTrainContent();
        return timeList;
    }

    @Override
    public void addTrainImport(String trainContent)
    {
        Traintype traintype=new Traintype();
        traintype.setTraincontent(trainContent);
        traintypeMapper.insertSelective(traintype);
    }

    @Override
    public void deleteTrainType(Integer id)
    {
        traintypeMapper.deleteByPrimaryKey(id);
    }
}
