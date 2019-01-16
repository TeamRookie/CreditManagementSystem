package mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pojo.Enterpriserules;
import pojo.EnterpriserulesExample;

public interface EnterpriserulesMapper {
    int countByExample(EnterpriserulesExample example);

    int deleteByExample(EnterpriserulesExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Enterpriserules record);

    int insertSelective(Enterpriserules record);

    List<Enterpriserules> selectByExample(EnterpriserulesExample example);

    Enterpriserules selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Enterpriserules record, @Param("example") EnterpriserulesExample example);

    int updateByExample(@Param("record") Enterpriserules record, @Param("example") EnterpriserulesExample example);

    int updateByPrimaryKeySelective(Enterpriserules record);

    int updateByPrimaryKey(Enterpriserules record);
}