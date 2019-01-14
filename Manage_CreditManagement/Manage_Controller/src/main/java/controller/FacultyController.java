package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import service.FacultyService;

@Controller
public class FacultyController
{
    @Autowired
    private  FacultyService  facultyService;
    @RequestMapping("/getFaculty")
    public  String getFaculty()
    {
        return "facultyInformation";
    }
}
