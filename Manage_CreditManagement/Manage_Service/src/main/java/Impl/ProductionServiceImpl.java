package Impl;

import mapper.ProductionItemMapper;
import mapper.ProductionrulesMapper;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.omg.CORBA.MARSHAL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pojo.*;
import service.ProductionService;

import javax.servlet.ServletOutputStream;
import java.util.HashMap;
import java.util.List;
@Service
@Transactional
public class ProductionServiceImpl implements ProductionService
{
    @Autowired
    private ProductionrulesMapper productionRulesMapper;
    @Autowired
    private ProductionItemMapper productionItemMapper;
    @Override
    public List<Productionrules> getProductionRules()
    {
        ProductionrulesExample productionrulesExample=new ProductionrulesExample();
        List<Productionrules> productionRulesList = productionRulesMapper.selectByExample(productionrulesExample);
        return  productionRulesList;
    }
    public PageBean getPageBean(Integer pageSize, Integer currentPage)
    {
        Integer totalCount=0;
        totalCount=productionItemMapper.getTotalCount();
        PageBean pageBean=new PageBean(pageSize,currentPage,totalCount);
        Integer start=(pageBean.getCurrentPage()-1)*pageBean.getPageSize();
        pageBean.setStart(start);
        List<Productionrules> productionRulesList = productionItemMapper.getPageBean(pageBean);

        pageBean.setPageList(productionRulesList);
        return  pageBean;
    }

    @Override
    public PageBean getProductionPageBean(String studentNumber, String faculty, String major, String grade, String productionType, String productionTime, Integer currentPage, Integer pageSize)
    {
        Integer totalCount=productionItemMapper.getProductionTotalCount(studentNumber,faculty,major,grade,productionType,productionTime);
        PageBean pageBean=new PageBean(pageSize,currentPage,totalCount);
        Integer start=(pageBean.getCurrentPage()-1)*pageBean.getPageSize();
        pageBean.setStart(start);
        HashMap map=new HashMap();
        map.put("studentNumber",studentNumber);
        map.put("productionType",productionType);
        map.put("productionTime",productionTime);
        map.put("pageBean",pageBean);
        map.put("faculty",faculty);
        map.put("major",major);
        map.put("grade",grade);
        List<Production> productionList=productionItemMapper.getProductionPageBean(map);
        pageBean.setPageList(productionList);
        return pageBean;
    }

    @Override
    public void productionExport(String[] titles, ServletOutputStream out, String faculty, String major, String grade, String date, String productionTime, String productionType)
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
            List<Production> productionList = productionItemMapper.getProductionDownload(faculty,major,grade,date,productionTime,productionType);
            for (int i = 0; i < productionList.size(); i++) {
                row = sheet.createRow(i+1);
                Production production=productionList.get(i);

                // 第六步，创建单元格，并设置值

                if(production.getStunum() != null){
                    row.createCell(0).setCellValue(production.getStunum());
                }
                if(production.getStuname() != null){
                    row.createCell(1).setCellValue(production.getStuname());
                }
                if(production.getFacultyname()!= null){
                    row.createCell(2).setCellValue(production.getFacultyname());
                }
                if (production.getMajorname()!=null)
                {
                    row.createCell(3).setCellValue(production.getFacultyname());
                }
                if(production.getGradename() !=null){
                    row.createCell(4).setCellValue(production.getGradename());
                }
                if(production.getProductiontime() !=null){
                    row.createCell(5).setCellValue(production.getProductiontime());
                }
                if(production.getProductionname() !=null){
                    row.createCell(6).setCellValue(production.getProductionname());
                }
                if(production.getProductiontype() !=null){
                    row.createCell(7).setCellValue(production.getProductiontype());
                }
                if(production.getAutograph() !=null){
                    row.createCell(8).setCellValue(production.getAutograph());
                }
                if (production.getResponsibility()!=null)
                {
                    row.createCell(9).setCellValue(production.getResponsibility());
                }
                if (production.getAuthor()!=null)
                {
                    row.createCell(10).setCellValue(production.getAuthor());
                }
                if (production.getSource()!=null)
                {
                    row.createCell(11).setCellValue(production.getSource());
                }
                if (production.getCredit()!=null)
                {
                    row.createCell(12).setCellValue(production.getCredit());
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
