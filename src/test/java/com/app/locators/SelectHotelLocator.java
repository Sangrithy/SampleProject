package com.app.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.app.pageexecution.SearchHotelExecution;

public class SelectHotelLocator extends SearchHotelExecution{
	public SelectHotelLocator() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (id = "radiobutton_0")
	private WebElement radiobutton;

	public WebElement getRadiobutton() {
		return radiobutton;
	}	
	
	@FindBy (id = "continue")
	private WebElement continueb;

	public WebElement getContinueb() {
		return continueb;
	}
}
//	public static WebElement selectbutton_locator() {
//		return driver.findElement(By.xpath("//input[@id='radiobutton_0']"));	
//	}
//	
//	public static WebElement continue_locator() {
//		return driver.findElement(By.xpath("//input[@id='continue']"));	
//	}
//
//}
