package mapper;


import org.apache.ibatis.annotations.Param;
import pojo.Academic;
import pojo.AcademicPageBean;
import pojo.Academicrules;
import pojo.PageBean;

import java.util.HashMap;
import java.util.List;

public interface AcademicItemMapper
{
  int getTotalCount();
  List<Academicrules> getPageBean(PageBean pageBean);

  int getAcademicTotalCount(@Param("studentNumber") String studentNumber,@Param("academicTime") String academicTime,@Param("academicDepartment") String academicDepartment);

  List<Academic> getAcademicPageBean(HashMap map);
}