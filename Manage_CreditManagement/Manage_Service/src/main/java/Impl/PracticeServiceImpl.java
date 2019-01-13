package Impl;

import mapper.PracticerulesMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pojo.Practicerules;
import pojo.PracticerulesExample;
import service.PraticeService;

import java.util.List;

@Service
public class PracticeServiceImpl implements PraticeService
{
    @Autowired
    private PracticerulesMapper practicerulesMapper;
    @Override
    public List<Practicerules> getPracticeRules()
    {
        PracticerulesExample practicerulesExample=new PracticerulesExample();
        List<Practicerules> practiceRulesList = practicerulesMapper.selectByExample(practicerulesExample);
        return  practiceRulesList;
    }
}
