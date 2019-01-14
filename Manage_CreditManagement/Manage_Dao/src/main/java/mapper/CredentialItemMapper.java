package mapper;

import pojo.Credentialrules;
import pojo.PageBean;

import java.util.List;

public interface CredentialItemMapper
{
    int getTotalCount();
    List<Credentialrules> getPageBean(PageBean pageBean);
}