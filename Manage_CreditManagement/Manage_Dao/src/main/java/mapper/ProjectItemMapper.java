package mapper;


import org.apache.ibatis.annotations.Param;
import pojo.PageBean;
import pojo.Projectrules;
import pojo.Projecttype;

import java.util.HashMap;
import java.util.List;

public interface ProjectItemMapper
{
    int getTotalCount();
    List<Projectrules> getPageBean(PageBean pageBean);
    int getProjectImportTotalCount(@Param("projectTime") String projectTime, @Param("projectName") String projectName);
    List<Projecttype>  getProjectImportPageBean(HashMap map);
}