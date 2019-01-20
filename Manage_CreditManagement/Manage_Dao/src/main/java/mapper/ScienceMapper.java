package mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pojo.Science;
import pojo.ScienceExample;

public interface ScienceMapper {
    int countByExample(ScienceExample example);

    int deleteByExample(ScienceExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Science record);

    int insertSelective(Science record);

    List<Science> selectByExample(ScienceExample example);

    Science selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Science record, @Param("example") ScienceExample example);

    int updateByExample(@Param("record") Science record, @Param("example") ScienceExample example);

    int updateByPrimaryKeySelective(Science record);

    int updateByPrimaryKey(Science record);
}