package com.webshop.testcase;


import org.testng.Assert;
import org.testng.annotations.Test;




public class LoginPageTest extends BaseTest {

	@Test
	public void testLoginFunction() {
		
		 hp.clickLoginLink();
		 lp.enterEmail("saradvd25@hotmail.com");
		 lp.enterPassword("Pa55word");
		 lp.clickloginButton();
		String actual = hp.getuserLoggedin();
		Assert.assertEquals("saradvd25@hotmail.com", actual);
		hp.clickLogoutLink();
		
		
	}
}
