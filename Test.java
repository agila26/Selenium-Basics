package SelOne;
import org.openqa.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.*;
public class Test {
	public static void main(String[] args)
	{
		System.setProperty("webdriver.gecko.driver", "/home/aki/Downloads/geckodriver");
		WebDriver dr=new FirefoxDriver();
		dr.navigate().to("https://www.google.co.in/");
		dr.close();
	}
}
