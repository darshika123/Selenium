package com.dar.datadriven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ValidateLoginPage {
	
	WebDriver driver;
	
	@Test(dataProvider = "Hip2SaveData")
	public void LoginCredentialCheck(String username,String password) throws InterruptedException{
		
		String LOCATION = System.getProperty("user.dir","\\resources\\drivers");
		
		System.setProperty("webdriver.chrome.driver", LOCATION+"chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://hip2save.com/");
		
		driver.findElement(By.cssSelector("#mobile-slideout-menu ul .login-link")).click();
		
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.xpath(".//*[@id='gigya-login-form']/div[2]/div[3]/div[4]/input")).click();
		
		Thread.sleep(2000);
		
	Assert.assertEquals(driver.getTitle(),"Hip2Save","User unable to login:Invalid Credential");
	System.out.println("Page title is varified:Login Successful");
	}
	
	@AfterMethod
	
	public void tearDown(){
		
		driver.quit();
		
	}
	
	@DataProvider(name="Hip2SaveData")
	
	
	public Object[][]passData(){
		Object[][]data = new Object[3][2];
		
		data[0][0] = "XYZ@gmail.com";
		data[0][1] = "abc123";
		

		data[1][0] = "darshikasolanki@gmail.com";
		data[1][1] = "parents121";
		

		data[2][0] = "ABC@gmail.com";
		data[2][1] = "xyz123";
		
		return data;
		
	}
		
}
