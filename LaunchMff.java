package test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchMff {
	public static void main(String[]args)
	{
		FirefoxDriver f=new FirefoxDriver();

		f.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		f.manage().window().maximize();
		f.get("http://www.google.com");
		f.navigate().to("http://www.gmail.com");
		f.findElement(By.id("Email")).sendKeys("agila2612@gmail.com",Keys.ENTER);
		f.findElement(By.id("Passwd")).sendKeys("strawberry26!",Keys.ENTER);
		//f.close();
	}
		
	}


