package Impl;

import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.stereotype.Service;
import service.DownloadService;
import javax.servlet.ServletOutputStream;


@Service
public class DownloadServiceImpl implements DownloadService
{

    @Override
    public void export(String[] titles, ServletOutputStream outputStream)
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

        /*    // 第五步，写入实体数据
            Person  person1=new Person("1","张三","123","26");
            Person  person2=new Person("2","李四","123","18");
            Person  person3=new Person("3","王五","123","77");
            Person  person4=new Person("4","徐小筱","123","1");

            //这里我把list当做数据库啦
            ArrayList<Person> list=new ArrayList<Person>();
            list.add(person1);
            list.add(person2);
            list.add(person3);
            list.add(person4);
*/
/*            for (int i = 0; i < list.size(); i++) {
                row = hssfSheet.createRow(i+1);
                Person person = list.get(i);

                // 第六步，创建单元格，并设置值
                String  id = null;
                if(person.getId() != null){
                    id = person.getId();
                }
                row.createCell(0).setCellValue(id);
                String name = "";
                if(person.getName() != null){
                    name = person.getName();
                }
                row.createCell(1).setCellValue(name);
                String password = "";
                if(person.getPassword() != null){
                    password = person.getPassword();
                }
                row.createCell(2).setCellValue(password);
                String age=null;
                if(person.getAge() !=null){
                    age = person.getAge();
                }
                row.createCell(3).setCellValue(age);
            }*/

            // 第七步，将文件输出到客户端浏览器
            try {
                workbook.write(outputStream);
                outputStream.flush();
                outputStream.close();

            } catch (Exception e) {
                e.printStackTrace();
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
