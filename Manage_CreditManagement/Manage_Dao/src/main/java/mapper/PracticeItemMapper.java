package mapper;

import org.apache.ibatis.annotations.Param;
import pojo.PageBean;
import pojo.Practice;
import pojo.Practicerules;
import pojo.Practicetype;

import java.util.HashMap;
import java.util.List;

public interface PracticeItemMapper
{
    int getTotalCount();
    List<Practicerules> getPageBean(PageBean pageBean);
    int getPracticeImportTotalCount(@Param("practiceTime") String practiceTime,@Param("practiceName") String practiceName);
    List<Practicetype> getPracticeImportPageBean(HashMap map);

    Integer getPracticeTotalCount(@Param("practiceName") String practiceName,@Param("faculty")String faculty,@Param("major")String major,@Param("grade")String grade,@Param("practiceTime") String practiceTime,@Param("practiceType") String practiceType, @Param("practiceLevel") String practiceLevel,@Param("practiceScore") String practiceScore);

    List<Practice> getPracticePageBean(HashMap map);

    List<Practice> getPracticeDownload(@Param("faculty") String faculty,@Param("major") String major,@Param("grade") String grade,@Param("practiceTime") String date,@Param("practiceLevel") String practiceLevel,@Param("practiceName") String practiceName,@Param("practiceScore") String practiceScore,@Param("practiceType") String practiceType);
}