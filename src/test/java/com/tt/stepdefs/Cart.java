package com.tt.stepdefs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.tt.pageObjects.ProductCart;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Cart {

	WebDriver driver;
	@Given("^the new user in the homepage$")
	public void the_new_user_in_the_homepage() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Webdrivers\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://demo.oscommerce.com"); 

	}

	@When("^new user click on a product$")
	public void new_user_click_on_a_product() throws Throwable {
		ProductCart object = new ProductCart(driver);
		object.product().click();

	   
	}

	@When("^click add to cart$")
	public void click_add_to_cart() throws Throwable {
		ProductCart object1 = new ProductCart(driver);
		object1.addcart().click();

	  
	}

	@When("^click update$")
	public void click_update() throws Throwable {
		ProductCart object2= new ProductCart (driver);
		object2.update().click();

	}

	@Then("^user will find the product in shopping cart$")
	public void user_will_find_the_product_in_shopping_cart() throws Throwable {
	    
	}
}
