package com.webshop.pages;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebElement;
import com.webshop.driver.DriverScript;


public class RegisterPage extends DriverScript {

	//***********************Page Elements**********************************************//
	@FindBy(id="gender-male")WebElement maleRadioButton;
	@FindBy(id="gender-Female")WebElement FemaleRadioButton;
	@FindBy(name="FirstName")WebElement FirstNameTextBox;
	@FindBy(name="LastName")WebElement LastNameTextBox;
	@FindBy(id="Email")WebElement EmailTextBox;
	@FindBy(id="register-button")WebElement RegisterButton;

//**********************Page Initialization********************************************//
public RegisterPage()
{
	PageFactory.initElements(driver,this);
}
//***************************pageMethods/Actions**************

public String getRegisterPageTitle()
{
	return driver.getTitle();
	
}
public void clickMaleRadioButton()
{
	 maleRadioButton.click();
	 
}
public void clickFeMaleRadioButton()
{
	 FemaleRadioButton.click();
	 
}
public void enterFirstName(String FirstName)
{
	FirstNameTextBox.sendKeys(FirstName);
}
public void enterLastName(String LastName)
		
{
	LastNameTextBox.sendKeys(LastName);
}
public void enterEmail(String Email)

{
	EmailTextBox.sendKeys(Email);
}
public boolean isRegisterButtonEnabled()
{
	return RegisterButton.isEnabled();
}
}