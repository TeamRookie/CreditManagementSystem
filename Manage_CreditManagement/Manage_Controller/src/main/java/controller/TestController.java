package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController
{
    @RequestMapping("/index")
    public String getIndex()
    {
        System.out.println("hello word!");
        return  null;
    }
}
