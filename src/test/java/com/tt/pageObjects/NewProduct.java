package com.tt.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewProduct {

	WebDriver driver;

	public NewProduct(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@id=\"columnLeft\"]/div[4]/div[1]/a")
	WebElement click_whatisnew;

	public WebElement whatisnew() {
		return click_whatisnew;
	}
	
}

