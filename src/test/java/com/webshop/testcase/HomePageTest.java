package com.webshop.testcase;



import org.testng.Assert;
import org.testng.annotations.Test;



public class HomePageTest extends BaseTest {
	@Test
	public void testHomePageTitle() 
	{
		Logger = report.createTest("Test HomePage Title Validation");
		String actual = hp.getHomePageTitle();
		Logger.pass("Get the HomePage Title");
		System.out.println(actual);
	    Assert.assertEquals("Demo Web Shop", actual);
	    Logger.pass("Validated Homepage Title");
	}

	@Test
	public void testWebShopImageIsDisplayed() {
		Logger = report.createTest("Test Webshop Logo isDisplayed");
		boolean flag = hp.webshopImg();
		Logger.pass("Locate the webshop Logo");
		System.out.println(flag);
		Assert.assertTrue(flag);
		Logger.pass("Logo is present and displayed");
		
	}
}
