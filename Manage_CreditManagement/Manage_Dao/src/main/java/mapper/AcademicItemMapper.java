package mapper;


import pojo.Academicrules;
import pojo.PageBean;

import java.util.List;

public interface AcademicItemMapper
{
  int getTotalCount();
  List<Academicrules> getPageBean(PageBean pageBean);
}