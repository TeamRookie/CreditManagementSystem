package mapper;

import org.apache.ibatis.annotations.Param;
import org.omg.PortableInterceptor.INACTIVE;
import pojo.*;

import java.util.HashMap;
import java.util.List;

public interface TrainItemMapper
{
   int getTotalCount();
   List<Trainrules> getPageBean(PageBean pageBean);
   int getTrainImportTotalCount(@Param("trainContent") String trainContent,@Param("trainTime") String trainTime);
   List<Traintype> getTrainImportPageBean(HashMap map);

    Integer getTrainTotalCount(@Param("studentNumber") String studentNumber,@Param("faculty")String faculty,@Param("major")String major,@Param("grade")String grade,@Param("trainTime") String trainTime,@Param("trainContent") String trainContent,@Param("trainDepartment") String trainDepartment);

    List<Train> getTrainPageBean(HashMap map);
    List<String> getTrainContent();

    List<Train> getTrainDownload(@Param("faculty") String faculty ,@Param("major") String major,@Param("grade") String grade,@Param("date") String date,@Param("trainName") String trainName,@Param("trainTime") String trainTime);
}