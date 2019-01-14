package mapper;

import pojo.PageBean;
import pojo.Practicerules;

import java.util.List;

public interface PracticeItemMapper
{
    int getTotalCount();
    List<Practicerules> getPageBean(PageBean pageBean);
}