package com.arcgate.base;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {

	
	Properties p=new Properties();
	FileReader f;
	FileReader fr;
	Properties pr=new Properties();
    protected WebDriver driver;
	
	
	
	@BeforeMethod
	public void setUp() throws IOException  {
		
		
		if (driver==null) {
			f=new FileReader(System.getProperty("user.dir")+ "\\properties\\configs.properties");
			p.load(f);
			
			fr=new FileReader(System.getProperty("user.dir")+"\\properties\\locator.properties");
			pr.load(fr);
		}
		
		
		if(p.getProperty("browser").equalsIgnoreCase("chrome")) {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();	
		driver.get(p.getProperty("URL"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
				
		}
		
		
		else if(p.getProperty("browser").equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			driver.manage().window().maximize();	
			driver.get(p.getProperty("URL"));
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		}	
	}
	@AfterMethod
	public void tearDown() {
       
			driver.quit();
        
	
	}
	
	

		
	}
	
	



