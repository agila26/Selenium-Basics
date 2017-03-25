package test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Brknlink {
	public static void main(String[]args)
	{
		WebDriver d=new FirefoxDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		d.get("https://en.wikipedia.org/wiki/Blazer");
		WebElement e =d.findElement(By.linkText("High Numbers"));
		
		
		String url=e.getAttribute("href");
		if(url==null)
		{
			System.out.println("Broken link");
		}
		else if (url.contains("http")!=true)
		{
			System.out.println("Broken link");
			
		}
		System.out.println(url);
		d.close();
		
		
		
	}

}
