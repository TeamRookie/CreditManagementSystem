package mapper;

import org.apache.ibatis.annotations.Param;
import pojo.Trainrules;
import pojo.TrainrulesExample;

import java.util.List;

public interface TrainrulesMapper {
    int countByExample(TrainrulesExample example);

    int deleteByExample(TrainrulesExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Trainrules record);

    int insertSelective(Trainrules record);

    List<Trainrules> selectByExample(TrainrulesExample example);

    Trainrules selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Trainrules record, @Param("example") TrainrulesExample example);

    int updateByExample(@Param("record") Trainrules record, @Param("example") TrainrulesExample example);

    int updateByPrimaryKeySelective(Trainrules record);

    int updateByPrimaryKey(Trainrules record);
}