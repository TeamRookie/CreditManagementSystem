package Impl;

import mapper.StudentItemMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pojo.PageBean;
import pojo.Student;
import service.StudentService;

import java.util.HashMap;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService
{
    @Autowired
    private StudentItemMapper studentItemMapper;
    @Override
    public PageBean getStudentPageBean(Student student, Integer currentPage, Integer pageSize)
    {
        Integer totalCount=studentItemMapper.getStudentTotalCount(student);
        PageBean pageBean=new PageBean(pageSize,currentPage,totalCount);
        Integer start=(pageBean.getCurrentPage()-1)*pageBean.getPageSize();
        pageBean.setStart(start);
        HashMap map=new HashMap();
        map.put("pageBean",pageBean);
        map.put("student",student);
        List<Student> studentList= studentItemMapper.getStudentPageBean(map);
        pageBean.setPageList(studentList);
        return  pageBean;
    }
}
