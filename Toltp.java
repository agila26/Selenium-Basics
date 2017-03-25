package test;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Toltp {
	public static void main(String[]args)
	{
		WebDriver dr=new FirefoxDriver();
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		dr.get("https://www.facebook.com/?_rdr=p");
		WebElement e= dr.findElement(By.partialLinkText("People"));
		String tooltip=e.getAttribute("title");
		if(tooltip.equals("Browse our people directory."))
		{
		System.out.println(" available");
		
		
		}
		else{
			System.out.println("unavailable");
		}
		dr.close();

}
}