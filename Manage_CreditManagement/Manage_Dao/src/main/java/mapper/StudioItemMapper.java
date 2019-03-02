package mapper;

import org.apache.ibatis.annotations.Param;
import pojo.PageBean;
import pojo.Studio;
import pojo.Studiorules;
import pojo.Studiotype;

import java.util.HashMap;
import java.util.List;

public interface StudioItemMapper
{
    int getTotalCount();
    List<Studiorules> getPageBean(PageBean pageBean);
    int getStudioImportTotalCount(@Param("studioName") String studioName,@Param("studioLevel")String studioLevel,@Param("studioDepartment")String  studioDepartment);
    List<Studiotype> getStudioImportPageBean(HashMap map);

    Integer getStudioTotalCount(@Param("studentNumber") String studentNumber,@Param("faculty")String faculty,@Param("major")String major,@Param("grade")String grade,@Param("studioTime") String studioTime,@Param("studioDepartment") String studioDepartment,@Param("studioName") String studioName,@Param("studioLevel") String studioLevel);

    List<Studio> getStudioPageBean(HashMap map);

    List<String> getAllStudioName();

    List<Studio> getStudioDownload(@Param("faculty") String faculty,@Param("major") String major,@Param("grade") String grade,@Param("date") String date,@Param("studioName") String studioName,@Param("studioTime") String studioTime,@Param("studioLevel") String studioLevel,@Param("studioDepartment")String department);
}