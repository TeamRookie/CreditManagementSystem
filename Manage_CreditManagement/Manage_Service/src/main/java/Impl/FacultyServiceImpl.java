package Impl;

import mapper.FacultyMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pojo.Faculty;
import pojo.FacultyExample;
import service.FacultyService;

import java.util.List;

@Service
public class FacultyServiceImpl implements FacultyService
{
    @Autowired
    private FacultyMapper facultyMapper;
    @Override
    public List<Faculty> getFaculty()
    {
        FacultyExample facultyExample=new FacultyExample();
        List<Faculty> facultyList = facultyMapper.selectByExample(facultyExample);
        return  facultyList;
    }
}
