package Impl;

import mapper.CredentialItemMapper;
import mapper.CredentialrulesMapper;
import mapper.CredentialtypeMapper;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pojo.*;
import service.CredentialService;

import javax.servlet.ServletOutputStream;
import java.util.HashMap;
import java.util.List;

@Service
@Transactional
public class CredentialServiceImpl implements CredentialService
{
    @Autowired
    private CredentialrulesMapper credentialRulesMapper;
    @Autowired
    private CredentialItemMapper credentialItemMapper;
    @Autowired
    private CredentialtypeMapper credentialtypeMapper;
    @Override
    public List<Credentialrules> getCredentialRules()
    {
        CredentialrulesExample credentialrulesExample=new CredentialrulesExample();
        List<Credentialrules> credentialRulesList = credentialRulesMapper.selectByExample(credentialrulesExample);
        return  credentialRulesList;
    }
    public PageBean getPageBean(Integer pageSize, Integer currentPage)
    {
        Integer totalCount=0;
        totalCount=credentialItemMapper.getTotalCount();
        PageBean pageBean=new PageBean(pageSize,currentPage,totalCount);
        Integer start=(pageBean.getCurrentPage()-1)*pageBean.getPageSize();
        pageBean.setStart(start);
        List<Credentialrules> credentialRulesList = credentialItemMapper.getPageBean(pageBean);

        pageBean.setPageList(credentialRulesList);
        return  pageBean;
    }

    @Override
    public PageBean getCredentialImportPageBean(String information, Integer currentPage, Integer pageSize)
    {
        Integer totalCount=0;
        totalCount=credentialItemMapper.getCredentialImportTotalCount(information);
        PageBean pageBean=new PageBean(pageSize,currentPage,totalCount);
        Integer start=(pageBean.getCurrentPage()-1)*pageBean.getPageSize();
        pageBean.setStart(start);
        HashMap map=new HashMap();
        map.put("pageBean",pageBean);
        map.put("information",information);
        List<Credentialtype> credentialTypeList = credentialItemMapper.getCredentialImportPageBean(map);
        pageBean.setPageList(credentialTypeList);
        return pageBean;
    }

    @Override
    public void addCredentialType(String addInformation)
    {
        Credentialtype credentialtype=new Credentialtype();
        credentialtype.setType(1);
        credentialtype.setInformation(addInformation);
        credentialtypeMapper.insertSelective(credentialtype);
    }

    @Override
    public void deleteCredentialTypeById(Integer id)
    {
        credentialtypeMapper.deleteByPrimaryKey(id);
    }

    @Override
    public PageBean getCredentialPageBean(String studentNumber, String faculty, String major, String grade,String credentialTime, String credentialType, Integer currentPage, Integer pageSize)
    {
        Integer totalCount=credentialItemMapper.getCredentialTotalCount(studentNumber,faculty,major,grade,credentialTime,credentialType);
        PageBean pageBean=new PageBean(pageSize,currentPage,totalCount);
        Integer start=(pageBean.getCurrentPage()-1)*pageBean.getPageSize();
        pageBean.setStart(start);
        HashMap map=new HashMap();
        map.put("pageBean",pageBean);
        map.put("credentialTime",credentialTime);
        map.put("studentNumber",studentNumber);
        map.put("credentialType",credentialType);
        map.put("faculty",faculty);
        map.put("major",major);
        map.put("grade",grade);
        List<Credential> credentialList=credentialItemMapper.getCredentialPageBean(map);
        pageBean.setPageList(credentialList);
        return pageBean;
    }

    @Override
    public List<Credentialtype> getAllCredentialType()
    {
        List<Credentialtype> credentialtypeList= credentialItemMapper.getAllCredentialType();
        return credentialtypeList;
    }

    @Override
    public void credentialExport(String[] titles, ServletOutputStream out, String faculty, String major, String grade, String date, String type)
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
            List<Credential> credentialList = credentialItemMapper.getCredentialDownload(faculty,major,grade,date,type);
            for (int i = 0; i < credentialList.size(); i++) {
                row = sheet.createRow(i+1);
                Credential credential=credentialList.get(i);

                // 第六步，创建单元格，并设置值

                if(credential.getStunum() != null){
                    row.createCell(0).setCellValue(credential.getStunum());
                }
                if(credential.getStuname() != null){
                    row.createCell(1).setCellValue(credential.getStuname());
                }
                if(credential.getFacultyname()!= null){
                    row.createCell(2).setCellValue(credential.getFacultyname());
                }
                if (credential.getMajorname()!=null)
                {
                    row.createCell(3).setCellValue(credential.getFacultyname());
                }
                if(credential.getGradename() !=null){
                    row.createCell(4).setCellValue(credential.getGradename());
                }
                if(credential.getCredentialtime() !=null){
                    row.createCell(5).setCellValue(credential.getCredentialtime());
                }
                if(credential.getType() !=null){
                    row.createCell(6).setCellValue(credential.getType());
                }
                if(credential.getCredentiallevel() !=null){
                    row.createCell(7).setCellValue(credential.getCredentiallevel());
                }
                if(credential.getCredit() !=null){
                    row.createCell(8).setCellValue(credential.getCredit());
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
