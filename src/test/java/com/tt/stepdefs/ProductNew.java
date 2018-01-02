package com.tt.stepdefs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.tt.pageObjects.NewProduct;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ProductNew {
	WebDriver driver;
	
	@Given("^user is in the Webpage of the oscommerce$")
	public void user_is_in_the_Webpage_of_the_oscommerce() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Webdrivers\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://demo.oscommerce.com"); 
		
		
	    
	}

	@When("^user click What is New$")
	public void user_click_What_is_New() throws Throwable {
		NewProduct object = new NewProduct(driver);
		object.whatisnew().click();
	}

	@Then("^user can see all new products$")
	public void user_can_see_all_new_products() throws Throwable {
	   
	}


}
