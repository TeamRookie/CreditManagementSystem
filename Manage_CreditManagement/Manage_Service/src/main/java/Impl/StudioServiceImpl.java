package Impl;

import mapper.StudiorulesMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pojo.Studiorules;
import pojo.StudiorulesExample;
import service.StudioService;

import java.util.List;
@Service
public class StudioServiceImpl implements StudioService
{
    @Autowired
    private StudiorulesMapper studioRulesMapper;
    @Override
    public List<Studiorules> getStudioRules()
    {
        StudiorulesExample studiorulesExample=new StudiorulesExample();
        List<Studiorules> studioRulesList = studioRulesMapper.selectByExample(studiorulesExample);
        return  studioRulesList;
    }
}
