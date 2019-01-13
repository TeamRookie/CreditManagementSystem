package Impl;

import mapper.CredentialrulesMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pojo.Credentialrules;
import pojo.CredentialrulesExample;
import service.CredentialService;

import java.util.List;

@Service
public class CredentialServiceImpl implements CredentialService
{
    @Autowired
    private CredentialrulesMapper credentialRulesMapper;
    @Override
    public List<Credentialrules> getCredentialRules()
    {
        CredentialrulesExample credentialrulesExample=new CredentialrulesExample();
        List<Credentialrules> credentialRulesList = credentialRulesMapper.selectByExample(credentialrulesExample);
        return  credentialRulesList;
    }
}
