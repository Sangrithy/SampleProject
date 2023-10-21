package com.app.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.app.pageexecution.LoginPageExe;

public class SearchHotelLocator extends LoginPageExe{
	
	public SearchHotelLocator() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (id = "location")
	private WebElement location;

	public WebElement getLocation() {
		return location;
	}	
	
	@FindBy (id = "hotels")
	private WebElement hotels;

	public WebElement getHotels() {
		return hotels;
	}	
	
	@FindBy (id = "room_type")
	private WebElement roomtype;

	public WebElement getRoomtype() {
		return roomtype;
	}	
	
	@FindBy (id = "room_nos")
	private WebElement roomno;

	public WebElement getRoomno() {
		return roomno;
	}	
	
	@FindBy (id = "datepick_in")
	private WebElement datepickin;

	public WebElement getDatepickin() {
		return datepickin;
	}	
	
	@FindBy (id = "datepick_out")
	private WebElement datepickout;

	public WebElement getDatepickout() {
		return datepickout;
	}
	
	@FindBy (id = "adult_room")
	private WebElement adultroom;

	public WebElement getAdultroom() {
		return adultroom;
	}	
	
	@FindBy (id = "child_room")
	private WebElement childroom;

	public WebElement getChildroom() {
		return childroom;
	}	
	
	@FindBy (id = "Submit")
	private WebElement Submit;

	public WebElement getSubmitb() {
		return Submit;
	}
	
	
}
//	public static WebElement location_locator() {
//		return driver.findElement(By.xpath("//select[@id='location']"));
//	}
//	
//	public static WebElement hotel_locator() {
//		return driver.findElement(By.xpath("//select[@id='hotels']"));	
//	}
//	
//	public static WebElement roomtype_locator() {
//		return driver.findElement(By.xpath("//select[@id='room_type']"));	
//	}
//	
//	public static WebElement roomno_locator() {
//		return driver.findElement(By.xpath("//select[@id='room_nos']"));	
//	}
//	
//	public static WebElement checkin_locator() {
//		WebElement ele1= driver.findElement(By.id("datepick_in"));
//		ele1.clear();
//		return ele1;
//	}
//	
//	public static WebElement checkout_locator() {
//		WebElement ele= driver.findElement(By.id("datepick_out"));
//		ele.clear();
//		return ele;
//		
//	}
//	
//	public static WebElement adultperroom_locator() {
//		return driver.findElement(By.xpath("//select[@id='adult_room']"));	
//	}
//	
//	public static WebElement childperroom_locator() {
//		return driver.findElement(By.xpath("//select[@id='child_room']"));	
//	}
//	
//	public static WebElement click_locator() {
//		return driver.findElement(By.xpath("//input[@id='Submit']"));	
//	}
	

	

//}
