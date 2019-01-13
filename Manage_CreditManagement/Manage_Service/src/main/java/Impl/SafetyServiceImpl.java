package Impl;

import mapper.SafetyrulesMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pojo.Safetyrules;
import pojo.SafetyrulesExample;
import service.SafetyService;

import java.util.List;
@Service
public class SafetyServiceImpl implements SafetyService
{
    @Autowired
    private SafetyrulesMapper safetyRulesMapper;
    @Override
    public List<Safetyrules> getSafetyRules()
    {
        SafetyrulesExample safetyruleExample=new SafetyrulesExample();
        List<Safetyrules> safetyRulesList = safetyRulesMapper.selectByExample(safetyruleExample);
        return safetyRulesList;
    }
}
