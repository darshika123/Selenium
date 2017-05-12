package com.dar.tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

import com.dar.commom.CommonTest;
import com.dar.page.HomePage;

public class HomePageTest extends CommonTest {
	
	HomePage hm;
	
	
	@BeforeClass
	public void beforeClass(){

	hm = new HomePage(driver);
	
	}
	
	
	
	@Test
	public void testnewsletterPresent(){
		assertTrue(hm.newsletterPresent());
	}
	
	@Test
	public void testCouponPresent(){
		assertTrue(hm.couponPresent());
	}


}
	
	
	

	
