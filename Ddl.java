package test;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Ddl {
public static void main(String[]args)
{
	WebDriver dr=new FirefoxDriver();
	dr.get("file:///home/aki/Documents/DDl.html");
	WebElement e=dr.findElement(By.xpath("//select"));
	Select sc=new Select(e);
	sc.selectByIndex(2);
	//dr.close();
	
	
}
}
