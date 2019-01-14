package mapper;

import pojo.PageBean;
import pojo.Productionrules;

import java.util.List;

public interface ProductionItemMapper
{
    int getTotalCount();
    List<Productionrules> getPageBean(PageBean pageBean);
}