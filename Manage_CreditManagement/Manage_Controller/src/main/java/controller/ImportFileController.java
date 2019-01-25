package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import pojo.Family;
import util.ImportExcelUtil;

import javax.servlet.http.HttpServletRequest;
import java.io.InputStream;
import java.util.List;

@Controller
public class ImportFileController
{
    @RequestMapping("/form")
    public String form(HttpServletRequest request)throws Exception{
        MultipartHttpServletRequest multipartRequest = (MultipartHttpServletRequest) request;

        InputStream in =null;
        List<List<Object>> listob = null;
        MultipartFile file = multipartRequest.getFile("upfile");

        if(file.isEmpty()){
            throw new Exception("文件不存在！");
        }
        in = file.getInputStream();
        listob = new ImportExcelUtil().getBankListByExcel(in,file.getOriginalFilename());
        in.close();

        //该处可调用service相应方法进行数据保存到数据库中，现只对数据输出
        for (int i = 0; i < listob.size(); i++) {
            List<Object> lo = listob.get(i);
            Family family = new Family();
            family.setJtbh(String.valueOf(lo.get(0)));
            family.setXm(String.valueOf(lo.get(1)));
            family.setHy(String.valueOf(lo.get(2)));
            family.setBz(String.valueOf(lo.get(3)));

            System.out.println("size : " + listob.size()+ "  打印信息-->"+family.toString());
        }

        return null;
    }

}
