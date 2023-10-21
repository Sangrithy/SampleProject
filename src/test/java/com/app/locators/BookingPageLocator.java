package com.app.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.app.pageexecution.SelectHotelExecution;

public class BookingPageLocator extends SelectHotelExecution{
	
	public BookingPageLocator() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (id = "first_name")
	private WebElement firstname;

	public WebElement getFirstname() {
		return firstname;
	}	
	
	@FindBy (id = "last_name")
	private WebElement lastname;

	public WebElement getLastname() {
		return lastname;
	}	
	
	@FindBy (id = "address")
	private WebElement address;

	public WebElement getAddress() {
		return address;
	}	
	
	@FindBy (id = "cc_num")
	private WebElement ccnum;

	public WebElement getCcnum() {
		return ccnum;
	}	
	
	@FindBy (id = "cc_type")
	private WebElement cctype;

	public WebElement getCctype() {
		return cctype;
	}	
	
	@FindBy (id = "cc_exp_month")
	private WebElement ccexpmonth;

	public WebElement getCcexpmonth() {
		return ccexpmonth;
	}
	
	@FindBy (id = "cc_exp_year")
	private WebElement ccexpyear;

	public WebElement getCcexpyear() {
		return ccexpyear;
	}	
	
	@FindBy (id = "cc_cvv")
	private WebElement cccvv;

	public WebElement getCccvv() {
		return cccvv;
	}	
	
	@FindBy (id = "book_now")
	private WebElement booknow;

	public WebElement getBooknow() {
		return booknow;
	}
	
}
	
//	try {
//	Thread.sleep(5000);
//} catch (InterruptedException e) {
//	// TODO Auto-generated catch block
//	e.printStackTrace();
//}
//
//WebElement orderNo = driver.findElement(By.xpath("//input[@id='order_no']"));
//String ordrno=orderNo.getAttribute("value");
//System.out.println("Order Number Is : ");
//System.err.println(ordrno);
//}
	
//}
//	public static WebElement firstname_locator() {
//		return driver.findElement(By.id("first_name"));	
//	}
//	
//	public static WebElement lastname_locator() {
//		return driver.findElement(By.id("last_name"));	
//	}
//	
//	public static WebElement address_locator() {
//		return driver.findElement(By.id("address"));	
//	}
//	
//	public static WebElement ccno_locator() {
//		return driver.findElement(By.id("cc_num"));
//	}
//	
//	public static WebElement cctype_locator() {
//		return driver.findElement(By.xpath("//select[@id='cc_type']"));
//		
//	}
//	
//	public static WebElement expmonth_locator() {
//		return driver.findElement(By.xpath("//select[@id='cc_exp_month']"));	
//	}
//	
//	public static WebElement expyear_locator() {
//		return driver.findElement(By.xpath("//select[@id='cc_exp_year']"));	
//	}
//	
//	public static WebElement ccvno_locator() {
//		return driver.findElement(By.id("cc_cvv"));	
//	}
//	
//	public static WebElement booknow_locator() {
//		return driver.findElement(By.xpath("//input[@id='book_now']"));	
//	}
//
//}
