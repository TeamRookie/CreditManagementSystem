package mapper;

import pojo.PageBean;
import pojo.Studiorules;

import java.util.List;

public interface StudioItemMapper
{
    int getTotalCount();
    List<Studiorules> getPageBean(PageBean pageBean);
}