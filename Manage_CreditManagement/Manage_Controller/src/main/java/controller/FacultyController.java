package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pojo.Faculty;
import service.FacultyService;

import java.util.List;

@Controller
public class FacultyController
{
    @Autowired
    private  FacultyService  facultyService;
    @RequestMapping("/getFaculty")
    @ResponseBody
    public  List<Faculty> getFaculty()
    {
        List<Faculty> facultyList=facultyService.getFaculty();
        return facultyList;
    }
}
