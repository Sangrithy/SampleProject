package com.app.pageexecution;

import com.app.base.BaseClass;
import com.app.locators.SearchHotelLocator;

public class SearchHotelExecution extends SearchHotelLocator{
	
	public static void location() {
		BaseClass.dropDownValuesSelect(new SearchHotelLocator().getLocation() , "Adelaide");
	}
	
	public static void hotel() {
	BaseClass.dropDownValuesSelect(new SearchHotelLocator().getHotels() , "Hotel Hervey");
    }
	
	public static void userroomtype() {
		BaseClass.dropDownValuesSelect(new SearchHotelLocator().getRoomtype() , "Double");
	}
	
	public static void roomno() {
	BaseClass.dropDownValuesSelect(new SearchHotelLocator().getRoomno() , "4");
    }
	
	public static void checkin() {
		BaseClass.inputValue(new SearchHotelLocator().getDatepickin() , (excelreuse(2,0)));
	}
	
	public static void checkout() {
	BaseClass.inputValue(new SearchHotelLocator().getDatepickout() , (excelreuse(2,1)));
    }
	
	public static void adult() {
		BaseClass.dropDownValuesSelect(new SearchHotelLocator().getAdultroom(),"2");
	}
	
	public static void child() {
	BaseClass.dropDownValuesSelect(new SearchHotelLocator().getChildroom() , "4" );
    }
	
	public static void searchbutton() {
	BaseClass.click_value(new SearchHotelLocator().getSubmitb());
   }
	
	
	
	
	
}
//	public static void location() {
//		BaseClass.dropDownValuesSelect("Adelaide" , SearchHotelLocator.location_locator());
//	}
//	
//	public static void hotel() {
//		BaseClass.dropDownValuesSelect("Hotel Hervey" , SearchHotelLocator.hotel_locator());
//	}
//	
//	public static void roomtype() {
//		BaseClass.dropDownValuesSelect("Double" , SearchHotelLocator.roomtype_locator());
//	}
//	
//	public static void roomno() {
//		BaseClass.dropDownValuesSelect("4" , SearchHotelLocator.roomno_locator());
//	}
//	
//	public static void checkin() {
//		BaseClass.inputValue(SearchHotelLocator.checkin_locator(), (excelreuse(2,0)));
//	}
//	
//	public static void checkout() {
//		BaseClass.inputValue(SearchHotelLocator.checkout_locator(), (excelreuse(2,1)));
//	}
//	
//	public static void adults() {
//		BaseClass.dropDownValuesSelect("2" , SearchHotelLocator.adultperroom_locator());
//	}
//	
//	public static void child() {
//		BaseClass.dropDownValuesSelect("4" , SearchHotelLocator.childperroom_locator());
//	}
//	
//	public static void searchbutton() {
//		BaseClass.click_value(SearchHotelLocator.click_locator());
//	}
//}
