package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class chckbx {
	public static void main(String[]args)
	{
		WebDriver driver=new FirefoxDriver();
	driver.get("https://www.facebook.com/?_rdr=p");
	WebElement e=driver.findElement(By.id("persist_box"));
	boolean sts=e.isSelected();
	if(sts==true)
	{
		System.out.println("Checked");
	}
	else{
		System.out.println("Unchecked");
		//e.click();
		driver.close();
		
	}
	
	
	
	
	}
	
	

}
