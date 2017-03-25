package ExcelProgs;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class Wrtedata {
	public static void main(String[]args)
	{
	
	
		File f=new File("/home/aki/dat.xlsx");
		try{
	FileInputStream fis=new FileInputStream(f);
	Workbook wb=WorkbookFactory.create(fis);
	Sheet st=wb.getSheet("Sheet1");
	st.getRow(0).createCell(0).setCellValue("aki");
	st.getRow(0).createCell(1).setCellValue(1.1);
	
	FileOutputStream fos=new FileOutputStream(f);
	wb.write(fos);
	String dat=st.getRow(0).getCell(0).getStringCellValue();
	System.out.println(dat);
	
	
	
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	
	}
}
