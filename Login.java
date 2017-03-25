package pagefactry;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	WebDriver driver;
	
	// creating webelements.
	
	@FindBy(id="Email")
	WebElement username;
	
	@FindBy(id="next")
	WebElement nextbutton;
	
	@FindBy(id="Passwd")
	WebElement password;
	
	@FindBy(id="signIn")
	WebElement loginbutton;
	
	// creating constructor
	//pagefactory- identifies all webelements in one shot.
	
	public Login(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	// creating methods
	
	public void lognpass()
	{
		username.sendKeys("agila2612@gmail.com");
		nextbutton.click();
		password.sendKeys("strawberry26!");
		loginbutton.click();
		
	}
	
	// giving invalid credentials
	
	public void lognfail()
	{
		username.sendKeys("agila2612@gmail.com");
		nextbutton.click();
		password.sendKeys("strawberry2");
		loginbutton.click();
	}


public static void main(String[]args)
{
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	try{
		driver.get("https://www.gmail.co.in/");
	
	Login l1=new Login(driver);
	l1.lognfail();
	l1.lognpass();
	
	
	
	}
	catch(Exception e)
	{
		System.out.println("login fail");
		}
	
finally
{
	driver.close();
}
	
	
	
}

}

