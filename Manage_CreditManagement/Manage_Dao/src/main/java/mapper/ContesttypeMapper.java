package mapper;

import org.apache.ibatis.annotations.Param;
import pojo.Contesttype;
import pojo.ContesttypeExample;

import java.util.List;

public interface ContesttypeMapper {
    int countByExample(ContesttypeExample example);

    int deleteByExample(ContesttypeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Contesttype record);

    int insertSelective(Contesttype record);

    List<Contesttype> selectByExample(ContesttypeExample example);

    Contesttype selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Contesttype record, @Param("example") ContesttypeExample example);

    int updateByExample(@Param("record") Contesttype record, @Param("example") ContesttypeExample example);

    int updateByPrimaryKeySelective(Contesttype record);

    int updateByPrimaryKey(Contesttype record);
}