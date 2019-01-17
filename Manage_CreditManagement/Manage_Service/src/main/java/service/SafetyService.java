package service;

import pojo.PageBean;
import pojo.Safetyrules;

import java.util.List;

public interface SafetyService
{
    List<Safetyrules> getSafetyRules();
    PageBean getPageBean(Integer pageSize, Integer currentPage);

    PageBean getSafetyPageBean(String studentNumber,String safetyTime, Integer currentPage, Integer pageSize);
}
