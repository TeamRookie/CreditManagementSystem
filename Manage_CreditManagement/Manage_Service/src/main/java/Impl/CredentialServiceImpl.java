package Impl;

import mapper.CredentialItemMapper;
import mapper.CredentialrulesMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pojo.Credentialrules;
import pojo.CredentialrulesExample;
import pojo.PageBean;
import service.CredentialService;

import java.util.List;

@Service
@Transactional
public class CredentialServiceImpl implements CredentialService
{
    @Autowired
    private CredentialrulesMapper credentialRulesMapper;
    @Autowired
    private CredentialItemMapper credentialRulesItemMapper;
    @Override
    public List<Credentialrules> getCredentialRules()
    {
        CredentialrulesExample credentialrulesExample=new CredentialrulesExample();
        List<Credentialrules> credentialRulesList = credentialRulesMapper.selectByExample(credentialrulesExample);
        return  credentialRulesList;
    }
    public PageBean getPageBean(Integer pageSize, Integer currentPage)
    {
        Integer totalCount=0;
        totalCount=credentialRulesItemMapper.getTotalCount();
        PageBean pageBean=new PageBean(pageSize,currentPage,totalCount);
        Integer start=(pageBean.getCurrentPage()-1)*pageBean.getPageSize();
        pageBean.setStart(start);
        List<Credentialrules> credentialRulesList = credentialRulesItemMapper.getPageBean(pageBean);

        pageBean.setPageList(credentialRulesList);
        return  pageBean;
    }
}
