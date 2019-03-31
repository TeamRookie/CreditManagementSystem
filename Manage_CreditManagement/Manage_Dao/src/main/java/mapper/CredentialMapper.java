package mapper;

import org.apache.ibatis.annotations.Param;
import pojo.Credential;
import pojo.CredentialExample;

import java.util.List;

public interface CredentialMapper {
    int countByExample(CredentialExample example);

    int deleteByExample(CredentialExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Credential record);

    int insertSelective(Credential record);

    List<Credential> selectByExample(CredentialExample example);

    Credential selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Credential record, @Param("example") CredentialExample example);

    int updateByExample(@Param("record") Credential record, @Param("example") CredentialExample example);

    int updateByPrimaryKeySelective(Credential record);

    int updateByPrimaryKey(Credential record);
}