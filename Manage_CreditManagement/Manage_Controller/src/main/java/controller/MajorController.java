package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pojo.Major;
import service.MajorService;

import java.util.List;

@Controller
public class MajorController
{
    @Autowired
    private MajorService majorService;
    @RequestMapping("/getMajor")
    @ResponseBody
    public List<Major> getMajor(String faculty)
    {
        if (faculty!=null&& !(StringUtils.isEmpty(faculty)))
        {
            List<Major> majorList = majorService.getMajorByFaculty(faculty);
            return majorList;
        }
       else
           return null;
    }
}
