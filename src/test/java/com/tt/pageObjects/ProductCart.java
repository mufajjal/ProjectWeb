package com.tt.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductCart {
	WebDriver driver;

	public ProductCart(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@id=\"bodyContent\"]/div/div[2]/table/tbody/tr[1]/td[1]/a[2]")
	WebElement click_product;

	public WebElement product() {
		return click_product;
	}

	@FindBy(xpath = "//*[@id=\"tdb4\"]/span[2]")
	WebElement click_addcart;

	public WebElement addcart() {
		return click_addcart;
	}

	@FindBy(xpath = "//*[@id=\"tdb4\"]/span[2]")
	WebElement click_update;

	public WebElement update() {
		return click_update;
	}
}
