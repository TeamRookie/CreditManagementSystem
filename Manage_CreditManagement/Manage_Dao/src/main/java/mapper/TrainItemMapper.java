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
}