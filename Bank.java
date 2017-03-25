package test;
	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.firefox.FirefoxDriver;

	public class Bank 
	{
		public static void main(String[]args)
		{
			FirefoxDriver f=new FirefoxDriver();

			f.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			f.manage().window().maximize();
			f.get("http://192.168.2.2:8080/JNCBank/");
			f.findElementByLinkText("Login").click();
			f.findElementByName("email").sendKeys("email1@provider.com");
			f.findElementByName("password").sendKeys("password1");
			f.findElementByTagName("button").click();
			f.findElementByXPath("(//button)[1]").click();
			f.findElementByName("dep_amt").sendKeys("3000");
			f.findElementByXPath("(//button)[1]").click();
			

}
	}
	
