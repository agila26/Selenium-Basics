package test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Mulele {
	public static void main(String[]args)
	{
		WebDriver dr=new FirefoxDriver();
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		dr.get("https://www.google.co.in/#q=java");
		  List<WebElement> list=dr.findElements(By.xpath("//h3[@class='r']"));
		  int size=list.size();
		 /* for(int i=0;i<size;i++)
		  {
			  String text=list.get(i).getText();
			  System.out.println(text);}**/
		  
		  //or use
		

		  for(WebElement ele:list)
		  {
		       System.out.println(ele.getText());
		  } 
			  
		  
		  dr.close();
		  
		  	}

}
