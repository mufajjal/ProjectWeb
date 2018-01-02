package com.tt.stepdefs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Shipping {
	WebDriver driver;
	
	@Given("^user at Oscommerce web homepage$")
	public void user_at_Oscommerce_web_homepage() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Webdrivers\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://demo.oscommerce.com"); 
	
	}

	@Given("^user click on Top button$")
	public void user_click_on_Top_button() throws Throwable {
	
	 
	}

	@When("^user click Shipping & Returns Policy$")
	public void user_click_Shipping_Returns_Policy() throws Throwable {
		driver.findElement(By.linkText("Shipping & Returns")).click();
	}

	@Then("^User can see all of Shipping & Returns Policy$")
	public void user_can_see_all_of_Shipping_Returns_Policy() throws Throwable {
	    
	}



}
