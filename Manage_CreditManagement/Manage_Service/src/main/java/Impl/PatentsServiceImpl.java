package Impl;

import mapper.PatentsItemMapper;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pojo.Academic;
import pojo.PageBean;
import pojo.Patents;
import pojo.Patentsrules;
import service.PatentsService;

import javax.servlet.ServletOutputStream;
import java.util.HashMap;
import java.util.List;

@Service
public class PatentsServiceImpl implements PatentsService
{
    @Autowired
    private PatentsItemMapper patentsItemMapper;
    public PageBean getPageBean(Integer currentPage, Integer pageSize)
    {
        Integer totalCount=0;
        totalCount=patentsItemMapper.getTotalCount();
        PageBean pageBean=new PageBean(pageSize,currentPage,totalCount);
        Integer start=(pageBean.getCurrentPage()-1)*pageBean.getPageSize();
        pageBean.setStart(start);
        List<Patentsrules> patentsRulesList = patentsItemMapper.getPageBean(pageBean);
        pageBean.setPageList(patentsRulesList);
        return  pageBean;
    }

    @Override
    public PageBean getPatentsPageBean(String studentNumber, String faculty, String major, String grade,String patentsType, Integer currentPage, Integer pageSize)
    {
        Integer totalCount=patentsItemMapper.getPatentsTotalCount(studentNumber,faculty,major,grade,patentsType);
        PageBean pageBean=new PageBean(pageSize,currentPage,totalCount);
        Integer start=(pageBean.getCurrentPage()-1)*pageBean.getPageSize();
        pageBean.setStart(start);
        HashMap map=new HashMap();
        map.put("pageBean",pageBean);
        map.put("studentNumber",studentNumber);
        map.put("patentsType",patentsType);
        map.put("faculty",faculty);
        map.put("major",major);
        map.put("grade",grade);
        List<Patents> patentsList = patentsItemMapper.getPatentsPageBean(map);
        pageBean.setPageList(patentsList);
        return  pageBean;
    }

    @Override
    public void patentsExport(String[] titles, ServletOutputStream out, String faculty, String major, String grade, String patentsType, String date)
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
            List<Patents> patentsList= patentsItemMapper.getPatentsDownload(faculty,major,grade,date,patentsType);
            for (int i = 0; i < patentsList.size(); i++) {
                row = sheet.createRow(i+1);
                Patents patents=patentsList.get(i);

                // 第六步，创建单元格，并设置值

                if(patents.getStunum() != null){
                    row.createCell(0).setCellValue(patents.getStunum());
                }
                if(patents.getStuname() != null){
                    row.createCell(1).setCellValue(patents.getStuname());
                }
                if(patents.getFacultyname()!= null){
                    row.createCell(2).setCellValue(patents.getFacultyname());
                }
                if (patents.getMajorname()!=null)
                {
                    row.createCell(3).setCellValue(patents.getFacultyname());
                }
                if(patents.getGradename() !=null){
                    row.createCell(4).setCellValue(patents.getGradename());
                }
                if(patents.getResponsibility() !=null){
                    row.createCell(5).setCellValue(patents.getResponsibility());
                }
                if(patents.getPatentstype() !=null){
                    row.createCell(6).setCellValue(patents.getPatentstype());
                }
                if(patents.getPatentsid() !=null){
                    row.createCell(7).setCellValue(patents.getPatentsid());
                }
                if(patents.getPatentstime() !=null){
                    row.createCell(8).setCellValue(patents.getPatentstime());
                }
                if(patents.getProposer() !=null){
                    row.createCell(9).setCellValue(patents.getProposer());
                }
                if (patents.getInventor()!=null)
                {
                    row.createCell(10).setCellValue(patents.getInventor());
                }
                if (patents.getPatentsname()!=null){
                    row.createCell(11).setCellValue(patents.getPatentsname());
                }
                if (patents.getCredit()!=null)
                {
                    row.createCell(12).setCellValue(patents.getCredit());
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
