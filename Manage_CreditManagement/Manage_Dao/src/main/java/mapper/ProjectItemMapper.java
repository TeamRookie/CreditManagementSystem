package mapper;


import org.apache.ibatis.annotations.Param;
import pojo.PageBean;
import pojo.Project;
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
    int  getProjectTotalCount(@Param("studentNumber") String studentNumber,@Param("projectTime") String projectTime,@Param("projectType") String projectType,@Param("projectId") String projectId,@Param("projectLevel") String projectLevel,@Param("projectScore") String projectScore);
    List<Project> getProjectPageBean(HashMap map);
}