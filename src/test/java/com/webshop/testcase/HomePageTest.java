package com.webshop.testcase;



import org.testng.Assert;
import org.testng.annotations.Test;



public class HomePageTest extends BaseTest {
	@Test
	public void testHomePageTitle() 
	{
		
		String actual = hp.getHomePageTitle();
		System.out.println(actual);
	    Assert.assertEquals("Demo Web Shop", actual);
	}

	@Test
	public void testWebShopImageIsDisplayed() {
		
		boolean flag = hp.webshopImg();
		System.out.println(flag);
		Assert.assertTrue(flag);
		
	}
}
