package service;

import pojo.PageBean;
import pojo.Safetyrules;

import java.util.List;

public interface SafetyService
{
    List<Safetyrules> getSafetyRules();
    PageBean getPageBean(Integer pageSize, Integer currentPage);
}
