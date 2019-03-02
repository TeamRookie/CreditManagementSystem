package Impl;

import mapper.TrainItemMapper;
import mapper.TraintypeMapper;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import pojo.*;
import service.TrainService;

import javax.servlet.ServletOutputStream;
import java.util.HashMap;
import java.util.List;

@Service
public class TrainServiceImpl implements TrainService
{
    @Autowired
    private TrainItemMapper trainItemMapper;
    @Autowired
    private TraintypeMapper traintypeMapper;
    public PageBean getPageBean(Integer currentPage, Integer pageSize)
    {
        Integer totalCount=0;
        totalCount=trainItemMapper.getTotalCount();
        PageBean pageBean=new PageBean(pageSize,currentPage,totalCount);
        Integer start=(pageBean.getCurrentPage()-1)*pageBean.getPageSize();
        pageBean.setStart(start);
        List<Trainrules> trainRulesList = trainItemMapper.getPageBean(pageBean);
        pageBean.setPageList(trainRulesList);
        return  pageBean;
    }

    @Override
    public void trainExport(String[] titles, ServletOutputStream out, String faculty, String major, String grade, String date, String trainContent, String trainTime)
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
            List<Train> trainList = trainItemMapper.getTrainDownload(faculty,major,grade,date,trainContent,trainTime);
            for (int i = 0; i < trainList.size(); i++) {
                row = sheet.createRow(i+1);
                Train train=trainList.get(i);

                // 第六步，创建单元格，并设置值

                if(train.getStunum() != null){
                    row.createCell(0).setCellValue(train.getStunum());
                }
                if(train.getStuname() != null){
                    row.createCell(1).setCellValue(train.getStuname());
                }
                if(train.getFacultyname()!= null){
                    row.createCell(2).setCellValue(train.getFacultyname());
                }
                if (train.getMajorname()!=null)
                {
                    row.createCell(3).setCellValue(train.getFacultyname());
                }
                if(train.getGradename() !=null){
                    row.createCell(4).setCellValue(train.getGradename());
                }
                if(train.getTrainname() !=null){
                    row.createCell(5).setCellValue(train.getTrainname());
                }
                if(train.getTraintime() !=null){
                    row.createCell(6).setCellValue(train.getTraintime());
                }
                if(train.getOrganizationunit() !=null){
                    row.createCell(7).setCellValue(train.getOrganizationunit());
                }
                if(train.getTeachername() !=null){
                    row.createCell(8).setCellValue(train.getTeachername());
                }
                if (train.getCredit()!=null)
                {
                    row.createCell(9).setCellValue(train.getCredit());
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
    public PageBean getTrainImportPageBean(String trainContent, String trainTime, Integer currentPage, Integer pageSize)
    {
        Integer totalCount=0;
        totalCount=trainItemMapper.getTrainImportTotalCount(trainContent,trainTime);
        PageBean pageBean=new PageBean(pageSize,currentPage,totalCount);
        Integer start=(pageBean.getCurrentPage()-1)*pageBean.getPageSize();
        pageBean.setStart(start);
        HashMap map=new HashMap();
        map.put("pageBean",pageBean);
        map.put("trainContent",trainContent);
        map.put("trainTime",trainTime);
        List<Traintype> trainTypeList = trainItemMapper.getTrainImportPageBean(map);
        pageBean.setPageList(trainTypeList);
        return pageBean;
    }

    @Override
    public PageBean getTrainPageBean(String studentNumber, String faculty, String major, String grade, String trainTime, String trainContent, String trainDepartment, Integer currentPage, Integer pageSize)
    {
        Integer totalCount=trainItemMapper.getTrainTotalCount(studentNumber,faculty,major,grade,trainTime,trainContent,trainDepartment);
        PageBean pageBean=new PageBean(pageSize,currentPage,totalCount);
        Integer start=(pageBean.getCurrentPage()-1)*pageBean.getPageSize();
        pageBean.setStart(start);
        HashMap map=new HashMap();
        map.put("trainTime",trainTime);
        map.put("trainContent",trainContent);
        map.put("trainDepartment",trainDepartment);
        map.put("pageBean",pageBean);
        map.put("faculty",faculty);
        map.put("major",major);
        map.put("grade",grade);
        List<Train> trainList=trainItemMapper.getTrainPageBean(map);
        pageBean.setPageList(trainList);
        return  pageBean;
    }

    @Override
    public List<String> getTrainContent()
    {
        List<String> timeList=trainItemMapper.getTrainContent();
        return timeList;
    }

    @Override
    public void addTrainImport(String trainTime,String trainContent)
    {
        Traintype traintype=new Traintype();
        traintype.setTraincontent(trainContent);
        traintype.setTraintime(trainTime);
        traintypeMapper.insertSelective(traintype);
    }

    @Override
    public void deleteTrainType(Integer id)
    {
        traintypeMapper.deleteByPrimaryKey(id);
    }
}
