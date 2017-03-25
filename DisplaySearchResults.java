package SelOne;
import java.awt.List;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class DisplaySearchResults {
public static void main(String[] args)
{
	System.setProperty("webdriver.gecko.driver", "/home/aki/Downloads/geckodriver");
	//String xpath;
	WebDriver dr=new FirefoxDriver();
	dr.manage().window().maximize();
	dr.get("https://www.python.org/");
//	WebElement ele=dr.findElement(By.xpath(//input[@id='id-search-field']));
    String xpath="//input[@id='id-search-field']";
   // WebElement ele;
    dr.findElement(By.xpath(xpath)).sendKeys("pycon");
    dr.findElement(By.id("submit")).click();
    java.util.List<WebElement> topics=dr.findElements(By.xpath(xpath));
    int size=topics.size();
    if(size>=1)
    {
    for(int i=0;i<size;i++)
    {
    	String text=topics.get(i).getText();
    	System.out.println(text);
    }
    }
    else
    {
    	System.out.println("no results found");
    	dr.quit();
    }
    
    
    
    
}}