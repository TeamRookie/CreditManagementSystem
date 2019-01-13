package Impl;

import mapper.ContestrulesMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pojo.Contestrules;
import pojo.ContestrulesExample;
import service.ContestService;

import java.util.List;
@Service
public class ContestServiceImpl implements ContestService
{
    @Autowired
    private ContestrulesMapper contestRulesMapper;
    @Override
    public List<Contestrules> getContestRules()
    {
        ContestrulesExample contestRulesExample=new ContestrulesExample();
        List<Contestrules> contestRulesList = contestRulesMapper.selectByExample(contestRulesExample);
        return  contestRulesList;
    }
}
