package mapper;

import org.apache.ibatis.annotations.Param;
import pojo.Associationtype;
import pojo.AssociationtypeExample;

import java.util.List;

public interface AssociationtypeMapper {
    int countByExample(AssociationtypeExample example);

    int deleteByExample(AssociationtypeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Associationtype record);

    int insertSelective(Associationtype record);

    List<Associationtype> selectByExample(AssociationtypeExample example);

    Associationtype selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Associationtype record, @Param("example") AssociationtypeExample example);

    int updateByExample(@Param("record") Associationtype record, @Param("example") AssociationtypeExample example);

    int updateByPrimaryKeySelective(Associationtype record);

    int updateByPrimaryKey(Associationtype record);
}