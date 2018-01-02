package com.tt.stepdefs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CheckOut {
	WebDriver driver;
	
	@Given("^User is in the homepage$")
	public void user_is_in_the_homepage() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Webdrivers\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://demo.oscommerce.com"); 
	
	}

	@When("^user click log yourself in$")
	public void user_click_log_yourself_in() throws Throwable {
		driver.findElement(By.linkText("log yourself in")).click();
		
	
	}

	@When("^insert \"([^\"]*)\" and \"([^\"]*)\"$")
	public void insert_and(String arg1, String arg2) throws Throwable {
		driver.findElement(By.name("email_address")).sendKeys(arg1);
		driver.findElement(By.name("password")).sendKeys(arg2);
	}

	@When("^click signin and checkout box$")
	public void click_signin_and_checkout_box() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"tdb1\"]/span[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"tdb2\"]/span[2]")).click();
	
	}

	@Then("^user will find delivery information page$")
	public void user_will_find_delivery_information_page() throws Throwable {
		
	
	}

	@Then("^user will click continue and select cash on Delivery$")
	public void user_will_click_continue_and_select_cash_on_Delivery() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"tdb6\"]/span[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"bodyContent\"]/form/div/div[4]/table[6]/tbody/tr/td[2]/input")).click();
	   
	}

	@Then("^click continue$")
	public void click_continue() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"tdb6\"]/span[2]")).click();
		
	  
	}

	@Then("^user will find oder confirmation page$")
	public void user_will_find_oder_confirmation_page() throws Throwable {
	
	}

	@Then("^click Paynow$")
	public void click_Paynow() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"tdb5\"]/span")).click();
		
	 
	}


}
