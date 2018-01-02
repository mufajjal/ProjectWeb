package com.tt.stepdefs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class UserAccount {
	WebDriver driver;
	
	@Given("^new user to the oscommerce home page$")
	public void new_user_to_the_oscommerce_home_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Webdrivers\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://demo.oscommerce.com"); 
	    
	}

	@Given("^new user wants to register for a user account$")
	public void new_user_wants_to_register_for_a_user_account() throws Throwable {
	
	}

	@When("^new user click create an account$")
	public void new_user_click_create_an_account() throws Throwable {
		driver.findElement(By.linkText("create an account")).click();
		
	}

	@When("^click \"([^\"]*)\"$")
	public void click(String arg1) throws Throwable {
		driver.findElement(By.xpath("//input[@value='m']")).click();
	    
	}

	@When("^enter \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\", \"([^\"]*)\"$")
	public void enter(String arg1, String arg2, String arg3, String arg4, String arg5, String arg6, String arg7, String arg8, String arg9, String arg10, String arg11, String arg12) throws Throwable {
	   
		    driver.findElement(By.name("firstname")).sendKeys(arg1);
		    driver.findElement(By.name("lastname")).sendKeys(arg2);
		    driver.findElement(By.name("dob")).sendKeys(arg3);
		    driver.findElement(By.name("email_address")).sendKeys(arg4);
		    driver.findElement(By.name("street_address")).sendKeys(arg5);
		    driver.findElement(By.name("postcode")).sendKeys(arg6);
		    driver.findElement(By.name("city")).sendKeys(arg7);
		    driver.findElement(By.name("state")).sendKeys(arg8);
		    driver.findElement(By.name("country")).sendKeys(arg9);
		    driver.findElement(By.name("telephone")).sendKeys(arg10);
		    driver.findElement(By.name("password")).sendKeys(arg11);
		    driver.findElement(By.name("confirmation")).sendKeys(arg12);
		    
	}

	@Then("^new user will click continue$")
	public void new_user_will_click_continue() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"tdb4\"]/span[2]")).click();
	   
	}

	@Then("^new user will be automatically logged in$")
	public void new_user_will_be_automatically_logged_in() throws Throwable {
	   

	}}