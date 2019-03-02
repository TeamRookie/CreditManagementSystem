package mapper;

import org.apache.ibatis.annotations.Param;
import pojo.Credential;
import pojo.Credentialrules;
import pojo.Credentialtype;
import pojo.PageBean;

import java.util.HashMap;
import java.util.List;

public interface CredentialItemMapper
{
    int getTotalCount();
    List<Credentialrules> getPageBean(PageBean pageBean);
   int getCredentialImportTotalCount(@Param("information") String information);
   List<Credentialtype> getCredentialImportPageBean(HashMap map);

    Integer getCredentialTotalCount(@Param("studentNumber") String studentNumber,@Param("faculty")String faculty,@Param("major")String major,@Param("grade")String grade,@Param("credentialTime") String credentialTime,@Param("credentialType") String credentialType);

    List<Credential> getCredentialPageBean(HashMap map);

    List<Credentialtype> getAllCredentialType();

    List<Credential> getCredentialDownload(@Param("faculty") String faculty, @Param("major") String major,@Param("grade") String grade,@Param("credentialTime") String date,@Param("credentialType") String type);
}