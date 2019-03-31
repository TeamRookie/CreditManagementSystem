package Impl;

import mapper.StudioItemMapper;
import mapper.StudiorulesMapper;
import mapper.StudiotypeMapper;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pojo.*;
import service.StudioService;

import javax.servlet.ServletOutputStream;
import java.util.HashMap;
import java.util.List;
@Service
@Transactional
public class StudioServiceImpl implements StudioService
{
    @Autowired
    private StudiorulesMapper studioRulesMapper;
    @Autowired
    private StudioItemMapper studioItemMapper;
    @Autowired
    private StudiotypeMapper studiotypeMapper;
    @Override
    public List<Studiorules> getStudioRules()
    {
        StudiorulesExample studiorulesExample=new StudiorulesExample();
        List<Studiorules> studioRulesList = studioRulesMapper.selectByExample(studiorulesExample);
        return  studioRulesList;
    }
    public PageBean getPageBean(Integer pageSize, Integer currentPage)
    {
        Integer totalCount=0;
        totalCount=studioItemMapper.getTotalCount();
        PageBean pageBean=new PageBean(pageSize,currentPage,totalCount);
        Integer start=(pageBean.getCurrentPage()-1)*pageBean.getPageSize();
        pageBean.setStart(start);
        List<Studiorules> studioRulesList = studioItemMapper.getPageBean(pageBean);
        pageBean.setPageList(studioRulesList);
        return  pageBean;
    }

    @Override
    public PageBean getStudioImportPageBean(String studioName, String studioLevel, String studioDepartment, String date,Integer currentPage, Integer pageSize)
    {
        Integer totalCount=0;
        totalCount=studioItemMapper.getStudioImportTotalCount(studioName,studioLevel,studioDepartment);
        PageBean pageBean=new PageBean(pageSize,currentPage,totalCount);
        Integer start=(pageBean.getCurrentPage()-1)*pageBean.getPageSize();
        pageBean.setStart(start);
        HashMap map=new HashMap();

        map.put("pageBean",pageBean);
        map.put("studioName",studioName);
        map.put("studioLevel",studioLevel);
        map.put("studioDepartment",studioDepartment);

        map.put( "studioTime",date );
        List<Studiotype> studioTypeList = studioItemMapper.getStudioImportPageBean(map);
        pageBean.setPageList(studioTypeList);
        return pageBean;
    }

    @Override
    public void deleteStudioTypeById(Integer id)
    {
        studiotypeMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void addStudioType(Studiotype studiotype)
    {
        studiotypeMapper.insertSelective(studiotype);
    }

    @Override
    public PageBean getStudioPageBean(String studentNumber,  String faculty, String major, String grade,String studioTime, String studioDepartment, String studioName, String studioLevel, Integer currentPage, Integer pageSize)
    {
        Integer totalCount=studioItemMapper.getStudioTotalCount(studentNumber,faculty,major,grade,studioTime,studioDepartment,studioName,studioLevel);
        PageBean pageBean=new PageBean(pageSize,currentPage,totalCount);
        Integer start=(pageBean.getCurrentPage()-1)*pageBean.getPageSize();
        pageBean.setStart(start);
        HashMap map=new HashMap();
        /*        System.out.println(contestDate);*/
        map.put("pageBean",pageBean);
        map.put("studioName",studioName);
        map.put("studioLevel",studioLevel);
        map.put("studioDepartment",studioDepartment);
        map.put("studioTime",studioTime);
        map.put("studentNumber",studentNumber);
        map.put("faculty",faculty);
        map.put("major",major);
        map.put("grade",grade);
        List<Studio> studiosList=studioItemMapper.getStudioPageBean(map);
        pageBean.setPageList(studiosList);
        return pageBean;
    }

    @Override
    public List<String> getAllStudioName()
    {
       List<String> nameList= studioItemMapper.getAllStudioName();
       return  nameList;
    }

    @Override
    public void studioExport(String[] titles, ServletOutputStream out, String faculty, String major, String grade, String date, String studioName, String studioLevel, String studioTime)
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
        List<Studio> studioList = studioItemMapper.getStudioDownload(faculty,major,grade,date,studioName,studioTime,studioLevel);
        for (int i = 0; i < studioList.size(); i++) {
            row = sheet.createRow(i+1);
            Studio studio=studioList.get(i);

            // 第六步，创建单元格，并设置值

            if(studio.getStunum() != null){
                row.createCell(0).setCellValue(studio.getStunum());
            }
            if(studio.getStuname() != null){
                row.createCell(1).setCellValue(studio.getStuname());
            }
            if(studio.getFacultyname()!= null){
                row.createCell(2).setCellValue(studio.getFacultyname());
            }
            if (studio.getMajorname()!=null)
            {
                row.createCell(3).setCellValue(studio.getMajorname());
            }
            if(studio.getGradename() !=null){
                row.createCell(4).setCellValue(studio.getGradename());
            }
            if (studio.getStudiotime()!=null)
            {
                row.createCell(5).setCellValue(studio.getStudiotime());
            }

            if(studio.getStudioname() !=null){
                row.createCell(6).setCellValue(studio.getStudioname());
            }
            if(studio.getStudiolevel() !=null){
                row.createCell(7).setCellValue(studio.getStudiolevel());
            }
            if(studio.getTeachername() !=null){
                row.createCell(8).setCellValue(studio.getTeachername());
            }
            if (studio.getResponsibility()!=null)
            {
                row.createCell(9).setCellValue(studio.getResponsibility());
            }
            if (studio.getCredit()!=null)
            {
                row.createCell(10).setCellValue(studio.getCredit());
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
