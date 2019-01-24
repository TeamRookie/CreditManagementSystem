package Impl;

import mapper.ScienceItemMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pojo.PageBean;
import pojo.Science;
import service.ScienceService;

import java.util.HashMap;
import java.util.List;

@Service
public class ScienceServiceImpl implements ScienceService
{
    @Autowired
    private ScienceItemMapper scienceItemMapper;
    @Override
    public PageBean getSciencePageBean(String studentNumber, String scienceType, String scienceTime, String scienceLevel, Integer pageSize, Integer currentPage)
    {
        Integer totalCount=scienceItemMapper.getScienceTotalCount(studentNumber,scienceType,scienceTime,scienceLevel);
        PageBean pageBean=new PageBean(pageSize,currentPage,totalCount);
        Integer start=(pageBean.getCurrentPage()-1)*pageBean.getPageSize();
        pageBean.setStart(start);
        HashMap map=new HashMap();
        map.put("pageBean",pageBean);
        map.put("scienceType",scienceType);
        map.put("scienceTime",scienceTime);
        map.put("scienceLevel",scienceLevel);
        map.put("studentNumber",studentNumber);
        List<Science> scienceList=scienceItemMapper.getSciencePageBean(map);
        pageBean.setPageList(scienceList);
        return pageBean;
    }
}
