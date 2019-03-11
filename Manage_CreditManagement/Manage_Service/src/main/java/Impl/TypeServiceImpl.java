package Impl;

import mapper.TypeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pojo.Type;
import pojo.TypeExample;
import service.TypeService;

import java.util.List;

@Service
@Transactional
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

    @Override
    public int getTypeState()
    {
        TypeExample typeExample=new TypeExample();
        List<Type> typeList = typeMapper.selectByExample(typeExample);
        if (typeList!=null&&typeList.size()!=0)
        {
            return  typeList.get(0).getDisable();
        }
        return  -1;
    }

    @Override
    public int reverseTypeState()
    {
        TypeExample typeExample=new TypeExample();
        List<Type> typeList = typeMapper.selectByExample(typeExample);
        for (Type type:typeList)
        {
            if (type.getDisable()==1)
            {
                type.setDisable(0);
                typeMapper.updateByPrimaryKeySelective(type);
            }
            else
            {
                type.setDisable(1);
                typeMapper.updateByPrimaryKeySelective(type);
            }

        }
        return typeList.get(0).getDisable();
    }
}
