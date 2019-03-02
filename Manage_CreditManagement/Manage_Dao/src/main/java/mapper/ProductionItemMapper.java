package mapper;

import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.ResponseBody;
import pojo.PageBean;
import pojo.Production;
import pojo.Productionrules;

import java.util.HashMap;
import java.util.List;

public interface ProductionItemMapper
{
    int getTotalCount();
    List<Productionrules> getPageBean(PageBean pageBean);

    Integer getProductionTotalCount(@Param("studentNumber") String studentNumber,@Param("faculty")String faculty,@Param("major")String major,@Param("grade")String grade,@Param("productionType") String productionType,@Param("productionTime") String productionTime);

    List<Production> getProductionPageBean(HashMap map);

    List<Production> getProductionDownload(@Param("faculty") String faculty, @Param("major") String major,@Param("grade") String grade,@Param("date") String date,@Param("productionTime") String productionTime,@Param("productionType") String productionType);
}