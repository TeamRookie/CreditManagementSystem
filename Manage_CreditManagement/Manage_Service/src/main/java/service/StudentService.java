package service;

import pojo.PageBean;
import pojo.Student;

public interface StudentService
{
    PageBean getStudentPageBean(Student student,Integer currentPage,Integer pageSize);
}
