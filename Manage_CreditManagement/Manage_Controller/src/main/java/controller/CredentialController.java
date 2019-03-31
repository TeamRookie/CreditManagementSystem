package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import pojo.Credentialtype;
import pojo.PageBean;
import service.CredentialService;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.List;
@Controller
public class CredentialController
{
    @Value("${PageSize}")
    private  Integer pageSize;
    @Autowired
    private CredentialService credentialService;
    @RequestMapping("/credentialRules")
    public  String getCredentialRules(Model model,Integer currentPage)
    {
        PageBean pageBean = credentialService.getPageBean(pageSize, currentPage);
        model.addAttribute("pageBean",pageBean);
        return "rules/credentialRules";
    }
    @RequestMapping("/credential")
    public  String getCredential(Model model,String studentNumber,String faculty,String major,String grade,String credentialTime,String credentialType,Integer currentPage)
    {
        PageBean pageBean=credentialService.getCredentialPageBean(studentNumber,faculty,major,grade,credentialTime,credentialType,currentPage,pageSize);
        model.addAttribute("credentialTime",credentialTime);
        model.addAttribute("credentialType",credentialType);
        model.addAttribute("studentNumber",studentNumber);
        model.addAttribute("pageBean",pageBean);
        model.addAttribute("faculty",faculty);
        model.addAttribute("major",major);
        model.addAttribute("grade",grade);
        return  "information/credential";
    }
    @RequestMapping("/credentialImport")
    public  String getCredentialImport(Model model,String information,Integer currentPage)
    {
        PageBean pageBean = credentialService.getCredentialImportPageBean(information, currentPage, pageSize);
        model.addAttribute("pageBean",pageBean);
        model.addAttribute("information",information);
        return "import/credentialImport";
    }
    @RequestMapping(value = "/addCredentialType",method = RequestMethod.POST)
    public String addCredentialType(String addInformation)
    {
        credentialService.addCredentialType(addInformation);
        return "redirect:credentialImport.action";
    }
    @RequestMapping("/deleteCredentialType")
    public  String deleteCredentialType(Integer id)
    {
        credentialService.deleteCredentialTypeById(id);
        return "redirect:credentialImport.action";
    }
    @RequestMapping("/getCredentialType")
    @ResponseBody
    public List<Credentialtype> getCredentialType()
    {
        List<Credentialtype> credentialtypeList= credentialService.getAllCredentialType();
        return  credentialtypeList;
    }
    @RequestMapping("/credentialDownload")
    @ResponseBody
    public  String credentialDownload(HttpServletResponse response, String name, String faculty, String major, String grade, String date,String type)
    {
        response.setContentType("application/binary;charset=UTF-8");
        try{
            ServletOutputStream out=response.getOutputStream();
            try {
                //设置文件头：最后一个参数是设置下载文件名(这里我们叫：张三.pdf)
                response.setHeader("Content-Disposition", "attachment;fileName=" + URLEncoder.encode(name+".xlsx", "UTF-8"));
            } catch (UnsupportedEncodingException e1) {
                e1.printStackTrace();
            }

            String[] titles = {"学号","姓名","学院","专业","班级","发证时间","证书类型","考试结果","学分"};
            credentialService.credentialExport(titles, out,faculty,major,grade,date,type);
            return "success";
        } catch(Exception e){
            e.printStackTrace();
            return "导出信息失败";
        }
    }
}
