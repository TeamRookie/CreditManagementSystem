package Impl;

import mapper.TypeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pojo.Type;
import pojo.TypeExample;
import service.TypeService;

import java.util.List;

@Service
public class TypeServiceImpl implements TypeService
{
    @Autowired
    private TypeMapper typeMapper;
    @Override
    public List<Type> getAllType()
    {
        TypeExample typeExample=new TypeExample();
        List<Type> typeList = typeMapper.selectByExample(typeExample);
        return  typeList;
    }
}
