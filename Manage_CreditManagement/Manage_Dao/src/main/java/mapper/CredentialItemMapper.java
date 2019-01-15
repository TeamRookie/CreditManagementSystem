package mapper;

import org.apache.ibatis.annotations.Param;
import pojo.Credentialrules;
import pojo.PageBean;

import java.util.List;

public interface CredentialItemMapper
{
    int getTotalCount();
    List<Credentialrules> getPageBean(PageBean pageBean);
    int getContestCount(@Param("stuNum")String stuNum,@Param("theme")String theme,@Param("rank")String rank,@Param("searchDate")String searchDate);
}