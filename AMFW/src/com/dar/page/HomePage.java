package com.dar.page;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends PortalPage {

	public HomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor 
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	}
	
    public void loginClick(){
    	driver.findElement(By.linkText("Login")).click();
    }

	public boolean newsletterPresent(){
		return driver.findElement(By.cssSelector(".topbar-newsletter")).isDisplayed();
	}
	
	public boolean couponPresent(){
		return driver.findElement(By.cssSelector(".topbar-coupon-db")).isDisplayed();
	}
	
	public boolean sectionHeaders(){
		return driver.findElement(By.cssSelector(".section-heading .line")).isDisplayed();
	}



	
	
	
}
