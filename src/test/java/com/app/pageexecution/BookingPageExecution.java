package com.app.pageexecution;

import com.app.base.BaseClass;
import com.app.locators.BookingPageLocator;

public class BookingPageExecution extends BookingPageLocator{
	
	public static void firstname() {
		BaseClass.inputValue(new BookingPageLocator().getFirstname() , (excelreuse(4,0)));
	}
	
	public static void lastname() {
	BaseClass.inputValue(new BookingPageLocator().getLastname() , (excelreuse(4,1)));
    }
	
	public static void addresss() {
		BaseClass.inputValue(new BookingPageLocator().getAddress() , (excelreuse(4,2)));
	}
	
	public static void ccno() {
	BaseClass.inputValue(new BookingPageLocator().getCcnum() , (excelreuse(5,1)));
    }
	
	public static void cctype() {
		BaseClass.dropDownValuesSelect(new BookingPageLocator().getCctype() , "VISA");
	}
	
	public static void expmonth() {
	BaseClass.dropDownValuesSelect(new BookingPageLocator().getCcexpmonth() , "3");
    }
	
	public static void expyear() {
		BaseClass.dropDownValuesSelect(new BookingPageLocator().getCcexpyear() , "2029");
	}
	
	public static void cvvno() {
	BaseClass.inputValue(new BookingPageLocator().getCccvv() , (excelreuse(5,2)));
    }
	
	public static void booknowbutton() {
	BaseClass.click_value(new BookingPageLocator().getBooknow());
   }
	
	

}
//	public static void firstname() {
//		BaseClass.inputValue(BookingPageLocator.firstname_locator(),(excelreuse(4,0)));
//	}
//	
//	public static void lastname() {
//		BaseClass.inputValue(BookingPageLocator.lastname_locator(), (excelreuse(4,1)));
//	}
//	
//	public static void address() {
//		BaseClass.inputValue(BookingPageLocator.address_locator(), (excelreuse(4,2)));
//	}
//	
//	public static void ccno() {
//		BaseClass.inputValue(BookingPageLocator.ccno_locator(), (excelreuse(5,1)));
//	}
//	
//	public static void cctype() {
//		BaseClass.dropDownValuesSelect("VISA" , BookingPageLocator.cctype_locator());
//	}
//	
//	public static void expmonth() {
//		BaseClass.dropDownValuesSelect("3" , BookingPageLocator.expmonth_locator());
//	}
//	
//	public static void expyear() {
//		BaseClass.dropDownValuesSelect("2029" , BookingPageLocator.expyear_locator());
//	}
//	
//	public static void cvvno() {
//		BaseClass.inputValue(BookingPageLocator.ccvno_locator(), (excelreuse(5,2)));
//	}
//	
//	public static void booknowbutton() {
//		BaseClass.click_value(BookingPageLocator.booknow_locator());
//	}
//
//}
