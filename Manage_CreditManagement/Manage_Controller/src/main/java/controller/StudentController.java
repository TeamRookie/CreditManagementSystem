package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import pojo.Credit;
import pojo.PageBean;
import pojo.Student;
import pojo.Type;
import service.CreditService;
import service.StudentService;
import service.TypeService;
import util.UtilController;

import javax.servlet.http.HttpSession;
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

		return "credit";
	}

}
