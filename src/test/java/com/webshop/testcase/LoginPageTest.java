package com.webshop.testcase;


import org.testng.annotations.Test;




public class LoginPageTest extends BaseTest {

	@Test
	public void testLoginFunction() {
		
		 hp.clickLoginLink();
		 lp.enterEmail("saradvd25@hotmail.com");
		 lp.enterPassword("Pa55word");
		 lp.clickloginButton();
		
		
	}
}
