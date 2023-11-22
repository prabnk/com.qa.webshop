package com.webshop.testcase;

import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.webshop.driver.DriverScript;
import com.webshop.pages.HomePage;
import com.webshop.pages.LoginPage;

public class BaseTest extends DriverScript {
	HomePage hp;
	LoginPage lp;
	static ExtentHtmlReporter extent;
	static ExtentReports report;
	static ExtentTest Logger;

	@BeforeSuite
	public void setupReport() {
		extent = new ExtentHtmlReporter("./reports/webshopreprt.html");
		report = new ExtentReports();
		report.attachReporter(extent);

	}

	@BeforeMethod
	public void setup() {
		initApplication();
		hp = new HomePage();
		lp = new LoginPage();
	}

	@AfterMethod
	public void teardown() throws InterruptedException {
		report.flush();
		Thread.sleep(3000);
		QuitDriver();
	}
}
