package com.dar.tests;

import com.dar.commom.CommonTest;
import com.dar.page.LoginPage;
import com.dar.pageflow.LoginPageFlow;

import static org.testng.Assert.*;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginPageTest extends CommonTest {
	
	LoginPage lp;
	
	@BeforeClass
	public void beforeClass(){
		lp = new LoginPage(driver);
		LoginPageFlow.goToLogin(driver);
	}
	
	
	
	
	
	@Test
	public void testLogin(){
		assertTrue(lp.login());
	}
	
	@Test
	public void test(){
		assertTrue(lp.forgotPassword());
	}
	
}
