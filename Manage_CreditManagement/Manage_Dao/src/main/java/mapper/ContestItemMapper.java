package mapper;


import org.apache.ibatis.annotations.Param;
import pojo.Contest;
import pojo.Contestrules;
import pojo.Contesttype;
import pojo.PageBean;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface ContestItemMapper
{
    int getTotalCount();
    List<Contestrules> getPageBean(PageBean pageBean);
    int getContestImportTotalCount(@Param("contestName")String contestName,@Param("contestDate")String contestDate);
    List<Contesttype> getContestImportPageBean(Map map);

    int getContestTotalCount(@Param("studentNumber")String studentNumber,@Param("faculty")String faculty,@Param("major")String major,@Param("grade")String grade,@Param("contestTime") String contestTime,@Param("contestLevel") String contestLevel,@Param("contestName") String contestName,@Param("contestRank") String contestRank);

    List<Contest> getContestPageBean(HashMap map);

    List<Contest> getContestDownload(@Param("faculty") String faculty,@Param("major") String major,@Param("grade") String grade, @Param("contestLevel") String contestLevel,@Param("contestName") String contestName,@Param("contestRank") String contestRank,@Param("contestTime") String contestTime);
}