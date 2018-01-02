package com.tt.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserLogIn {

	WebDriver driver;
	public UserLogIn(WebDriver driver) {
		this.driver=driver;
	
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//*[@id=\"tdb3\"]/span[2]")
	WebElement click_MyAccount;
	public WebElement MyAccount()
	{ 
		return click_MyAccount;
		
	}
	@FindBy(name="email_address")
	WebElement edit_emailaddress;
	public WebElement emailaddess()
	{
		return edit_emailaddress;
	}
	
	@FindBy(name="password")
	WebElement edit_password;
	public WebElement password()
	{
		return edit_password;
	}
	
	@FindBy(xpath="//*[@id=\"tdb1\"]/span[2]")
	WebElement click_signIn;
	public WebElement signIn() {
		return click_signIn;
	}
	
}


