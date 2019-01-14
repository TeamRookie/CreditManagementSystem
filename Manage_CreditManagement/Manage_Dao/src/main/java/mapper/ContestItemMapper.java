package mapper;


import pojo.Contestrules;
import pojo.PageBean;

import java.util.List;

public interface ContestItemMapper
{
    int getTotalCount();
    List<Contestrules> getPageBean(PageBean pageBean);
}