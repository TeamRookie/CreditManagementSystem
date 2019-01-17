package mapper;

import org.apache.ibatis.annotations.Param;
import pojo.PageBean;
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
}