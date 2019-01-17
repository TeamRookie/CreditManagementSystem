package mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pojo.Practicetype;
import pojo.PracticetypeExample;

public interface PracticetypeMapper {
    int countByExample(PracticetypeExample example);

    int deleteByExample(PracticetypeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Practicetype record);

    int insertSelective(Practicetype record);

    List<Practicetype> selectByExample(PracticetypeExample example);

    Practicetype selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Practicetype record, @Param("example") PracticetypeExample example);

    int updateByExample(@Param("record") Practicetype record, @Param("example") PracticetypeExample example);

    int updateByPrimaryKeySelective(Practicetype record);

    int updateByPrimaryKey(Practicetype record);
}