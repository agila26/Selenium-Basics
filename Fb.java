package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;



public class Fb {
	public static void main(String[]args)
	{
		
	
		WebDriver f = new FirefoxDriver();
		f.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	f.manage().window().maximize();
	f.get("https://www.facebook.com/?_rdr=p");
	WebElement ele=f.findElement(By.id("email"));
	ele.sendKeys("agila2612@gmail.com");
	f.findElement(By.id("pass")).sendKeys("strawberry27!");
	f.findElement(By.id("loginbutton")).click();
	f.findElement(By.className("_2dpb")).click();
	
	}
}
