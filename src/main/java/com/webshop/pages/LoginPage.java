package com.webshop.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.webshop.driver.DriverScript;

public class LoginPage extends DriverScript{
	//***********************Page Elements**********************************************//
	
	@FindBy(id="Email") WebElement emailTextbox;
	@FindBy(name="Password")WebElement passwordTextbox;
	@FindBy(linkText = "Forgot password?")WebElement forgotPasswordlink;
	@FindBy(xpath = "//input[@value='Log in']")WebElement loginButton;
	
	//**********************Page Initialization********************************************//
	
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}

	//***************************pageMethods/Actions**************
	
	public String getLoginPaeTitle()
	{
		return driver.getTitle();
	}
	public void clickloginButton()
	{
		loginButton.click();
	}
	
	
	public void enterEmail(String email)
	{
		emailTextbox.clear();
		emailTextbox.sendKeys(email);
	}
	public void enterPassword(String password)
	{
		
		passwordTextbox.sendKeys(password);
		
	}
	public boolean forgotPasswordlink()
	{
	  return forgotPasswordlink.isDisplayed();
	}
	
	

}
