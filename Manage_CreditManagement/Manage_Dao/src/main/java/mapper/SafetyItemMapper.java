package mapper;

import org.apache.ibatis.annotations.Param;
import pojo.PageBean;
import pojo.Safety;
import pojo.Safetyrules;

import java.util.HashMap;
import java.util.List;

public interface SafetyItemMapper
{
   int getTotalCount();
   List<Safetyrules> getPageBean(PageBean pageBean);

    Integer getSafetyTotalCount(@Param("studentNumber")String studentNumber,@Param("safetyTime") String safetyTime);

    List<Safety> getSafetyPageBean(HashMap map);
}