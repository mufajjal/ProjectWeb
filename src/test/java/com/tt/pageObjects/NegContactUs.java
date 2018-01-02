package com.tt.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NegContactUs {

	WebDriver driver;

	public NegContactUs(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@id=\"columnLeft\"]/div[5]/div[2]/a[4]")
	WebElement click_contactus;

	public WebElement contactus() {
		return click_contactus;
	}
	@FindBy(xpath="//*[@id=\"bodyContent\"]/form/div/div[1]/table/tbody/tr[1]/td[2]/input")
	WebElement insert_fullname;
	public WebElement fullname() {
		return insert_fullname;
	}
	@FindBy(xpath="//*[@id=\"bodyContent\"]/form/div/div[1]/table/tbody/tr[2]/td[2]/input")
	WebElement insert_email;
	public WebElement email() {
		return insert_email;
	}
	@FindBy(xpath="//*[@id=\"bodyContent\"]/form/div/div[1]/table/tbody/tr[3]/td[2]/textarea")
	WebElement write_enquiry;
	public WebElement enquiry() {
		return write_enquiry;
	}
	@FindBy(xpath="//*[@id=\"tdb4\"]/span[2]")
	WebElement click_continue;
	public WebElement clickcontinue() {
		return click_continue;
	}
}
