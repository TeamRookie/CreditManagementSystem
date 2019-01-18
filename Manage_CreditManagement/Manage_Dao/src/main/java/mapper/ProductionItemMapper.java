package mapper;

import org.apache.ibatis.annotations.Param;
import pojo.PageBean;
import pojo.Production;
import pojo.Productionrules;

import java.util.HashMap;
import java.util.List;

public interface ProductionItemMapper
{
    int getTotalCount();
    List<Productionrules> getPageBean(PageBean pageBean);

    Integer getProductionTotalCount(@Param("studentNumber") String studentNumber,@Param("productionType") String productionType,@Param("productionTime") String productionTime);

    List<Production> getProductionPageBean(HashMap map);
}