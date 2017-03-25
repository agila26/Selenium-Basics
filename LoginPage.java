package pageObjects;
//creating different packages for Page Objects, Utilities, Test Data, Test Cases and Modular actions. 
//It is always recommended to use this structure, as it is easy to understand, easy to use and easy to maintain.

import org.openqa.selenium.*;
//return type is webelement.
/*Driver is being passed as an Argument so that Selenium is able to locate the element on the browser (driver).

Element is returned, so that an Action can be performed on it.

Method is declared as Public Static, so that it can be called in any other method without instantiate the class.**/
		
public class LoginPage {
	private static WebElement ele=null;
	// create method for each element 
	public static WebElement login(WebDriver dr)
	{
		
		ele=dr.findElement((By.id("Email")));
		
		return ele;
	}
	
	public static WebElement next(WebDriver dr)
	{
		return dr.findElement(By.id("next"));
	}
	
	public static WebElement password(WebDriver dr)
	{
		return dr.findElement(By.id("Passwd"));
	}
	

}
