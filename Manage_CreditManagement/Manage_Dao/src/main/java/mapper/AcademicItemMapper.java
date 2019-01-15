package mapper;


import org.apache.ibatis.annotations.Param;
import pojo.Academic;
import pojo.AcademicPageBean;
import pojo.Academicrules;
import pojo.PageBean;

import java.util.List;

public interface AcademicItemMapper
{
  int getTotalCount();
  List<Academicrules> getPageBean(PageBean pageBean);
  int getAcademicTotalCount(@Param("stuNum") String stuNum,@Param("searchDate") String searchDate);
  List<Academic> getAcademicPageBean(AcademicPageBean academicPageBean);
}