package service;

import pojo.PageBean;
import pojo.Studiorules;

import java.util.List;

public interface StudioService
{
    List<Studiorules> getStudioRules();
    PageBean getPageBean(Integer pageSize, Integer currentPage);
}
