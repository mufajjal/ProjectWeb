package com.tt.stepdefs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ProductPrice {
	
	WebDriver driver;
	@Given("^new user is in the homepage\\.$")
	public void new_user_is_in_the_homepage() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Webdrivers\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://demo.oscommerce.com"); 
	   
	}

	@When("^user click currencies$")
	public void user_click_currencies() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"columnRight\"]/div[5]/div[2]/form/select")).click();
	 
	}

	@When("^select Euro$")
	public void select_Euro() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"columnRight\"]/div[5]/div[2]/form/select")).submit();
		driver.findElement(By.xpath("//*[@id=\"columnRight\"]/div[5]/div[2]/form/select/option[2]")).click();
	}

	@Then("^user will see the product price in Euro$")
	public void user_will_see_the_product_price_in_Euro() throws Throwable {
	
	}

}
