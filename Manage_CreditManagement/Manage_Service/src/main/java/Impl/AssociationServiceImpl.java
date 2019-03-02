package Impl;

import mapper.AssociationItemMapper;
import mapper.AssociationrulesMapper;
import mapper.AssociationtypeMapper;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pojo.*;
import service.AssociationService;

import javax.servlet.ServletOutputStream;
import java.util.HashMap;
import java.util.List;
@Service
@Transactional
public class AssociationServiceImpl implements AssociationService
{
    @Autowired
    private AssociationrulesMapper associationRulesMapper;
    @Autowired
    private AssociationItemMapper associationItemMapper;
    @Autowired
    private AssociationtypeMapper associationtypeMapper;
    @Override
    public PageBean getPageBean(Integer pageSize, Integer currentPage)
    {
        int totalCount = associationItemMapper.getTotalCount();
        PageBean pageBean=new PageBean(pageSize,currentPage,totalCount);
        Integer start=(pageBean.getCurrentPage()-1)*pageBean.getPageSize();
        pageBean.setStart(start);
        List<Associationrules> associationRulesList = associationItemMapper.getPageBean(pageBean);
        pageBean.setPageList(associationRulesList);
        return  pageBean;
    }

    @Override
    public List<Associationrules> getAssociationRules()
    {
        AssociationrulesExample associationRulesExample=new AssociationrulesExample();
        List<Associationrules> associationRulesList = associationRulesMapper.selectByExample(associationRulesExample);
        return associationRulesList;
    }

    @Override
    public PageBean getAssociationImportPageBean(String associationName, String associationTime, Integer currentPage, Integer pageSize)
    {
        Integer totalCount=0;
        totalCount=associationItemMapper.getAssociationImportTotalCount(associationName,associationTime);
        PageBean pageBean=new PageBean(pageSize,currentPage,totalCount);
        Integer start=(pageBean.getCurrentPage()-1)*pageBean.getPageSize();
        pageBean.setStart(start);
        HashMap map=new HashMap();
        map.put("pageBean",pageBean);
        map.put("associationName",associationName);
        map.put("associationTime",associationTime);
        List<Associationtype> associationTypeList = associationItemMapper.getAssociationImportPageBean(map);
        pageBean.setPageList(associationTypeList);
        return pageBean;
    }

    @Override
    public void addAssociationType(Associationtype associationtype)
    {
        associationtypeMapper.insertSelective(associationtype);
    }

    @Override
    public void deleteAssociationTypeById(Integer id)
    {
        associationtypeMapper.deleteByPrimaryKey(id);
    }

    @Override
    public PageBean getAssociationPageBean(String studentNumber, String faculty, String major, String grade, String associationTime, String associationName, String associationLevel, Integer currentPage, Integer pageSize)
    {
        Integer totalCount=associationItemMapper.getAssociationTotalCount(studentNumber,faculty,major,grade,associationTime,associationName,associationLevel);
        PageBean pageBean=new PageBean(pageSize,currentPage,totalCount);
        Integer start=(pageBean.getCurrentPage()-1)*pageBean.getPageSize();
        pageBean.setStart(start);
        HashMap map=new HashMap();
        map.put("pageBean",pageBean);
        map.put("associationName",associationName);
        map.put("associationTime",associationTime);
        map.put("studentNumber",studentNumber);
        map.put("associationLevel",associationLevel);
        map.put("faculty",faculty);
        map.put("major",major);
        map.put("grade",grade);
        List<Association> associationList=associationItemMapper.getAssociationPageBean(map);
        pageBean.setPageList(associationList);
        return pageBean;
    }

    @Override
    public void associationExport(String[] titles, ServletOutputStream out, String faculty, String major, String grade, String date, String associationName, String associationTime, String associationLevel)
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
            List<Association> associationList = associationItemMapper.getAssociationDownload(faculty,major,grade,date,associationName,associationTime,associationLevel);
            for (int i = 0; i < associationList.size(); i++) {
                row = sheet.createRow(i+1);
                Association association=associationList.get(i);

                // 第六步，创建单元格，并设置值

                if(association.getStunum() != null){
                    row.createCell(0).setCellValue(association.getStunum());
                }
                if(association.getStuname() != null){
                    row.createCell(1).setCellValue(association.getStuname());
                }
                if(association.getFacultyname()!= null){
                    row.createCell(2).setCellValue(association.getFacultyname());
                }
                if (association.getMajorname()!=null)
                {
                    row.createCell(3).setCellValue(association.getFacultyname());
                }
                if(association.getGradename() !=null){
                    row.createCell(4).setCellValue(association.getGradename());
                }
                if(association.getAssociationtime() !=null){
                    row.createCell(5).setCellValue(association.getAssociationtime());
                }
                if(association.getAssociationname() !=null){
                    row.createCell(6).setCellValue(association.getAssociationname());
                }
                if(association.getAssociationlevel() !=null){
                    row.createCell(7).setCellValue(association.getAssociationlevel());
                }
                if(association.getResponsibility() !=null){
                    row.createCell(8).setCellValue(association.getResponsibility());
                }
                if (association.getTeachername()!=null)
                {
                    row.createCell(9).setCellValue(association.getTeachername());
                }
                if (association.getCredit()!=null)
                {
                    row.createCell(10).setCellValue(association.getCredit());
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
