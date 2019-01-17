package mapper;

import org.apache.ibatis.annotations.Param;
import pojo.Department;
import pojo.DepartmentExample;

import java.util.List;

public interface DepartmentItemMapper
{
    List<Department> getExistDepartment();
}