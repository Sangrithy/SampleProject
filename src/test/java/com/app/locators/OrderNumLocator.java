package com.app.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.app.pageexecution.BookingPageExecution;

public class OrderNumLocator extends BookingPageExecution {
	
	public OrderNumLocator() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (id = "order_no")
	private WebElement orderno;

	public WebElement getOrderno() {
		return orderno;
	}

}
