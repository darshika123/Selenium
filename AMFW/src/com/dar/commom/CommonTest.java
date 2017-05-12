package com.dar.commom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.dar.helper.ConfigUtils;
import com.dar.helper.WebUIDriver;

public class CommonTest {
	
	public WebDriver driver;

	@BeforeTest
	public void beforeTest(){
		
		
		
		//String LOCATION = System.getProperty("user.dir","\\resources\\drivers");
		
	//	System.setProperty("webdriver.chrome.driver", LOCATION+"chromedriver.exe");
		
		
		ConfigUtils config = new ConfigUtils("config.properties");
		
		driver = WebUIDriver.getDriver(config);
		
		driver.get(config.URL);
		
				//driver = new ChromeDriver();
		
		
		
		//driver.get("http://hip2save.com/");
		
	}
	
	@AfterSuite
	public void afterSuit(){
		driver.close();
	}
	
	
}
