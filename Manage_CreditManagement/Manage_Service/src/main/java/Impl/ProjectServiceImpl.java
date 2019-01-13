package Impl;

import mapper.ProjectrulesMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pojo.Projectrules;
import pojo.ProjectrulesExample;
import service.ProjectService;

import java.util.List;
@Service
public class ProjectServiceImpl implements ProjectService
{
    @Autowired
    private ProjectrulesMapper projectRulesMapper;
    @Override
    public List<Projectrules> getProjectRules()
    {
        ProjectrulesExample projectrulesExample=new ProjectrulesExample();
        List<Projectrules> projectRulesList = projectRulesMapper.selectByExample(projectrulesExample);
        return projectRulesList;
    }
}
