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

    Integer getAssociationTotalCount(@Param("studentNumber") String studentNumber,@Param("faculty")String faculty,@Param("major")String major,@Param("grade")String grade,@Param("associationTime") String associationTime,@Param("associationName") String associationName,@Param("associationLevel") String associationLevel);

    List<Association> getAssociationPageBean(HashMap map);

    List<Association> getAssociationDownload(@Param("faculty") String faculty,@Param("major") String major,@Param("grade") String grade,@Param("date") String date,@Param("associationName") String associationName,@Param("associationTime") String associationTime,@Param("associationLevel") String associationLevel);
}