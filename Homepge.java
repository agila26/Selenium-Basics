package pageObjects;

import org.openqa.selenium.*;


public class Homepge {
	// initializing to null is imp.
	private static WebElement ele=null;
	
	// return type is WebElement so return ele .
	public static WebElement  social(WebDriver dr)
	{
		return dr.findElement(By.xpath("//div[contains(@id,':2x')]"));
	}
	public static WebElement logout(WebDriver dr)
	{   
		
		return dr.findElement(By.xpath("//span[contains(@class,'gb_2a gbii')]"));
		
		
		
	}
	
	public static WebElement logout1(WebDriver dr)
	{   
	
	dr.findElement((By.id("gb_71")));
	
return ele;
	}
}
