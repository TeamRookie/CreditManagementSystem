package mapper;


import pojo.Student;

import java.util.HashMap;
import java.util.List;

public interface StudentItemMapper
{
    List<Student> getStudentPageBean(HashMap map);

    Integer getStudentTotalCount(Student student);
}