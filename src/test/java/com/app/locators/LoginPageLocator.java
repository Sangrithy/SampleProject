package com.app.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.app.base.BaseClass;

public class LoginPageLocator extends BaseClass{

	public LoginPageLocator() {
		PageFactory.initElements(driver, this);
	}
	
	//@FindBy @FindBys -@FindAll
	@FindBy (id = "username")
	private WebElement username;

	public WebElement getUsername() {
		return username;
	}	
	
	@FindBy (id = "password")
	private WebElement password;

	public WebElement getPassword() {
		return password;
	}	
	
	@FindBy (id = "login")
	private WebElement login;

	public WebElement getLogin() {
		return login;
	}	
	
	

	
}	
//	public static WebElement username_locator() {
//		return driver.findElement(By.id("username"));	
//	}
//	
//	public static WebElement password_locator() {
//		return driver.findElement(By.id("password"));	
//	}
//	
//	public static WebElement loginbutton_locator() {
//		return driver.findElement(By.id("login"));	
//	}
//
//}
