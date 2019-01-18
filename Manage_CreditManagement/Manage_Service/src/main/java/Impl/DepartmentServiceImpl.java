package Impl;

import mapper.DepartmentItemMapper;
import mapper.DepartmentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pojo.Department;
import pojo.DepartmentExample;
import service.DepartmentService;

import java.util.List;
@Service
public class DepartmentServiceImpl implements DepartmentService
{
    @Autowired
    private DepartmentMapper departmentMapper;
    @Autowired
    private DepartmentItemMapper departmentItemMapper;
    @Override
    public List<Department> getAllDepartment()
    {
        DepartmentExample departmentExample=new DepartmentExample();
        List<Department> departmentList = departmentMapper.selectByExample(departmentExample);
        return departmentList;
    }

    @Override
    public List<Department> getExistSudioDepartment()
    {
        List<Department> departmentList = departmentItemMapper.getExistStudioDepartment();
        return departmentList;
    }
}
