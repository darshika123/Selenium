package com.dar.pageflow;

import org.openqa.selenium.WebDriver;


import com.dar.page.HomePage;


public class LoginPageFlow {


	public static void goToLogin(WebDriver driver){
		HomePage hm = new HomePage(driver);
		hm.loginClick();
	
	
	}	
	

}
