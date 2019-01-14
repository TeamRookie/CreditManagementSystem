package Impl;

import mapper.StudioItemMapper;
import mapper.StudiorulesMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pojo.PageBean;
import pojo.Studiorules;
import pojo.StudiorulesExample;
import service.StudioService;

import java.util.List;
@Service
@Transactional
public class StudioServiceImpl implements StudioService
{
    @Autowired
    private StudiorulesMapper studioRulesMapper;
    @Autowired
    private StudioItemMapper studioRulesItemMapper;
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
        totalCount=studioRulesItemMapper.getTotalCount();
        PageBean pageBean=new PageBean(pageSize,currentPage,totalCount);
        Integer start=(pageBean.getCurrentPage()-1)*pageBean.getPageSize();
        pageBean.setStart(start);
        List<Studiorules> studioRulesList = studioRulesItemMapper.getPageBean(pageBean);
        pageBean.setPageList(studioRulesList);
        return  pageBean;
    }
}
