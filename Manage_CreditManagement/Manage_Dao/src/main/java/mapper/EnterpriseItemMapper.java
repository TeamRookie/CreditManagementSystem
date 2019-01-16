package mapper;

import pojo.Enterpriserules;
import pojo.PageBean;
import pojo.Trainrules;

import java.util.List;

public interface EnterpriseItemMapper
{
   int getTotalCount();
   List<Enterpriserules> getPageBean(PageBean pageBean);
}