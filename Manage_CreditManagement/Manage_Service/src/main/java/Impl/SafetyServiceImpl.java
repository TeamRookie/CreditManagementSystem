package Impl;

import mapper.SafetyItemMapper;
import mapper.SafetyrulesMapper;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pojo.*;
import service.SafetyService;

import javax.servlet.ServletOutputStream;
import java.util.HashMap;
import java.util.List;
@Service
@Transactional
public class SafetyServiceImpl implements SafetyService
{
    @Autowired
    private SafetyrulesMapper safetyRulesMapper;
    @Autowired
    private SafetyItemMapper safetyItemMapper;
    @Override
    public List<Safetyrules> getSafetyRules()
    {
        SafetyrulesExample safetyruleExample=new SafetyrulesExample();
        List<Safetyrules> safetyRulesList = safetyRulesMapper.selectByExample(safetyruleExample);
        return safetyRulesList;
    }
    public PageBean getPageBean(Integer pageSize, Integer currentPage)
    {
        Integer totalCount=0;
        totalCount=safetyItemMapper.getTotalCount();
        PageBean pageBean=new PageBean(pageSize,currentPage,totalCount);
        Integer start=(pageBean.getCurrentPage()-1)*pageBean.getPageSize();
        pageBean.setStart(start);
        List<Safetyrules> safetyRulesList = safetyItemMapper.getPageBean(pageBean);
        pageBean.setPageList(safetyRulesList);
        return  pageBean;
    }

    @Override
    public PageBean getSafetyPageBean(String studentNumber, String faculty, String major, String grade, String safetyTime, Integer currentPage, Integer pageSize)
    {
        Integer totalCount= safetyItemMapper.getSafetyTotalCount(studentNumber,faculty,major,grade,safetyTime);
        PageBean pageBean=new PageBean(pageSize,currentPage,totalCount);
        Integer start=(pageBean.getCurrentPage()-1)*pageBean.getPageSize();
        pageBean.setStart(start);
        HashMap map=new HashMap();
        map.put("pageBean",pageBean);
        map.put("safetyTime",safetyTime);
        map.put("studentNumber",studentNumber);
        map.put("faculty",faculty);
        map.put("major",major);
        map.put("grade",grade);
        List<Safety> safetyList= safetyItemMapper.getSafetyPageBean(map);
        pageBean.setPageList(safetyList);
        return  pageBean;
    }

    @Override
    public void safetyExport(String[] titles, ServletOutputStream out, String faculty, String major, String grade, String date)
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
            List<Safety> safetyList = safetyItemMapper.getSafetyDownload(faculty,major,grade,date);
            for (int i = 0; i < safetyList.size(); i++) {
                row = sheet.createRow(i+1);
                Safety safety=safetyList.get(i);

                // 第六步，创建单元格，并设置值

                if(safety.getStunum() != null){
                    row.createCell(0).setCellValue(safety.getStunum());
                }
                if(safety.getStuname() != null){
                    row.createCell(1).setCellValue(safety.getStuname());
                }
                if(safety.getFacultyname()!= null){
                    row.createCell(2).setCellValue(safety.getFacultyname());
                }
                if (safety.getMajorname()!=null)
                {
                    row.createCell(3).setCellValue(safety.getFacultyname());
                }
                if(safety.getGradename() !=null){
                    row.createCell(4).setCellValue(safety.getGradename());
                }
                if(safety.getSafetytime() !=null){
                    row.createCell(5).setCellValue(safety.getSafetytime());
                }
                if(safety.getTeachername() !=null){
                    row.createCell(6).setCellValue(safety.getTeachername());
                }
                if(safety.getSafetylevel() !=null){
                    row.createCell(7).setCellValue(safety.getSafetylevel());
                }
                if(safety.getCredit() !=null){
                    row.createCell(8).setCellValue(safety.getCredit());
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
