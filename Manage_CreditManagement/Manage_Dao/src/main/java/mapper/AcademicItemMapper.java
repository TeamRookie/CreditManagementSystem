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

  int getAcademicTotalCount(@Param("studentNumber") String studentNumber,@Param("faculty")String faculty,@Param("major")String major,@Param("grade")String grade,@Param("academicTime") String academicTime,@Param("academicDepartment") String academicDepartment);
  List<Academic> getAcademicDownload(@Param("studentNumber") String studentNumber,@Param("faculty")String faculty,@Param("major")String major,@Param("grade")String grade,@Param("academicTime") String academicTime,@Param("academicDepartment") String academicDepartment);
  List<Academic> getAcademicPageBean(HashMap map);


}