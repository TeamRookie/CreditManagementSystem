package Impl;

import mapper.MajorMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pojo.Major;
import pojo.MajorExample;
import service.MajorService;

import javax.naming.ldap.PagedResultsControl;
import java.util.List;

@Service
public class MajorServiceImpl implements MajorService
{
    @Autowired
    private MajorMapper majorMapper;
    @Override
    public List<Major> getMajorByFaculty(String faculty)
    {
        MajorExample majorExample=new MajorExample();
        MajorExample.Criteria criteria = majorExample.createCriteria();
        criteria.andFacultynameEqualTo(faculty);
        List<Major> majorList = majorMapper.selectByExample(majorExample);
        return majorList;
    }
}
