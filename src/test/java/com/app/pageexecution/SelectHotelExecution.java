package com.app.pageexecution;

import com.app.base.BaseClass;
import com.app.locators.SelectHotelLocator;

public class SelectHotelExecution extends SelectHotelLocator{
	
	public static void selectbutton() {
		BaseClass.click_value(new SelectHotelLocator().getRadiobutton());
	   }
	
	public static void continuebutton() {
		BaseClass.click_value(new SelectHotelLocator().getContinueb());
	   }
}
//	public static void selectbutton() {
//		BaseClass.click_value(SelectHotelLocator.selectbutton_locator());
//	}
//	
//	public static void continuebutton() {
//		BaseClass.click_value(SelectHotelLocator.continue_locator());
//	}

//}
