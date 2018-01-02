package com.tt.stepdefs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ProductDetails {
	WebDriver driver;
	
	@Given("^the new user is in the homepage$")
	public void the_new_user_is_in_the_homepage() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Webdrivers\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://demo.oscommerce.com"); 
	    
	}

	@When("^user click on any product$")
	public void user_click_on_any_product() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"bodyContent\"]/div/div[2]/table/tbody/tr[1]/td[1]/a[2]")).click();
	  
	}

	@Then("^user will find details of product$")
	public void user_will_find_details_of_product() throws Throwable {
	  
	}

}
