package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pojo.Type;
import service.TypeService;

import java.util.List;

@Controller
public class TypeController
{
    @Autowired
    private TypeService typeService;
    @RequestMapping("/getType")
    @ResponseBody
    public List<Type> getType()
    {
        List<Type> typeList = typeService.getAllType();
        return  typeList;
    }
}
