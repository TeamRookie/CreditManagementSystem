package mapper;


import org.apache.ibatis.annotations.Param;
import pojo.Contestrules;
import pojo.Contesttype;
import pojo.PageBean;

import java.util.List;
import java.util.Map;

public interface ContestItemMapper
{
    int getTotalCount();
    List<Contestrules> getPageBean(PageBean pageBean);
    int getContestImportTotalCount(@Param("contestName")String contestName,@Param("contestDate")String contestDate);
    List<Contesttype> getContestImportPageBean(Map map);
}