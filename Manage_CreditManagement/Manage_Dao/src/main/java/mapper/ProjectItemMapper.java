package mapper;


import pojo.PageBean;
import pojo.Projectrules;

import java.util.List;

public interface ProjectItemMapper
{
    int getTotalCount();
    List<Projectrules> getPageBean(PageBean pageBean);
}