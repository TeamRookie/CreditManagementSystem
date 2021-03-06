package mapper;

import org.apache.ibatis.annotations.Param;
import pojo.Production;
import pojo.ProductionExample;

import java.util.List;

public interface ProductionMapper {
    int countByExample(ProductionExample example);

    int deleteByExample(ProductionExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Production record);

    int insertSelective(Production record);

    List<Production> selectByExample(ProductionExample example);

    Production selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Production record, @Param("example") ProductionExample example);

    int updateByExample(@Param("record") Production record, @Param("example") ProductionExample example);

    int updateByPrimaryKeySelective(Production record);

    int updateByPrimaryKey(Production record);
}