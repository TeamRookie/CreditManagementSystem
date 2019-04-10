package controller;

import org.apache.http.HttpRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import pojo.*;
import service.CreditService;
import service.StudentService;
import service.TypeService;
import util.ImportExcelUtil;
import util.UtilController;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

@Controller
public class StudentController
{

    @Value("${PageSize}")
    private  Integer pageSize;
    @Autowired
    private StudentService studentService;
	@Autowired
	private CreditService creditService;
	@Autowired
    private TypeService typeService;

    @RequestMapping("/getStudent")
    public  String getStudent(Model model, Student student, Integer currentPage)
    {

        PageBean pageBean=studentService.getStudentPageBean(student,currentPage,pageSize);
        model.addAttribute("student",student);
        model.addAttribute("pageBean",pageBean);
        return "role/student";
    }
	// credit 所需准备材料
	@RequestMapping("/credit")
	public String credit(Model model, HttpSession session, String num) {
		
		List<Credit> creditList = new ArrayList<Credit>();
		List<Type> typeList = typeService.getAllType();
		Student student = studentService.selectByPrimaryKey(num);
		
		Float sum = UtilController.creditData(creditService, student.getNum(), typeList, creditList);
		
		model.addAttribute("creditList", creditList);
		model.addAttribute("totalCredit", sum);
        model.addAttribute("student",student);
		return "role/credit";
	}
	@RequestMapping("/deleteStudent")
    public  String deleteStudent(String num)
    {
        studentService.deleteStudentByNum(num);
        return  "redirect:getStudent.action";
    }
    @RequestMapping("/studentDownload")
    public   @ResponseBody
    String studentDownload(HttpServletResponse response, Student student,String name    )
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

            String[] titles = {"学号","姓名","学院","专业","班级","总学分"};
            studentService.studentExport(titles, out,student);
            return "success";
        } catch(Exception e){
            e.printStackTrace();
            return "导出信息失败";
        }
    }
    @RequestMapping("/studentImport")
    public  String studentImport(HttpServletRequest request) throws Exception
    {
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
        Student student=new Student();
        //该处可调用service相应方法进行数据保存到数据库中，现只对数据输出
        for (int i = 0; i <listob.size(); i++) {
            List<Object> lo = listob.get(i);
            if(lo!=null&&lo.get(0)!=null&&lo.get(1)!=null&&lo.get(2)!=null&&lo.get(3)!=null)
            {
                student.setNum(String.valueOf(lo.get(0)).trim());
                student.setStuname(String.valueOf(lo.get(1)).replaceAll( " ","" ).trim());
                student.setId(String.valueOf(lo.get(2)).trim());
                student.setFacultyname(String.valueOf(lo.get(3)).trim());
                student.setMajorname(String.valueOf(lo.get(4)).trim());
                student.setGradename(String.valueOf(lo.get(5)).trim());
                student.setStudenttime(String.valueOf(6).trim());
                student.setStatus( 0 );
                student.setRole( 0 );

                student.setPassword( String.valueOf( lo.get( 0 ) ).trim() );
                studentService.addStudent(student);
            }
        }
        return  "redirect:getStudent.action";
    }

}
