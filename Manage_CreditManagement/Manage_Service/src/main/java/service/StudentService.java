package service;

import pojo.PageBean;
import pojo.Student;

import javax.servlet.ServletOutputStream;

public interface StudentService
{
    PageBean getStudentPageBean(Student student, Integer currentPage, Integer pageSize);

	Student selectByPrimaryKey(String num);
	void  studentExport(String[] titles, ServletOutputStream out,Student student);


    void addStudent(Student student);

    void deleteStudentByNum(String num);
}
