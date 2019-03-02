package Impl;

import mapper.EnterpriseItemMapper;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pojo.*;
import service.EnterpriseService;

import javax.servlet.ServletOutputStream;
import java.util.HashMap;
import java.util.List;

@Service
public class EnterpriseServiceImpl implements EnterpriseService
{
    @Autowired
    private EnterpriseItemMapper enterpriseItemMapper;
    @Override
    public PageBean getPageBean(Integer currentPage, Integer pageSize)
    {
        Integer totalCount=0;
        totalCount=enterpriseItemMapper.getTotalCount();
        PageBean pageBean=new PageBean(pageSize,currentPage,totalCount);
        Integer start=(pageBean.getCurrentPage()-1)*pageBean.getPageSize();
        pageBean.setStart(start);
        List<Enterpriserules> enterpriseRulesList = enterpriseItemMapper.getPageBean(pageBean);
        pageBean.setPageList(enterpriseRulesList);
        return  pageBean;
    }

    @Override
    public PageBean getEnterprisePageBean(String studentNumber, String faculty, String major, String grade, String enterpriseType, String enterpriseTime, Integer currentPage, Integer pageSize)
    {
        Integer totalCount=enterpriseItemMapper.getEnterpriseTotalCount(studentNumber,faculty,major,grade,enterpriseType,enterpriseTime);
        PageBean pageBean=new PageBean(pageSize,currentPage,totalCount);
        Integer start=(pageBean.getCurrentPage()-1)*pageBean.getPageSize();
        pageBean.setStart(start);
        HashMap map=new HashMap();
        map.put("pageBean",pageBean);
        map.put("studentNumber",studentNumber);
        map.put("enterpriseType",enterpriseType);
        map.put("enterpriseTime",enterpriseTime);
        map.put("faculty",faculty);
        map.put("major",major);
        map.put("grade",grade);
        List<Enterprise> enterpriseList=enterpriseItemMapper.getEnterprisePageBean(map);
        pageBean.setPageList(enterpriseList);
        return pageBean;
    }

    @Override
    public void enterpriseExport(String[] titles, ServletOutputStream out, String faculty, String major, String grade, String date)
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
            List<Enterprise> enterpriseList = enterpriseItemMapper.getEnterpriseDownload(faculty,major,grade,date);
            for (int i = 0; i < enterpriseList.size(); i++) {
                row = sheet.createRow(i+1);
                Enterprise enterprise=enterpriseList.get(i);

                // 第六步，创建单元格，并设置值

                if(enterprise.getStunum() != null){
                    row.createCell(0).setCellValue(enterprise.getStunum());
                }
                if(enterprise.getStuname() != null){
                    row.createCell(1).setCellValue(enterprise.getStuname());
                }
                if(enterprise.getFacultyname()!= null){
                    row.createCell(2).setCellValue(enterprise.getFacultyname());
                }
                if (enterprise.getMajorname()!=null)
                {
                    row.createCell(3).setCellValue(enterprise.getFacultyname());
                }
                if(enterprise.getGradename() !=null){
                    row.createCell(4).setCellValue(enterprise.getGradename());
                }
                if(enterprise.getEnterpriseid() !=null){
                    row.createCell(5).setCellValue(enterprise.getEnterpriseid());
                }
                if(enterprise.getEnterprisename() !=null){
                    row.createCell(6).setCellValue(enterprise.getEnterprisename());
                }
                if(enterprise.getEnterprisetype() !=null){
                    row.createCell(7).setCellValue(enterprise.getEnterprisetype());
                }
                if(enterprise.getRank() !=null){
                    row.createCell(8).setCellValue(enterprise.getRank());
                }
                if (enterprise.getResidence()!=null)
                {
                    row.createCell(9).setCellValue(enterprise.getResidence());
                }
                if (enterprise.getRepresentative()!=null)
                {
                    row.createCell(10).setCellValue(enterprise.getRepresentative());
                }
                if (enterprise.getEnterprisetime()!=null)
                {
                    row.createCell(11).setCellValue(enterprise.getEnterprisetime());
                }
                if (enterprise.getBusinessscope()!=null)
                {
                    row.createCell(12).setCellValue(enterprise.getBusinessscope());
                }
                if (enterprise.getShareholder()!=null)
                {
                    row.createCell(13).setCellValue(enterprise.getShareholder());
                }
                if (enterprise.getCredit()!=null)
                {
                    row.createCell(14).setCellValue(enterprise.getCredit());
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
