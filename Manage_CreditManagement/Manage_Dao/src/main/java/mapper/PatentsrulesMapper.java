package mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pojo.Patentsrules;
import pojo.PatentsrulesExample;

public interface PatentsrulesMapper {
    int countByExample(PatentsrulesExample example);

    int deleteByExample(PatentsrulesExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Patentsrules record);

    int insertSelective(Patentsrules record);

    List<Patentsrules> selectByExample(PatentsrulesExample example);

    Patentsrules selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Patentsrules record, @Param("example") PatentsrulesExample example);

    int updateByExample(@Param("record") Patentsrules record, @Param("example") PatentsrulesExample example);

    int updateByPrimaryKeySelective(Patentsrules record);

    int updateByPrimaryKey(Patentsrules record);
}