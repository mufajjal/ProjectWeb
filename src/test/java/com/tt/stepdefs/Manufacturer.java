package com.tt.stepdefs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Manufacturer {
	WebDriver driver;
	

@Given("^user is in the homepage of osCommerce Demo$")
public void user_is_in_the_homepage_of_osCommerce_Demo() throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Webdrivers\\chromedriver_win32\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://demo.oscommerce.com"); 
   
}

@When("^user slect the name of manufacturer$")
public void user_slect_the_name_of_manufacturer() throws Throwable {
	driver.findElement(By.xpath("//*[@id=\"columnLeft\"]/div[2]/div[2]/form/select")).click();
	driver.findElement(By.xpath("//*[@id=\"columnLeft\"]/div[2]/div[2]/form/select/option[9]")).click();
   
}

@Then("^user will see the products of that manufacturer$")
public void user_will_see_the_products_of_that_manufacturer() throws Throwable {
  
}


}
