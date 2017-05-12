package com.dar.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends PortalPage {
	
	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public boolean login(){
		
		driver.findElement(By.name("username")).sendKeys("Test@123");
		driver.findElement(By.name("password")).sendKeys("Test@123");
		driver.findElement(By.xpath(".//*[@id='gigya-login-form']/div[2]/div[3]/div[4]/input")).click();//check this
		
		return driver.findElement(By.id("Hip2Save")).isDisplayed();
	}
		
		
	
	
	
     public boolean forgotPassword(){
    	 
    	driver.findElement(By.linkText("Forgot password?")).click();
    	return driver.findElement(By.name("username" )).isDisplayed();
    	 
    	
     }
}
