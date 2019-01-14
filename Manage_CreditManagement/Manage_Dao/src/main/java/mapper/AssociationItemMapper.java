package mapper;


import pojo.Associationrules;
import pojo.PageBean;

import java.util.List;

public interface AssociationItemMapper
{
    int getTotalCount();
    List<Associationrules> getPageBean(PageBean pageBean);
}