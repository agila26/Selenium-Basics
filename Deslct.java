package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Deslct {
	public static void main(String[]args)
	{
		WebDriver dr=new FirefoxDriver();
		dr.get("file:///home/aki/Documents/DDM.html");
		WebElement e=dr.findElement(By.xpath("//select"));
		Select sc=new Select(e);
		sc.selectByValue("01");
		sc.selectByValue("02");
		sc.deselectByIndex(1);
		
	}
}
	