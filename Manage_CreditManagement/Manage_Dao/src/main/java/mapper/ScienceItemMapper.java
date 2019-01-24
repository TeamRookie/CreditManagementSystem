package mapper;


import org.apache.ibatis.annotations.Param;
import pojo.Science;

import java.util.HashMap;
import java.util.List;

public interface ScienceItemMapper
{
    Integer getScienceTotalCount(@Param("studentNumber") String studentNumber,@Param("scienceType") String scienceType,@Param("scienceTime") String scienceTime,@Param("scienceLevel") String scienceLevel);

    List<Science> getSciencePageBean(HashMap map);
}