package com.app.pageexecution;

import com.app.base.BaseClass;
import com.app.locators.LoginPageLocator;

public class LoginPageExe extends LoginPageLocator{
	
	public static void username() {
		BaseClass.inputValue(new LoginPageLocator().getUsername() , (excelreuse(3,0)));
	}
	
	public static void password() {
	BaseClass.inputValue(new LoginPageLocator().getPassword() , (excelreuse(3,1)));
    }
	
	public static void loginbutton() {
	BaseClass.click_value(new LoginPageLocator().getLogin());
   }
	
	
//	public static void username() {
//		BaseClass.inputValue(new LoginPageLocator.getUsername() , (excelreuse(3,0)));
//	}
	
//	public static void password() {
//		BaseClass.inputValue(LoginPageLocator.password_locator(), (excelreuse(3,1)));
//	}
//	
//	public static void loginbutton() {
//		BaseClass.click_value(LoginPageLocator.loginbutton_locator());
//	}

}
