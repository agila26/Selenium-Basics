package ExcelProgs;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;



public class Exclone {
	
	public static void main(String[]args) throws FileNotFoundException
	{
		File f=new File("/home/aki/Ex1.xlsx");
		try
		{
	    FileInputStream fis=new FileInputStream(f);
		Workbook wb=WorkbookFactory.create(fis);
		Sheet st=wb.getSheetAt(0);
		String data=st.getRow(1).getCell(1).getStringCellValue();
		System.out.println(data);
		}
		catch(Exception e)
		{
			
		}
	

	}
}

