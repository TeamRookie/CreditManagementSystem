package Impl;

import mapper.StudentItemMapper;
import mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pojo.Credit;
import pojo.PageBean;
import pojo.Student;
import pojo.Type;
import service.CreditService;
import service.StudentService;
import service.TypeService;
import util.UtilController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;



@Service
public class StudentServiceImpl implements StudentService
{
    @Autowired
    private StudentMapper studentMapper;
    @Autowired
    private StudentItemMapper studentItemMapper;
    @Autowired
    private CreditService creditService;
    @Autowired
    private TypeService typeService;
    @Override
    public PageBean getStudentPageBean(Student student, Integer currentPage, Integer pageSize)
    {
        Integer totalCount=studentItemMapper.getStudentTotalCount(student);
        PageBean pageBean=new PageBean(pageSize,currentPage,totalCount);
        Integer start=(pageBean.getCurrentPage()-1)*pageBean.getPageSize();
        pageBean.setStart(start);
        HashMap map=new HashMap();
        map.put("pageBean",pageBean);
        map.put("student",student);
        List<Student> studentList= studentItemMapper.getStudentPageBean(map);
        for(Student st:studentList){
            /*没用 但也得有*/
            List<Credit> creditList = new ArrayList<Credit>();
            List<Type> typeList = typeService.getAllType();
            /*获取总分*/
            Float sum = UtilController.creditData(creditService, st.getNum(), typeList, creditList);
            st.setCreditSum(sum);
            System.out.println(st.getNum() +"的总分是:"+sum);
        }
        pageBean.setPageList(studentList);
        return  pageBean;
    }

	public Student selectByPrimaryKey(String num) {
		Student exStu = studentMapper.selectByPrimaryKey(num);
		return exStu;
	}
}
