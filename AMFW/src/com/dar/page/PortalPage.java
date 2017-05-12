package com.dar.page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.dar.commom.CommonPage;

public class PortalPage extends CommonPage {

	public PortalPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public int socialIcons(){
		List<WebElement>elements = driver.findElements(By.cssSelector(".topbar-social li"));
	
	return elements.size();
		
	}
	
	public boolean isLogoPresent(){
		
		return driver.findElement(By.cssSelector(".logo")).isDisplayed();
		
	}
	
	public int navItems(){
		
		return driver.findElements(By.cssSelector(".nav-inner-padding .main-nav li")).size();
		
	}
	
	public boolean footerBar(){
		
	return driver.findElement(By.cssSelector(".grandma-tagline")).isDisplayed();
		
	}

}
