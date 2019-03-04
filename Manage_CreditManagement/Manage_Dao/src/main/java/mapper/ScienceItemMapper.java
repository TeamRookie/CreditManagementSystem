package mapper;


import org.apache.ibatis.annotations.Param;
import pojo.Science;
import pojo.Sciencerules;

import java.util.HashMap;
import java.util.List;

public interface ScienceItemMapper
{
    Integer getScienceTotalCount(@Param("studentNumber") String studentNumber,@Param("faculty")String faculty,@Param("major")String major,@Param("grade")String grade,@Param("scienceType") String scienceType,@Param("scienceTime") String scienceTime,@Param("scienceLevel") String scienceLevel);

    List<Science> getSciencePageBean(HashMap map);

    Integer getScienceRulesTotalCount();

    List<Sciencerules> getScienceRulesPageBean(HashMap map);

    List<Science> getScienceDownload(@Param("faculty") String faculty,@Param("major") String major,@Param("grade") String grade,@Param("scienceTime") String startTime,@Param("scienceLevel") String scienceLevel,@Param("scienceType") String scienceType);
}