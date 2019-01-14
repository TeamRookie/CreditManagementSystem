package Impl;

import mapper.YearsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pojo.Years;
import pojo.YearsExample;
import service.YearsService;

import java.util.List;

@Service
public class YearsServiceImpl implements YearsService
{
    @Autowired
    private YearsMapper yearsMapper;
    @Override
    public List<Years> getALlYears()
    {
        YearsExample yearsExample=new YearsExample();
        List<Years> yearsList = yearsMapper.selectByExample(yearsExample);
        return yearsList;
    }
}
