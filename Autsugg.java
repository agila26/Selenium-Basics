package test;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;



public class Autsugg {
	public static void main(String[]args)
	{
		WebDriver dr=new FirefoxDriver();
		dr.manage().window().maximize();
		dr.get("https://www.google.co.in/?gws_rd=ssl");
		dr.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		dr.findElement(By.id("lst-ib")).sendKeys("selenium");
		
		List<WebElement>sugg=dr.findElements(By.xpath("//div[@class='sbqs_c']"));

		for(int i=0;i<sugg.size();i++)
		{
			String str=sugg.get(i).getText();
		
			
			
			System.out.println(str );
		}
		
		  			sugg.get(3).click();
		  			String s=dr.getCurrentUrl();
		  			System.out.println(s);
		  			System.out.println(sugg.size());
		  			//dr.close();
			
	

}
}