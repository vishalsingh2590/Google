package com.arcgate.page;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.arcgate.utilities.PropertyReader;

public class SearchItems {
	
 WebDriver driver;
	
	By Product=By.id("APjFqb");
	By ClickBtn=By.xpath("//input[@class=\"gNO89b\"][1]");
	
	public SearchItems(WebDriver driver){
		this.driver=driver;
	}
	
	public void searchProducts() throws InterruptedException 
	{
		Thread.sleep(3000);
		driver.findElement(Product).sendKeys(PropertyReader.get("search"));
		Thread.sleep(3000);
		driver.findElement(ClickBtn).click();		
		Thread.sleep(3000);
	}
	
	public void title() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		String expected=driver.getTitle();	
		String actual="Google";
		System.out.println(expected);
		Assert.assertEquals(actual, expected);
	}
	
	
	
}
