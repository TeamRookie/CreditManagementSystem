package mapper;

import pojo.PageBean;
import pojo.Patentsrules;
import pojo.Trainrules;

import java.util.List;

public interface PatentsItemMapper
{
   int getTotalCount();
   List<Patentsrules> getPageBean(PageBean pageBean);
}