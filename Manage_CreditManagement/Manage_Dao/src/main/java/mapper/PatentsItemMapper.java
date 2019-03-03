package mapper;

import org.apache.ibatis.annotations.Param;
import pojo.PageBean;
import pojo.Patents;
import pojo.Patentsrules;
import pojo.Trainrules;

import java.util.HashMap;
import java.util.List;

public interface PatentsItemMapper
{
   int getTotalCount();
   List<Patentsrules> getPageBean(PageBean pageBean);

    Integer getPatentsTotalCount(@Param("studentNumber") String studentNumber,@Param("faculty")String faculty,@Param("major")String major,@Param("grade")String grade,@Param("patentsType") String patentsType);

    List<Patents> getPatentsPageBean(HashMap map);

    List<Patents> getPatentsDownload(@Param("faculty") String faculty,@Param("major") String major,@Param("grade") String grade,@Param("patentsTime") String date, @Param("patentsType") String patentsType);
}