package Impl;

import mapper.CredentialItemMapper;
import mapper.CredentialrulesMapper;
import mapper.CredentialtypeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pojo.*;
import service.CredentialService;

import java.util.HashMap;
import java.util.List;

@Service
@Transactional
public class CredentialServiceImpl implements CredentialService
{
    @Autowired
    private CredentialrulesMapper credentialRulesMapper;
    @Autowired
    private CredentialItemMapper credentialItemMapper;
    @Autowired
    private CredentialtypeMapper credentialtypeMapper;
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
        totalCount=credentialItemMapper.getTotalCount();
        PageBean pageBean=new PageBean(pageSize,currentPage,totalCount);
        Integer start=(pageBean.getCurrentPage()-1)*pageBean.getPageSize();
        pageBean.setStart(start);
        List<Credentialrules> credentialRulesList = credentialItemMapper.getPageBean(pageBean);

        pageBean.setPageList(credentialRulesList);
        return  pageBean;
    }

    @Override
    public PageBean getCredentialImportPageBean(String information, Integer currentPage, Integer pageSize)
    {
        Integer totalCount=0;
        totalCount=credentialItemMapper.getCredentialImportTotalCount(information);
        PageBean pageBean=new PageBean(pageSize,currentPage,totalCount);
        Integer start=(pageBean.getCurrentPage()-1)*pageBean.getPageSize();
        pageBean.setStart(start);
        HashMap map=new HashMap();
        map.put("pageBean",pageBean);
        map.put("information",information);
        List<Credentialtype> credentialTypeList = credentialItemMapper.getCredentialImportPageBean(map);
        pageBean.setPageList(credentialTypeList);
        return pageBean;
    }

    @Override
    public void addCredentialType(String addInformation)
    {
        Credentialtype credentialtype=new Credentialtype();
        credentialtype.setType(1);
        credentialtype.setInformation(addInformation);
        credentialtypeMapper.insertSelective(credentialtype);
    }

    @Override
    public void deleteCredentialTypeById(Integer id)
    {
        credentialtypeMapper.deleteByPrimaryKey(id);
    }

    @Override
    public PageBean getCredentialPageBean(String studentNumber,String credentialTime, String credentialType, Integer currentPage, Integer pageSize)
    {
        Integer totalCount=credentialItemMapper.getCredentialTotalCount(studentNumber,credentialTime,credentialType);
        PageBean pageBean=new PageBean(pageSize,currentPage,totalCount);
        Integer start=(pageBean.getCurrentPage()-1)*pageBean.getPageSize();
        pageBean.setStart(start);
        HashMap map=new HashMap();
        map.put("pageBean",pageBean);
        map.put("credentialTime",credentialTime);
        map.put("studentNumber",studentNumber);
        map.put("credentialType",credentialType);
        List<Credential> credentialList=credentialItemMapper.getCredentialPageBean(map);
        pageBean.setPageList(credentialList);
        return pageBean;
    }

    @Override
    public List<Credentialtype> getAllCredentialType()
    {
        List<Credentialtype> credentialtypeList= credentialItemMapper.getAllCredentialType();
        return credentialtypeList;
    }
}
