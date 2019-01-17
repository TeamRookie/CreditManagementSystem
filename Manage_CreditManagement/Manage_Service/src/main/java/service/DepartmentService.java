package service;

import pojo.Department;

import java.util.List;

public interface DepartmentService
{
    List<Department> getAllDepartment();
    List<Department> getExistDepartment();
}
