package mapper;

import org.apache.ibatis.annotations.Param;
import pojo.Safety;
import pojo.SafetyExample;

import java.util.List;

public interface SafetyMapper {
    int countByExample(SafetyExample example);

    int deleteByExample(SafetyExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Safety record);

    int insertSelective(Safety record);

    List<Safety> selectByExample(SafetyExample example);

    Safety selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Safety record, @Param("example") SafetyExample example);

    int updateByExample(@Param("record") Safety record, @Param("example") SafetyExample example);

    int updateByPrimaryKeySelective(Safety record);

    int updateByPrimaryKey(Safety record);
}