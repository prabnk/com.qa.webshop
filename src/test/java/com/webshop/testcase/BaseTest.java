package com.webshop.testcase;

import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeMethod;


import com.webshop.driver.DriverScript;
import com.webshop.pages.HomePage;
import com.webshop.pages.LoginPage;

public class BaseTest extends DriverScript {
	HomePage hp; 
	LoginPage lp;
@BeforeMethod
	public void setup()
	{
	initApplication();
	 hp = new HomePage();
	 lp = new LoginPage();
	}
@AfterMethod
public void teardown() throws InterruptedException
{
	Thread.sleep(3000);
	QuitDriver();
}
}
