package mapper;

import org.apache.ibatis.annotations.Param;
import pojo.Sciencerules;
import pojo.SciencerulesExample;

import java.util.List;

public interface SciencerulesMapper {
    int countByExample(SciencerulesExample example);

    int deleteByExample(SciencerulesExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Sciencerules record);

    int insertSelective(Sciencerules record);

    List<Sciencerules> selectByExample(SciencerulesExample example);

    Sciencerules selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Sciencerules record, @Param("example") SciencerulesExample example);

    int updateByExample(@Param("record") Sciencerules record, @Param("example") SciencerulesExample example);

    int updateByPrimaryKeySelective(Sciencerules record);

    int updateByPrimaryKey(Sciencerules record);
}