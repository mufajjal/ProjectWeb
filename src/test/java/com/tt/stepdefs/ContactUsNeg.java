package com.tt.stepdefs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.tt.pageObjects.NegContactUs;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ContactUsNeg {
	WebDriver driver;

	@Given("^new user are at the Oscommerce homepage$")
	public void new_user_are_at_the_Oscommerce_homepage() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Webdrivers\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://demo.oscommerce.com"); 

	}
	@When("^user go to contact Us$")
	public void user_go_to_contact_Us() throws Throwable {
		 NegContactUs object = new NegContactUs(driver);
		 object.contactus().click();
	}

	@When("^User insert \"([^\"]*)\"and \"([^\"]*)\"$")
	public void user_insert_and(String arg1, String arg2) throws Throwable {
		NegContactUs object4= new NegContactUs(driver);
		object4.fullname().sendKeys(arg1);
		object4.enquiry().sendKeys(arg2);
		
		

	}

	@When("^insert wrong \"([^\"]*)\"$")
	public void insert_wrong(String arg1) throws Throwable {
		NegContactUs object5= new NegContactUs(driver);
		object5.email().sendKeys(arg1);

	}

	@When("^user Continue by click$")
	public void user_Continue_by_click() throws Throwable {
		NegContactUs object6= new NegContactUs(driver);
		object6.clickcontinue().click();

	}

	@Then("^User get a meassags \"([^\"]*)\"$")
	public void user_get_a_meassags(String arg1) throws Throwable {

	}

}
