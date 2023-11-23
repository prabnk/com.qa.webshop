package com.webshop.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.webshop.driver.DriverScript;

public class HomePage extends DriverScript
{
	//***********************Page Elements**********************************************//
	
	@FindBy(linkText = "Register")WebElement registerLink;
	@FindBy(linkText = "Log in")WebElement LoginLink;
	@FindBy(xpath="//img[@alt='Tricentis Demo Web Shop']") WebElement webshopImg;
	@FindBy(xpath="(//a[contains(text(),'Books')])[1]") WebElement booksMenu;
	@FindBy(linkText = "Log out")WebElement LogoutLink;
	@FindBy(xpath ="(//a[@class='account'])[1]") WebElement userLoggedin;
		
	//**********************Page Initialization********************************************//
	
	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}

	//***************************pageMethods/Actions**************
	public boolean isRegisterLinkDisplayed()
	{
		return registerLink.isDisplayed();
	}
	
	
	
	public boolean isuserLoggedDisplayed()
	{
		return userLoggedin.isDisplayed();
	}
	
	public String getuserLoggedin()
	{
		return userLoggedin.getText();
	}
	public void clickLogoutLink()
	{
		LogoutLink.click();
				
	}
	
	
	public void clickRegisterLink()
	{
		registerLink.click();
		
	}
	public void clickLoginLink()
	{
		LoginLink.click();
				
	}
	public boolean webshopImg()
	{
		return webshopImg.isDisplayed();
		
	}
	
	public String getHomePageTitle()
	{
		return driver.getTitle();
	}
	
	public void bookMenu()
	{
		booksMenu.click();
	}
}
