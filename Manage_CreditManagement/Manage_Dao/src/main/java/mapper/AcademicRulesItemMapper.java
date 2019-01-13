package mapper;


import pojo.Academicrules;
import pojo.PageBean;

import java.util.List;

public interface AcademicRulesItemMapper
{
  int getTotalCount();
  List<Academicrules> getPageBean(PageBean pageBean);
}