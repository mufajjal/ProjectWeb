package com.tt.stepdefs;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.tt.pageObjects.UserLogIn;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class UserLoginLogout {
	
	WebDriver driver;
	
	@Given("^user visiting homepage$")
	public void user_visiting_homepage() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Webdrivers\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://demo.oscommerce.com");
	  
	}

	@Given("^click My Account button$")
	public void click_My_Account_button() throws Throwable {
		//driver.findElement(By.linkText("My Account")).click();
		UserLogIn object1 = new UserLogIn (driver);
		object1.MyAccount().click();
	   
	}

	@When("^user enter \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enter_and(String arg1, String arg2) throws Throwable {
		//driver.findElement(By.name("email_address")).sendKeys(arg1);
		//driver.findElement(By.name("password")).sendKeys(arg2);
		UserLogIn object2 = new UserLogIn(driver);
		object2.emailaddess().sendKeys(arg1);
		object2.password().sendKeys(arg2);
		
	}

	@When("^user click on sign in button$")
	public void user_click_on_sign_in_button() throws Throwable {
		//driver.findElement(By.xpath("//*[@id=\"tdb1\"]/span[2]")).click();
		UserLogIn object3 = new UserLogIn(driver);
		object3.signIn().click();
	
	 
	}

	@Then("^user successfully login to the system$")
	public void user_successfully_login_to_the_system() throws Throwable {
	    
	}

	@Then("^user click on Log off Button for logout$")
	public void user_click_on_Log_off_Button_for_logout() throws Throwable {
	   
	}


	

}