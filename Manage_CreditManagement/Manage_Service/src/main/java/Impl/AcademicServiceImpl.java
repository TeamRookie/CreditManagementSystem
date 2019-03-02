package Impl;
import mapper.AcademicMapper;
import mapper.AcademicItemMapper;
import mapper.AcademicrulesMapper;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;
import pojo.*;
import service.AcademicService;

import javax.servlet.ServletOutputStream;
import java.util.HashMap;
import java.util.List;

@Service
@Transactional
public class AcademicServiceImpl implements AcademicService
{

    @Autowired
    private AcademicrulesMapper academicRulesMapper;
    @Autowired
    private AcademicItemMapper academicItemMapper;
    @Autowired
    private AcademicMapper academicMapper;
    @Override
    public PageBean getPageBean(Integer pageSize, Integer currentPage)
    {
        Integer totalCount=0;
        totalCount= academicItemMapper.getTotalCount();
        PageBean pageBean=new PageBean(pageSize,currentPage,totalCount);
        Integer start=(pageBean.getCurrentPage()-1)*pageBean.getPageSize();
        pageBean.setStart(start);
        List<Academicrules> academicRulesList = academicItemMapper.getPageBean(pageBean);
        pageBean.setPageList(academicRulesList);
        return  pageBean;
    }

    @Override
    public List<Academicrules> getAcademicRules()
    {
        AcademicrulesExample academicrulesExample= new AcademicrulesExample();
        List<Academicrules> academicRulesList = academicRulesMapper.selectByExample(academicrulesExample);
        return  academicRulesList;
    }

    @Override
    public void academicExport(String[] titles, ServletOutputStream outputStream, String faculty, String major, String grade, String department, String date)
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
            List<Academic> academics = academicItemMapper.getAcademicDownload(null,faculty,major,grade,date,department);
               for (int i = 0; i < academics.size(); i++) {
                row = sheet.createRow(i+1);
                Academic academic=academics.get(i);

                // 第六步，创建单元格，并设置值

                if(academic.getStunum() != null){
                    row.createCell(0).setCellValue(academic.getStunum());
                }
                if(academic.getStuname() != null){
                     row.createCell(1).setCellValue(academic.getStuname());
                }
                if(academic.getFacultyname()!= null){
                    row.createCell(2).setCellValue(academic.getFacultyname());
                }
                if (academic.getMajorname()!=null)
                {
                    row.createCell(3).setCellValue(academic.getFacultyname());
                }
                if(academic.getGradename() !=null){
                    row.createCell(4).setCellValue(academic.getGradename());
                }
                   if(academic.getAcademictime() !=null){
                       row.createCell(5).setCellValue(academic.getAcademictime());
                   }
                   if(academic.getTheme() !=null){
                       row.createCell(6).setCellValue(academic.getTheme());
                   }
                   if(academic.getAddress() !=null){
                       row.createCell(7).setCellValue(academic.getAddress());
                   }
                   if(academic.getUndertake() !=null){
                       row.createCell(8).setCellValue(academic.getUndertake());
                   }
                   if(academic.getAmount() !=null){
                       row.createCell(9).setCellValue(academic.getAmount());
                   }
            }

            // 第七步，将文件输出到客户端浏览器
            try {
                workbook.write(outputStream);
                outputStream.flush();
                outputStream.close();

            } catch (Exception e) {
                e.printStackTrace();
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }


    @Override
    public PageBean getAcademicPageBean(String studentNumber, String faculty, String major, String grade, String academicTime, String academicDepartment, Integer currentPage, Integer pageSize)
    {
        int totalCount = academicItemMapper.getAcademicTotalCount(studentNumber,faculty,major,grade,academicTime,academicDepartment);
        PageBean pageBean=new PageBean(pageSize,currentPage,totalCount);
        Integer start=(pageBean.getCurrentPage()-1)*pageBean.getPageSize();
        pageBean.setStart(start);
        HashMap map=new HashMap();
        map.put("pageBean",pageBean);
        map.put("studentNumber",studentNumber);
        map.put("academicTime",academicTime);
        map.put("academicDepartment",academicDepartment);
        map.put("faculty",faculty);
        map.put("major",major);
        map.put("grade",grade);
        List<Academic> academicList = academicItemMapper.getAcademicPageBean(map);
        pageBean.setPageList(academicList);
        return  pageBean;
    }



}
