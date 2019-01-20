package mapper;

import org.apache.ibatis.annotations.Param;
import pojo.Patents;
import pojo.PatentsExample;

import java.util.List;

public interface PatentsMapper {
    int countByExample(PatentsExample example);

    int deleteByExample(PatentsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Patents record);

    int insertSelective(Patents record);

    List<Patents> selectByExample(PatentsExample example);

    Patents selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Patents record, @Param("example") PatentsExample example);

    int updateByExample(@Param("record") Patents record, @Param("example") PatentsExample example);

    int updateByPrimaryKeySelective(Patents record);

    int updateByPrimaryKey(Patents record);
}