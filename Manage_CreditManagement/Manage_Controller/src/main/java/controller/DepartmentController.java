package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pojo.Department;
import service.DepartmentService;

import java.util.List;

@Controller
public class DepartmentController
{
    @Autowired
    private DepartmentService departmentService;
    @RequestMapping("/getAllDepartment")
    @ResponseBody
    public List<Department> getAllDepartment()
    {
        List<Department> departmentList = departmentService.getAllDepartment();
        return departmentList;
    }
    @RequestMapping("/getExistStudioDepartment")
    @ResponseBody
    public  List<Department> getExistStudioDepartment()
    {
        List<Department> departmentList=departmentService.getExistSudioDepartment();
        return  departmentList;
    }
}
