package util;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.StringWriter;
import java.util.Map;

import org.xhtmlrenderer.pdf.ITextRenderer;

import com.lowagie.text.pdf.BaseFont;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateExceptionHandler;

public class CommonUtil {
	
	public static final String PATH_CLASS_ROOT = CommonUtil.class.getClassLoader().getResource("").getPath();  
	/*项目根路径 最后带/*/
	public static final String ROOT_Path = PATH_CLASS_ROOT.substring(0,PATH_CLASS_ROOT.length() - "WEB-INF\\classes\\".length());
	
	private static Configuration cfg;
	
	private static Template dateTmp;
	
	public static void init(){
		try{
			//初始化参数
			cfg = new Configuration(Configuration.VERSION_2_3_22);
			cfg.setDirectoryForTemplateLoading(new File(CommonUtil.ROOT_Path+"pdf"));
			cfg.setDefaultEncoding("UTF-8");
			//cfg.setTemplateUpdateDelayMilliseconds(0);
			cfg.setTemplateExceptionHandler(TemplateExceptionHandler.RETHROW_HANDLER);
			dateTmp = cfg.getTemplate("pdf.ftl");
		}catch(Exception ex){
			ex.printStackTrace();
		}
	}
	
	public static void creadPdf(Map<String, Object> dataMap) throws Exception{
		OutputStream out = new FileOutputStream(CommonUtil.ROOT_Path+"/temp/成绩单.pdf");
		ITextRenderer render = new ITextRenderer();
		render.getFontResolver().addFont(CommonUtil.ROOT_Path + "pdf/arialuni.ttf", BaseFont.IDENTITY_H, BaseFont.NOT_EMBEDDED);
        render.getFontResolver().addFont(CommonUtil.ROOT_Path + "pdf/simsun.ttc", BaseFont.IDENTITY_H, BaseFont.NOT_EMBEDDED);
        StringWriter writer = new StringWriter();
        dateTmp.process(dataMap,writer);
        writer.flush();
        String  html = writer.toString();
        render.setDocumentFromString(html);
        render.layout();
        render.createPDF(out);
        render.finishPDF();
        render = null;
        out.close();
	}
}
