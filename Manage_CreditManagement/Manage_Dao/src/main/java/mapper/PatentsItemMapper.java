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

    Integer getPatentsTotalCount(@Param("studentNumber") String studentNumber,@Param("patentsType") String patentsType);

    List<Patents> getPatentsPageBean(HashMap map);
}