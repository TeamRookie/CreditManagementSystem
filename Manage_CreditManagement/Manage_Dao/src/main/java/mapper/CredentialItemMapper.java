package mapper;

import org.apache.ibatis.annotations.Param;
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
}