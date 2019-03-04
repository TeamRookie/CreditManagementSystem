package Impl;

import mapper.ScienceItemMapper;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pojo.PageBean;
import pojo.Science;
import pojo.Sciencerules;
import pojo.Studio;
import service.ScienceService;

import javax.servlet.ServletOutputStream;
import java.util.HashMap;
import java.util.List;

@Service
public class ScienceServiceImpl implements ScienceService
{
    @Autowired
    private ScienceItemMapper scienceItemMapper;
    @Override
    public PageBean getSciencePageBean(String studentNumber, String faculty, String major, String grade, String scienceType, String scienceTime, String scienceLevel, Integer pageSize, Integer currentPage)
    {
        Integer totalCount=scienceItemMapper.getScienceTotalCount(studentNumber,faculty,major,grade,scienceType,scienceTime,scienceLevel);
        PageBean pageBean=new PageBean(pageSize,currentPage,totalCount);
        Integer start=(pageBean.getCurrentPage()-1)*pageBean.getPageSize();
        pageBean.setStart(start);
        HashMap map=new HashMap();
        map.put("pageBean",pageBean);
        map.put("scienceType",scienceType);
        map.put("scienceTime",scienceTime);
        map.put("scienceLevel",scienceLevel);
        map.put("studentNumber",studentNumber);
        map.put("faculty",faculty);
        map.put("major",major);
        map.put("grade",grade);
        List<Science> scienceList=scienceItemMapper.getSciencePageBean(map);
        pageBean.setPageList(scienceList);
        return pageBean;
    }

    @Override
    public PageBean getScienceRulesPageBean(Integer currentPage, Integer pageSize)
    {
        Integer totalCount=scienceItemMapper.getScienceRulesTotalCount();
        PageBean pageBean=new PageBean(pageSize,currentPage,totalCount);
        Integer start=(pageBean.getCurrentPage()-1)*pageBean.getPageSize();
        pageBean.setStart(start);
        HashMap map=new HashMap();
        map.put("pageBean",pageBean);
        List<Sciencerules> scienceList=scienceItemMapper.getScienceRulesPageBean(map);
        pageBean.setPageList(scienceList);
        return pageBean;
    }

    @Override
    public void scienceExport(String[] titles, ServletOutputStream out, String faculty, String major, String grade, String startTime, String scienceLevel, String scienceType)
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
            List<Science> scienceList = scienceItemMapper.getScienceDownload(faculty,major,grade,startTime,scienceLevel,scienceType);
            for (int i = 0; i < scienceList.size(); i++) {
                row = sheet.createRow(i+1);
                Science science=scienceList.get(i);

                // 第六步，创建单元格，并设置值

                if(science.getStunum() != null){
                    row.createCell(0).setCellValue(science.getStunum());
                }
                if(science.getStuname() != null){
                    row.createCell(1).setCellValue(science.getStuname());
                }
                if(science.getFacultyname()!= null){
                    row.createCell(2).setCellValue(science.getFacultyname());
                }
                if (science.getMajorname()!=null)
                {
                    row.createCell(3).setCellValue(science.getFacultyname());
                }
                if(science.getGradename() !=null){
                    row.createCell(4).setCellValue(science.getGradename());
                }
                if (science.getSciencename()!=null)
                {
                    row.createCell(5).setCellValue(science.getSciencename());
                }
                if(science.getSciencetype() !=null){
                    row.createCell(6).setCellValue(science.getSciencetype());
                }
                if(science.getSciencelevel() !=null){
                    row.createCell(7).setCellValue(science.getSciencelevel());
                }
                if(science.getSciencestarttime() !=null){
                    row.createCell(8).setCellValue(science.getSciencestarttime());
                }
                if(science.getScienceendtime() !=null){
                    row.createCell(9).setCellValue(science.getScienceendtime());
                }
                if (science.getTeachername()!=null)
                {
                    row.createCell(10).setCellValue(science.getTeachername());
                }
                if (science.getResponsibility()!=null)
                {
                    row.createCell(11).setCellValue(science.getResponsibility());
                }
                if (science.getCredit()!=null)
                {
                    row.createCell(12).setCellValue(science.getCredit());
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
