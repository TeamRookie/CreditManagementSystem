package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pojo.Grade;
import service.GradeService;

import java.util.List;

@Controller
public class GradeController
{
    @Autowired
    private GradeService gradeService;
    @RequestMapping("/getGrade")
    @ResponseBody
    public List<Grade> getGrade(String major)
    {
        if (major!=null&&!(StringUtils.isEmpty(major)))
        {
           List<Grade> gradeList= gradeService.getGradeByMajor(major);
           return  gradeList;
        }
        return null;
    }
}
