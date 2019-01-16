package mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pojo.Traintype;
import pojo.TraintypeExample;

public interface TraintypeMapper {
    int countByExample(TraintypeExample example);

    int deleteByExample(TraintypeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Traintype record);

    int insertSelective(Traintype record);

    List<Traintype> selectByExample(TraintypeExample example);

    Traintype selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Traintype record, @Param("example") TraintypeExample example);

    int updateByExample(@Param("record") Traintype record, @Param("example") TraintypeExample example);

    int updateByPrimaryKeySelective(Traintype record);

    int updateByPrimaryKey(Traintype record);
}