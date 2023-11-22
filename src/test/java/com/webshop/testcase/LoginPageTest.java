package com.webshop.testcase;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest {

	@Test
	public void testLoginFunction() {

		Logger = report.createTest("Test Login Function");
		hp.clickLoginLink();
		Logger.pass("Clicked on Login button");
		lp.enterEmail("saradvd25@hotmail.com");
		Logger.pass("Entered Email");
		lp.enterPassword("Pa55word");
		Logger.pass("Entered Password");
		lp.clickloginButton();
		Logger.pass("Clicked on Login button");
		String actual = hp.getuserLoggedin();
		Assert.assertEquals("saradvd25@hotmail.com", actual);
		Logger.pass("Verified the user Logged in");
		hp.clickLogoutLink();
		Logger.pass("User Loggedout");

	}
}
