package mapper;

import pojo.PageBean;
import pojo.Safetyrules;

import java.util.List;

public interface SafetyItemMapper
{
   int getTotalCount();
   List<Safetyrules> getPageBean(PageBean pageBean);
}