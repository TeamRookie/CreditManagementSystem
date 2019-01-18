package mapper;


import org.apache.ibatis.annotations.Param;
import pojo.Association;
import pojo.Associationrules;
import pojo.Associationtype;
import pojo.PageBean;

import java.util.HashMap;
import java.util.List;

public interface AssociationItemMapper
{
    int getTotalCount();
    List<Associationrules> getPageBean(PageBean pageBean);

    Integer getAssociationImportTotalCount(@Param("associationName") String associationName,@Param("associationTime") String associationTime);

    List<Associationtype> getAssociationImportPageBean(HashMap map);

    Integer getAssociationTotalCount(@Param("studentNumber") String studentNumber,@Param("associationTime") String associationTime,@Param("associationName") String associationName,@Param("associationLevel") String associationLevel);

    List<Association> getAssociationPageBean(HashMap map);
}