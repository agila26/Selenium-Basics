package ExcelProgs;
import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class RdMul {
	public static void main(String[]args)
	{
		File f=new File("/home/aki/Ex2.xlsx");
		try
		{
		FileInputStream fis=new FileInputStream(f);
		Workbook wb=WorkbookFactory.create(fis);
		Sheet st=wb.getSheetAt(1);
		Row r=st.getRow(2);
		int lastcell=r.getLastCellNum();
		System.out.println(lastcell);
		
		for(int i=0;i<lastcell;i++)
		{
			Cell c=r.getCell(i);
		
			System.out.println(c.getStringCellValue());
			
		}
		
	
			}
		catch(Exception e)
		{
			e.printStackTrace();
			
		}
	
	}

}
