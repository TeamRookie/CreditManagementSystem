package Impl;

import mapper.GradeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pojo.Grade;
import pojo.GradeExample;
import service.GradeService;

import java.util.List;

@Service
public class GradeServiceImpl implements GradeService
{
    @Autowired
    private GradeMapper gradeMapper;
    @Override
    public List<Grade> getGradeByMajor(String major)
    {
        GradeExample gradeExample=new GradeExample();
        GradeExample.Criteria criteria = gradeExample.createCriteria();
        criteria.andMajornameEqualTo(major);
        List<Grade> gradeList = gradeMapper.selectByExample(gradeExample);
        return gradeList;
    }
}
