package com.app.pageexecution;

import java.util.concurrent.TimeUnit;

import com.app.locators.OrderNumLocator;

public class FinalExe extends OrderNumLocator{
	public static void ordernum() {
//		try {
//		Thread.sleep(8000);
//	} catch (InterruptedException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		String ordrno=((new OrderNumLocator().getOrderno()).getAttribute("value"));
		System.out.println("Order Number Is : ");
		System.out.println(ordrno);
//		BaseClass.inputValue(new BookingPageLocator().getCccvv() , (excelreuse(5,2)));
	    }

}
