package mapper;


import pojo.Associationrules;
import pojo.PageBean;

import java.util.List;

public interface AssociationRulesItemMapper
{
    int getTotalCount();
    List<Associationrules> getPageBean(PageBean pageBean);
}