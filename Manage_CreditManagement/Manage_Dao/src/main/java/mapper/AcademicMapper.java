package mapper;

import org.apache.ibatis.annotations.Param;
import pojo.Academic;
import pojo.AcademicExample;

import java.util.List;

public interface AcademicMapper {
    int countByExample(AcademicExample example);

    int deleteByExample(AcademicExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Academic record);

    int insertSelective(Academic record);

    List<Academic> selectByExample(AcademicExample example);

    Academic selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Academic record, @Param("example") AcademicExample example);

    int updateByExample(@Param("record") Academic record, @Param("example") AcademicExample example);

    int updateByPrimaryKeySelective(Academic record);

    int updateByPrimaryKey(Academic record);
}