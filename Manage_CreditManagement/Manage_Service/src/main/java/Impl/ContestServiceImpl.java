package Impl;

import mapper.ContestItemMapper;
import mapper.ContestMapper;
import mapper.ContestrulesMapper;
import mapper.ContesttypeMapper;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pojo.*;
import service.ContestService;

import javax.servlet.ServletOutputStream;
import java.util.HashMap;
import java.util.List;
@Service
@Transactional
public class ContestServiceImpl implements ContestService
{
    @Autowired
    private ContestrulesMapper contestRulesMapper;
    @Autowired
    private ContestItemMapper contestItemMapper;
    @Autowired
    private ContesttypeMapper contesttypeMapper;
    @Autowired
    private ContestMapper contestMapper;
    @Override
    public List<Contestrules> getContestRules()
    {
        ContestrulesExample contestRulesExample=new ContestrulesExample();
        List<Contestrules> contestRulesList = contestRulesMapper.selectByExample(contestRulesExample);
        return  contestRulesList;
    }

    public PageBean getPageBean(Integer pageSize, Integer currentPage)
    {
        Integer totalCount=0;
        totalCount=contestItemMapper.getTotalCount();
        PageBean pageBean=new PageBean(pageSize,currentPage,totalCount);
        Integer start=(pageBean.getCurrentPage()-1)*pageBean.getPageSize();
        pageBean.setStart(start);
        List<Contestrules> contestRulesList = contestItemMapper.getPageBean(pageBean);
        pageBean.setPageList(contestRulesList);
        return  pageBean;
    }
    @Override
    public PageBean getContestImportPageBean(Integer pageSize, Integer currentPage, String contestDate, String contestName)
    {
        Integer totalCount=0;
        totalCount=contestItemMapper.getContestImportTotalCount(contestName,contestDate);
        PageBean pageBean=new PageBean(pageSize,currentPage,totalCount);
        Integer start=(pageBean.getCurrentPage()-1)*pageBean.getPageSize();
        pageBean.setStart(start);
        HashMap map=new HashMap();

        map.put("pageBean",pageBean);
        map.put("contestDate",contestDate);
        map.put("contestName",contestName);
        List<Contesttype>  contestTypeList = contestItemMapper.getContestImportPageBean(map);
        pageBean.setPageList(contestTypeList);
        return pageBean;
    }
    @Override
    public void deleteContestTypeById(Integer id)
    {
        contesttypeMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void addContestType(String addContestDate, String addContestName)
    {
        Contesttype contesttype=new Contesttype();
        contesttype.setContestname(addContestName);
        contesttype.setContesttime(addContestDate);
        contesttypeMapper.insertSelective(contesttype);
    }

    @Override
    public PageBean getContestPageBean(String studentNumber, String faculty, String major, String grade,String contestTime, String contestLevel, String contestName, String contestRank, Integer currentPage, Integer pageSize)
    {
        Integer totalCount=contestItemMapper.getContestTotalCount(studentNumber,faculty,major,grade,contestTime,contestLevel,contestName,contestRank);
        PageBean pageBean=new PageBean(pageSize,currentPage,totalCount);
        Integer start=(pageBean.getCurrentPage()-1)*pageBean.getPageSize();
        pageBean.setStart(start);
        HashMap map=new HashMap();
        map.put("pageBean",pageBean);
        map.put("contestTime",contestTime);
        map.put("contestLevel",contestLevel);
        map.put("contestName",contestName);
        map.put("contestRank",contestRank);
        map.put("faculty",faculty);
        map.put("major",major);
        map.put("grade",grade);
        map.put("studentNumber",studentNumber);
        List<Contest> contestList= contestItemMapper.getContestPageBean(map);
        pageBean.setPageList(contestList);
        return pageBean;
    }

    @Override
    public void contestExport(String[] titles, ServletOutputStream out, String faculty, String major, String grade, String contestLevel, String contestRank, String contestName, String date)
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
            List<Contest> contestList = contestItemMapper.getContestDownload(faculty,major,grade,contestLevel,contestName,contestRank,date);
            for (int i = 0; i < contestList.size(); i++) {
                row = sheet.createRow(i+1);
                Contest contest=contestList.get(i);

                // 第六步，创建单元格，并设置值

                if(contest.getStunum() != null){
                    row.createCell(0).setCellValue(contest.getStunum());
                }
                if(contest.getStuname() != null){
                    row.createCell(1).setCellValue(contest.getStuname());
                }
                if(contest.getFacultyname()!= null){
                    row.createCell(2).setCellValue(contest.getFacultyname());
                }
                if (contest.getMajorname()!=null)
                {
                    row.createCell(3).setCellValue(contest.getFacultyname());
                }
                if(contest.getGradename() !=null){
                    row.createCell(4).setCellValue(contest.getGradename());
                }
                if(contest.getContesttime() !=null){
                    row.createCell(5).setCellValue(contest.getContesttime());
                }
                if(contest.getContestname() !=null){
                    row.createCell(6).setCellValue(contest.getContestname());
                }
                if(contest.getWorkname() !=null){
                    row.createCell(7).setCellValue(contest.getWorkname());
                }
                if(contest.getContestlevel() !=null){
                    row.createCell(8).setCellValue(contest.getContestlevel());
                }
                if (contestRank!=null)
                {
                    row.createCell(9).setCellValue(contest.getRank());
                }
                if(contest.getCachet() !=null){
                    row.createCell(10).setCellValue(contest.getCachet());
                }
                if (contest.getBooktime()!=null)
                {
                    row.createCell(11).setCellValue(contest.getBooktime());
                }
                if (contest.getGradename()!=null)
                {
                    row.createCell(12).setCellValue(contest.getGradename());
                }
                if (contest.getTeachername()!=null)
                {
                    row.createCell(13).setCellValue(contest.getTeachername());
                }
                if (contest.getCredit()!=null)
                {
                    row.createCell(14).setCellValue(contest.getCredit());
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
