package test;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.firefox.FirefoxDriver;

public class chksomddl {
	public static void main(String[]args)
	{
		WebDriver dr=new FirefoxDriver();
		dr.get("file:///home/aki/Documents/DDM.html");
		WebElement e=dr.findElement(By.xpath("//select"));
		Select sc=new Select(e);
		boolean status=sc.isMultiple();
		if(status)
		{
			sc.selectByIndex(1);
			sc.selectByIndex(3);
			sc.selectByIndex(2);
			
			
		}
		else
		{
			System.out.println("Single selector");
		}
		
		
		
	}

}
