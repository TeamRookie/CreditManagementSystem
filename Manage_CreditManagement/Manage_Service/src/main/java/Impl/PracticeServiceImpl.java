package Impl;

import mapper.PracticeItemMapper;
import mapper.PracticerulesMapper;
import mapper.PracticetypeMapper;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pojo.*;
import service.PracticeService;


import javax.servlet.ServletOutputStream;
import java.util.HashMap;
import java.util.List;

@Service
@Transactional
public class PracticeServiceImpl implements PracticeService
{
    @Autowired
    private PracticerulesMapper practicerulesMapper;
    @Autowired
    private PracticeItemMapper practiceItemMapper;
    @Autowired
    private PracticetypeMapper practicetypeMapper;
    @Override
    public List<Practicerules> getPracticeRules()
    {
        PracticerulesExample practicerulesExample=new PracticerulesExample();
        List<Practicerules> practiceRulesList = practicerulesMapper.selectByExample(practicerulesExample);
        return  practiceRulesList;
    }
    public PageBean getPageBean(Integer pageSize, Integer currentPage)
    {
        Integer totalCount=0;
        totalCount=practiceItemMapper.getTotalCount();
        PageBean pageBean=new PageBean(pageSize,currentPage,totalCount);
        Integer start=(pageBean.getCurrentPage()-1)*pageBean.getPageSize();
        pageBean.setStart(start);
        List<Practicerules> practiceRulesList = practiceItemMapper.getPageBean(pageBean);
        pageBean.setPageList(practiceRulesList);
        return  pageBean;
    }

    @Override
    public PageBean getPracticeImportPageBean(String practiceTime, String practiceName, String practiceType, String practiceLevel, String practiceScore, Integer currentPage, Integer pageSize)
    {
        Integer totalCount=0;
        totalCount=practiceItemMapper.getPracticeImportTotalCount(practiceTime,practiceName);
        PageBean pageBean=new PageBean(pageSize,currentPage,totalCount);
        Integer start=(pageBean.getCurrentPage()-1)*pageBean.getPageSize();
        pageBean.setStart(start);
        HashMap map=new HashMap();
        map.put("pageBean",pageBean);
        map.put("practiceName",practiceName);
        map.put("practiceTime",practiceTime);
        map.put( "practiceLevel",practiceLevel );
        map.put( "practiceScore",practiceScore );
        map.put( "practiceType",practiceTime );
        List<Practicetype> practiceTypeList = practiceItemMapper.getPracticeImportPageBean(map);
        pageBean.setPageList(practiceTypeList);
        return  pageBean;
    }

    @Override
    public void addPracticeType(Practicetype practicetype)
    {
        practicetypeMapper.insertSelective(practicetype);
    }

    @Override
    public PageBean getPracticePageBean( String faculty, String major, String grade,String practiceName, String practiceTime, String practiceType, String practiceLevel, String practiceScore, Integer currentPage, Integer pageSize)
    {
        Integer totalCount=practiceItemMapper.getPracticeTotalCount(faculty,major,grade,practiceName,practiceTime,practiceType,practiceLevel,practiceScore);
        PageBean pageBean=new PageBean(pageSize,currentPage,totalCount);
        Integer start=(pageBean.getCurrentPage()-1)*pageBean.getPageSize();
        pageBean.setStart(start);
        HashMap map=new HashMap();
        map.put("pageBean",pageBean);
        map.put("practiceTime",practiceTime);
        map.put("practiceType",practiceType);
        map.put("practiceName",practiceName);
        map.put("practiceLevel",practiceLevel);
        map.put("practiceScore",practiceScore);
        map.put("faculty",faculty);
        map.put("major",major);
        map.put("grade",grade);
        List<Practice> practiceList=practiceItemMapper.getPracticePageBean(map);
        pageBean.setPageList(practiceList);
        return pageBean;
    }

    @Override
    public void deletePracticeTypeById(Integer id)
    {
        practicetypeMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void practiceExport(String[] titles, ServletOutputStream out, String faculty, String major, String grade, String date, String practiceLevel, String practiceName, String practiceScore, String practiceType)
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
            List<Practice> practiceList = practiceItemMapper.getPracticeDownload(faculty,major,grade,date,practiceLevel,practiceName,practiceScore,practiceType);
            for (int i = 0; i < practiceList.size(); i++) {
                row = sheet.createRow(i+1);
                Practice practice=practiceList.get(i);

                // 第六步，创建单元格，并设置值

                if(practice.getStunum() != null){
                    row.createCell(0).setCellValue(practice.getStunum());
                }
                if(practice.getStuname() != null){
                    row.createCell(1).setCellValue(practice.getStuname());
                }
                if(practice.getFacultyname()!= null){
                    row.createCell(2).setCellValue(practice.getFacultyname());
                }
                if (practice.getMajorname()!=null)
                {
                    row.createCell(3).setCellValue(practice.getFacultyname());
                }
                if(practice.getGradename() !=null){
                    row.createCell(4).setCellValue(practice.getGradename());
                }
                if(practice.getPracticetime() !=null){
                    row.createCell(5).setCellValue(practice.getPracticetime());
                }
                if(practice.getPracticetype() !=null){
                    row.createCell(6).setCellValue(practice.getPracticetype());
                }
                if(practice.getPracticename() !=null){
                    row.createCell(7).setCellValue(practice.getPracticename());
                }
                if(practice.getPracticelevel() !=null){
                    row.createCell(8).setCellValue(practice.getPracticelevel());
                }
                if (practice.getScore()!=null)
                {
                    row.createCell(9).setCellValue(practice.getScore()  );
                }
                if (practice.getMember()!=null)
                {
                    row.createCell(10).setCellValue(practice.getMember());
                }
                if (practice.getTeachername()!=null)
                {
                    row.createCell(11).setCellValue(practice.getTeachername());
                }
                if (practice.getCredit()!=null)
                {
                    row.createCell(12).setCellValue(practice.getCredit());
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
}
