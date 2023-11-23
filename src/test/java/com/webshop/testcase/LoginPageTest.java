package com.webshop.testcase;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest {

	@Test(dataProvider = "wsdata")
	public void testLoginFunction(String username,String password) {

		Logger = report.createTest("Test Login Function");
		hp.clickLoginLink();
		Logger.pass("Clicked on Login button");
		lp.enterEmail(username);
		Logger.pass("Entered Email");
		lp.enterPassword(password);
		Logger.pass("Entered Password");
		lp.clickloginButton();
		Logger.pass("Clicked on Login button");
		boolean flag= hp.isuserLoggedDisplayed();
		Assert.assertTrue(flag);
		Logger.pass("Verified the user Logged in element");
		hp.clickLogoutLink();
		Logger.pass("User Loggedout");

	}
}
