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

    Integer getEnterpriseTotalCount(@Param("studentNumber") String studentNumber,@Param("enterpriseType") String enterpriseType,@Param("enterpriseTime") String enterpriseTime);

    List<Enterprise> getEnterprisePageBean(HashMap map);
}