package mapper;

import org.apache.ibatis.annotations.Param;
import pojo.PageBean;
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
}