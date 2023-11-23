package com.webshop.testcase;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.webshop.utils.HelperUtil;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class RegisterPageTest extends BaseTest{
	@Test
public void testRegisterPage()
{
	Logger=report.createTest("TestRegisterUser");
	hp.clickRegisterLink();
	Logger.pass("clicked on Register link from Homepage");
	String title = rp.getRegisterPageTitle();
	Assert.assertTrue(title.contains("Register"));
	Logger.pass("Navigated to the register page");
	rp.clickMaleRadioButton();
	Logger.pass("clicked male radio button");	
	rp.enterFirstName("Nanda");
	Logger.pass("Entered First Name");	
	rp.enterLastName("Kumar");
	Logger.pass("Entered Last Name");		
	rp.enterEmail("Nanda75@gmail.com");
	Logger.pass("Entered Email Address");	
	HelperUtil.sleep();
	boolean buttonEnabled = rp.isRegisterButtonEnabled();
	System.out.println(buttonEnabled);
	Assert.assertTrue(buttonEnabled);
	Logger.pass("Register button is Enabled and Validated");
	HelperUtil.sleep();		
	
	
}
}
