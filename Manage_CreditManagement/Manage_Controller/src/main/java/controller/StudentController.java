package controller;

import mapper.StudentItemMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import pojo.PageBean;
import pojo.Student;
import service.StudentService;

@Controller
public class StudentController
{

    @Value("${PageSize}")
    private  Integer pageSize;
    @Autowired
    private StudentService studentService;
    @RequestMapping("/getStudent")
    public  String getStudent(Model model, Student student, Integer currentPage)
    {
        PageBean pageBean=studentService.getStudentPageBean(student,currentPage,pageSize);
        model.addAttribute("student",student);
        model.addAttribute("pageBean",pageBean);
        return "role/student";
    }
}
