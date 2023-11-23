package com.webshop.testcase;

import java.io.IOException;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.MediaEntityModelProvider;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.webshop.driver.DriverScript;
import com.webshop.pages.HomePage;
import com.webshop.pages.LoginPage;
import com.webshop.pages.RegisterPage;
import com.webshop.utils.ExcelUtil;
import com.webshop.utils.HelperUtil;

public class BaseTest extends DriverScript {
	HomePage hp;
	LoginPage lp;
	RegisterPage rp; 
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
		rp = new RegisterPage();
	}

	@AfterMethod
	public void teardown(ITestResult result)  {
		
		if(result.getStatus()==ITestResult.FAILURE)
		{
		try {
			Logger.fail("test-failed", 
					MediaEntityBuilder.createScreenCaptureFromPath(HelperUtil.captureScreenShot(driver)).build());
		} catch (IOException e) {
			
			e.printStackTrace();
		}
			
		}
		report.flush();
		HelperUtil.sleep();
		QuitDriver();
	}
	@DataProvider(name = "wsdata")
	public Object[][] testData() {
		ExcelUtil excel = new ExcelUtil("./src/test/resources/testdata/wsdata.xlsx");
		int row = excel.getRowCount(0);
		 Object[][] data = new Object[row][2];
		for (int i = 0; i < row; i++)
		 {
			
				data[i][0]=excel.getCellData(0, i, 0);
				data[i][1]=excel.getCellData(0, i, 1);
			
		}
		
		
		
		return data;

	}

}
