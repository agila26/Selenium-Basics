package ExcelProgs;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Lstcl {
	public static void main(String[]args)
	{
		File f=new File("/home/aki/Ex2.xlsx");
		try{
			FileInputStream fis=new FileInputStream(f);
			Workbook wb=WorkbookFactory.create(fis);
			Sheet st=wb.getSheetAt(1);
			int lastrownum=st.getLastRowNum();

			for(int j=0;j<lastrownum;j++)
			{	
			Row r1=st.getRow(j);
			int lastcel=r1.getLastCellNum();
			
			
			for(int i=0;i<lastcel;i++)
			{
				Cell c=r1.getCell(i);
				System.out.println(c.getStringCellValue());
				
			}
			
			
			}}
		catch(Exception e)
		{
			e.printStackTrace();
			
			
		}
	}

}
