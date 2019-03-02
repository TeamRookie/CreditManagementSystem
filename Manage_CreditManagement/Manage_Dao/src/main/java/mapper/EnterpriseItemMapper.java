package mapper;

import org.apache.ibatis.annotations.Param;
import pojo.Enterprise;
import pojo.Enterpriserules;
import pojo.PageBean;
import pojo.Trainrules;

import java.util.HashMap;
import java.util.List;

public interface EnterpriseItemMapper
{
   int getTotalCount();
   List<Enterpriserules> getPageBean(PageBean pageBean);

    Integer getEnterpriseTotalCount(@Param("studentNumber") String studentNumber,@Param("faculty")String faculty,@Param("major")String major,@Param("grade")String grade,@Param("enterpriseType") String enterpriseType,@Param("enterpriseTime") String enterpriseTime);

    List<Enterprise> getEnterprisePageBean(HashMap map);

    List<Enterprise> getEnterpriseDownload(@Param("faculty") String faculty,@Param("major") String major, @Param("grade") String grade,@Param("enterpriseTime") String date);
}