package controller;

import mapper.ContesttypeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import pojo.*;
import service.*;
import util.ImportExcelUtil;

import javax.servlet.http.HttpServletRequest;
import java.io.InputStream;
import java.util.List;

@Controller
public class ImportFileController
{
    @Autowired
    private ContestService contestService;
    @Autowired
    private ProjectService projectService;
    @Autowired
    private PracticeService practiceService;
    @Autowired
    private AssociationService associationService;
    @Autowired
    private CredentialService credentialService;
    @Autowired
    private  StudioService studioService;
    @Autowired
    private  TrainService trainService;
    @RequestMapping("/contestExcelImport")
    public String contestExcelImport(HttpServletRequest request)throws Exception{
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
            if(lo!=null&&lo.size()==2&&lo.get( 0 )!=null&&lo.get( 1 )!=null)
            {
                contestService.addContestType(String.valueOf(lo.get(0)).replace( ".00","" ), String.valueOf(lo.get(1)));
            }
        }
        return "redirect:contestImport.action";
    }
    @RequestMapping("/projectExcelImport")
    public String projectExcelImport(HttpServletRequest request)throws Exception{
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
        for (int i = 0; i <listob.size(); i++) {
            List<Object> lo = listob.get(i);
            Projecttype projecttype=new Projecttype();
            if(lo!=null&&lo.size()==6&&lo.get( 0 )!=null&&lo.get( 1 )!=null&&lo.get( 2 )!=null&&lo.get( 3 )!=null&&lo.get( 4 )!=null&&lo.get( 5) !=null)
            {
                projecttype.setProjecttime(String.valueOf(lo.get(0)).replace( ".00","" ));
                projecttype.setType(String.valueOf(lo.get(1)));
                projecttype.setProjectname(String.valueOf(lo.get(2)));
                projecttype.setProjectid(String.valueOf(lo.get(3)).replace( ".00","" ));
                projecttype.setProjectlevel( String.valueOf( lo.get( 4 ) ) );
                projecttype.setScore( String.valueOf( lo.get( 5 ) ) );
                projectService.addProjectType(projecttype);
            }
        }
        return "redirect:projectImport.action";
    }
    @RequestMapping("/practiceExcelImport")
    public String practiceExcelImport(HttpServletRequest request)throws Exception{
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
            Practicetype practicetype=new Practicetype();
            if(lo!=null&&lo.size()==4&&lo.get( 0 )!=null&&lo.get( 1 )!=null&&lo.get( 2 )!=null&&lo.get( 3 )!=null)
            {
                practicetype.setPracticetime(String.valueOf(lo.get(0)).replace( ".00","" ));
                practicetype.setPracticename(String.valueOf(lo.get(1)));

                practicetype.setPracticelevel( String.valueOf( lo.get( 2) ) );
                practicetype.setScore( String.valueOf( lo.get( 3) ) );

                practiceService.addPracticeType(practicetype);
            }
        }
        return "redirect:practiceImport.action";
    }
    @RequestMapping("/associationExcelImport")
    public String associationExcelImport(HttpServletRequest request)throws Exception{
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
            Associationtype associationtype=new Associationtype();

            if(lo!=null&&lo.size()==3&&lo.get( 0 )!=null&&lo.get(1)!=null&&lo.get( 2 )!=null)
            {
                    associationtype.setAssociationtime(String.valueOf(lo.get(0)).replace( ".00","" ));
                    associationtype.setAssociationname(String.valueOf(lo.get(1)));
                    associationtype.setAssociationlevel(String.valueOf(lo.get(2)));
                    associationService.addAssociationType(associationtype);
            }

        }
        return "redirect:associationImport.action";
    }
    @RequestMapping("/credentialExcelImport")
    public String credentialExcelImport(HttpServletRequest request)throws Exception{
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
            if (lo.size()==1&&lo.get(0)!=null)
            {
                credentialService.addCredentialType(String.valueOf(lo.get(0)));
            }

        }
        return "redirect:credentialImport.action";
    }
    @RequestMapping("/studioExcelImport")
    public String studioExcelImport(HttpServletRequest request)throws Exception{
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
            Studiotype studiotype=new Studiotype();
            if (lo!=null&&lo.size()==3&&lo.get( 0 )!=null&&lo.get(1)!=null&&lo.get( 2 )!=null)
            {
                studiotype.setStudiotime(String.valueOf(lo.get(0)).replace( ".00","" ));
                studiotype.setStudiolevel(String.valueOf(lo.get(1)));
                studiotype.setStudioname(String.valueOf(lo.get(2)));
                studioService.addStudioType(studiotype);
            }
        }
        return "redirect:studioImport.action";
    }

    @RequestMapping("/trainExcelImport")
    public String trainExcelImport(HttpServletRequest request)throws Exception{
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
            if(lo!=null&&lo.size()==2&&lo.get(0)!=null&&lo.get(1)!=null)
            {
                trainService.addTrainImport(String.valueOf(lo.get(0)),String.valueOf(lo.get(1)));
            }

        }
        return "redirect:trainImport.action";
    }




}
