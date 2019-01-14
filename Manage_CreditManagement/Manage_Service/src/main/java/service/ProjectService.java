package service;

import pojo.PageBean;
import pojo.Projectrules;

import java.util.List;

public interface ProjectService
{
    List<Projectrules> getProjectRules();
    PageBean getPageBean(Integer pageSize, Integer currentPage);
}
