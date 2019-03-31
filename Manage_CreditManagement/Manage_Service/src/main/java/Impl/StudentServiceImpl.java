package Impl;

import jdk.nashorn.internal.codegen.TypeMap;
import mapper.StudentItemMapper;
import mapper.StudentMapper;
import mapper.TypeMapper;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pojo.*;
import service.CreditService;
import service.StudentService;
import service.TypeService;
import util.UtilController;

import javax.servlet.ServletOutputStream;
import java.util.*;


@Service
public class StudentServiceImpl implements StudentService
{
    @Autowired
    private TypeMapper typeMapper;
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
/*        for(Student st:studentList){
            *//*没用 但也得有*//*
            List<Credit> creditList = new ArrayList<Credit>();
            List<Type> typeList = typeService.getAllType();
            *//*获取总分*//*
            Float sum = UtilController.creditData(creditService, st.getNum(), typeList, creditList);
            st.setCreditSum(sum);
          *//*  System.out.println(st.getNum() +"的总分是:"+sum);*//*
        }*/
//        Collections.sort(studentList, new Comparator<Student>()
//        {
//            @Override
//            public int  compare(Student o1, Student o2)
//            {
//                return (int)Math.ceil(o2.getCreditSum()-o1.getCreditSum());
//            }
//        });
        pageBean.setPageList(studentList);
        return  pageBean;
    }

	public Student selectByPrimaryKey(String num) {
		Student exStu = studentMapper.selectByPrimaryKey(num);
		return exStu;
	}

    @Override
    public void studentExport(String[] titles, ServletOutputStream out, Student student)
    {
        try{
            // 第一步，创建一个workbook，对应一个Excel文件
            XSSFWorkbook workbook = new XSSFWorkbook();

            // 第二步，在webbook中添加一个sheet,对应Excel文件中的sheet
            XSSFSheet sheet = workbook.createSheet("sheet1");

            // 第三步，在sheet中添加表头第0行,注意老版本poi对Excel的行数列数有限制short

            Row row = sheet.createRow(0);
            // 第四步，创建单元格，并设置值表头 设置表头居中
            CellStyle cellStyle = workbook.createCellStyle();
            cellStyle.setDataFormat(workbook.createDataFormat().getFormat("yyyy-MM-dd HH:mm:ss"));
            for (int i = 0; i < titles.length; i++) {
                Cell cell = row.createCell(i);//列索引从0开始
                cell.setCellValue(titles[i]);//列名1
                cell.setCellStyle(cellStyle);//列居中显示
            }
            List<Student> studentList = studentItemMapper.getStudentDownload(student);
            for(Student st:studentList){

                List<Credit> creditList = new ArrayList<Credit>();
                List<Type> typeList = typeService.getAllType();

                Float sum = UtilController.creditData(creditService, st.getNum(), typeList, creditList);
                st.setCreditSum(sum);
   /*               System.out.println(st.getNum() +"的总分是:"+sum);*/
            }
            for (int i = 0; i < studentList.size(); i++) {
                row = sheet.createRow(i+1);
                Student item=studentList.get(i);

                // 第六步，创建单元格，并设置值

                if(item.getNum() != null){
                    row.createCell(0).setCellValue(item.getNum());
                }
                if(item.getStuname() != null){
                    row.createCell(1).setCellValue(item.getStuname());
                }
                if(item.getFacultyname()!= null){
                    row.createCell(2).setCellValue(item.getFacultyname());
                }
                if (item.getMajorname()!=null)
                {
                    row.createCell(3).setCellValue(item.getFacultyname());
                }
                if(item.getGradename() !=null){
                    row.createCell(4).setCellValue(item.getGradename());
                }
                if(item.getCreditSum() !=0){
                    row.createCell(5).setCellValue(item.getCreditSum());
                }
            }

            // 第七步，将文件输出到客户端浏览器
            try {
                workbook.write(out);
                out.flush();
                out.close();

            } catch (Exception e) {
                e.printStackTrace();
            }
        }catch(Exception e){
            e.printStackTrace();
        }

    }


    @Override
    public void addStudent(Student student)
    {
        student.setStatus(1);
        student.setRole(0);
        student.setPassword(student.getNum());
        Student stu = studentMapper.selectByPrimaryKey( student.getNum() );
        if(stu==null)
        {
            studentMapper.insert(student);
        }

    }

    @Override
    public void deleteStudentByNum(String num)
    {
        studentMapper.deleteByPrimaryKey(num);
    }
}
