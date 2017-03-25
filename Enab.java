package test;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Enab {
	public static void main(String[] args)
	{
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.google.co.in/");
	WebElement ele=driver.findElement(By.id("gs_htif0"));
	boolean status=ele.isEnabled();
	if(status==true)
	{
		System.out.println("Enabled");
		
	}
	else{
		System.out.println("Disabled");
		
	}
	driver.close();
	
	
	
	}
	
	

}
