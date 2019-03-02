package Impl;

import mapper.ProjectItemMapper;
import mapper.ProjectrulesMapper;
import mapper.ProjecttypeMapper;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pojo.*;
import service.ProjectService;

import javax.servlet.ServletOutputStream;
import java.util.HashMap;
import java.util.List;
@Service
@Transactional
public class ProjectServiceImpl implements ProjectService
{
    @Autowired
    private ProjectrulesMapper projectRulesMapper;
    @Autowired
    private ProjectItemMapper projectItemMapper;
    @Autowired
    private  ProjecttypeMapper projecttypeMapper;
    @Override
    public List<Projectrules> getProjectRules()
    {
        ProjectrulesExample projectrulesExample=new ProjectrulesExample();
        List<Projectrules> projectRulesList = projectRulesMapper.selectByExample(projectrulesExample);
        return projectRulesList;
    }
    public PageBean getPageBean(Integer pageSize, Integer currentPage)
    {
        Integer totalCount=0;
        totalCount=projectItemMapper.getTotalCount();
        PageBean pageBean=new PageBean(pageSize,currentPage,totalCount);
        Integer start=(pageBean.getCurrentPage()-1)*pageBean.getPageSize();
        pageBean.setStart(start);
        List<Projectrules> projectRulesList = projectItemMapper.getPageBean(pageBean);
        pageBean.setPageList(projectRulesList);
        return  pageBean;
    }

    @Override
    public PageBean getProjectImportPageBean(String projectTime, String projectName, Integer pageSize, Integer currentPage)
    {
        Integer totalCount=0;
        totalCount=projectItemMapper.getProjectImportTotalCount(projectTime,projectName);
        PageBean pageBean=new PageBean(pageSize,currentPage,totalCount);
        Integer start=(pageBean.getCurrentPage()-1)*pageBean.getPageSize();
        pageBean.setStart(start);
        HashMap map=new HashMap();
        map.put("pageBean",pageBean);
        map.put("projectName",projectName);
        map.put("projectTime",projectTime);
        System.out.println(projectName);
        System.out.println(totalCount);
        List<Projecttype> projectTypeList = projectItemMapper.getProjectImportPageBean(map);
        pageBean.setPageList(projectTypeList);
        return  pageBean;
    }

    @Override
    public void deleteProjectTypeById(Integer id)
    {
        projecttypeMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void addProjectType(Projecttype projecttype)
    {
        projecttypeMapper.insertSelective(projecttype);
    }

    @Override
    public PageBean getProjectPageBean(String studentNumber, String faculty, String major, String grade, String projectTime, String projectType, String projectId, String projectLevel, String projectScore, Integer currentPage, Integer pageSize)
    {

        Integer totalCount =projectItemMapper.getProjectTotalCount(studentNumber,faculty,major,grade,projectTime,projectType,projectId,projectLevel,projectScore);
        PageBean pageBean=new PageBean(pageSize,currentPage,totalCount);
        Integer start=(pageBean.getCurrentPage()-1)*pageBean.getPageSize();
        pageBean.setStart(start);
        HashMap map=new HashMap();
        map.put("pageBean",pageBean);
        map.put("studentNumber",studentNumber);
        map.put("projectTime",projectTime);
        map.put("projectType",projectType);
        map.put("projectId",projectId);
        map.put("projectLevel",projectLevel);
        map.put("projectScore",projectScore);
        map.put("faculty",faculty);
        map.put("major",major);
        map.put("grade",grade);
        List<Project> projectList=projectItemMapper.getProjectPageBean(map);
        pageBean.setPageList(projectList);
        return pageBean;
    }

    @Override
    public void projectExport(String[] titles, ServletOutputStream out, String faculty, String major, String grade, String date, String projectLevel, String projectId, String score, String projectType)
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
            List<Project> projectList = projectItemMapper.getProjectDownload(faculty,major,grade,date,projectId,projectLevel,projectType,score);
            for (int i = 0; i < projectList.size(); i++) {
                row = sheet.createRow(i+1);
                Project project=projectList.get(i);

                // 第六步，创建单元格，并设置值

                if(project.getStunum() != null){
                    row.createCell(0).setCellValue(project.getStunum());
                }
                if(project.getStuname() != null){
                    row.createCell(1).setCellValue(project.getStuname());
                }
                if(project.getFacultyname()!= null){
                    row.createCell(2).setCellValue(project.getFacultyname());
                }
                if (project.getMajorname()!=null)
                {
                    row.createCell(3).setCellValue(project.getFacultyname());
                }
                if(project.getGradename() !=null){
                    row.createCell(4).setCellValue(project.getGradename());
                }
                if(project.getProjecttime() !=null){
                    row.createCell(5).setCellValue(project.getProjecttime());
                }
                if(project.getType() !=null){
                    row.createCell(6).setCellValue(project.getType());
                }
                if(project.getProjectid() !=null){
                    row.createCell(7).setCellValue(project.getProjectid());
                }
                if(project.getProjectname() !=null){
                    row.createCell(8).setCellValue(project.getProjectname());
                }
                if (project.getProjectlevel()!=null)
                {
                    row.createCell(9).setCellValue(project.getProjectlevel());
                }
                if (project.getScore()!=null)
                {
                    row.createCell(10).setCellValue(project.getScore());
                }
                if (project.getMember()!=null)
                {
                    row.createCell(11).setCellValue(project.getMember());
                }
                if (project.getTeachername()!=null)
                {
                    row.createCell(12).setCellValue(project.getTeachername());
                }
                if (project.getCredit()!=null)
                {
                    row.createCell(13).setCellValue(project.getCredit());
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
