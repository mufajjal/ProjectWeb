package com.tt.stepdefs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ContactUS {
	
	WebDriver driver;
	
	@Given("^new user are at the homepage of Oscommerce$")
	public void new_user_are_at_the_homepage_of_Oscommerce() throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Webdrivers\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://demo.oscommerce.com"); 
	  
	}

	@When("^user click contact Us$")
	public void user_click_contact_Us() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"columnLeft\"]/div[5]/div[2]/a[4]")).click();
	
	}

	@When("^User insert \"([^\"]*)\"and \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_insert_and_and(String arg1, String arg2, String arg3) throws Throwable {
		driver.findElement(By.name("name")).sendKeys(arg1);
		driver.findElement(By.name("email")).sendKeys(arg2);
		driver.findElement(By.name("enquiry")).sendKeys(arg3);
	
	}

	@Then("^user Click Continue$")
	public void user_Click_Continue() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"tdb4\"]/span[2]")).click();
	  
	}

	@Then("^User will get confirmation meassags \"([^\"]*)\"$")
	public void user_will_get_confirmation_meassags(String arg1) throws Throwable {
	  
	}



}
