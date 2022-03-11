package org.Cucumber_Practise;

import java.awt.AWTException;import org.openqa.selenium.chrome.ChromeDriver;



public class Adactin_BaseClass extends Baseee_Class {
	
	public static void main(String[] args) throws AWTException, InterruptedException {
		
		setUp(null);
		urlMax("http://adactinhotelapp.com/");
		
		Adactin_Project ls = new Adactin_Project(driver);
		
				
		sendKeys(ls.getUserName(), "UdayKarthik");
		sendKeys(ls.getPassWord(), "udaya@123");
		clickJs(ls.getLogin());
		
		ls.getLocation().click();
		
		
		robotClassDown(ls.getLocation());
		
		robotClassEnter();
		
		
		ls.getHotels().click();
		
		robotClassDown(ls.getHotels());
		
		robotClassEnter();
		
		
		ls.getRoomType().click();
		
		robotClassDown(ls.getHotels());
		robotClassDown(ls.getHotels());
		robotClassDown(ls.getHotels());
		robotClassDown(ls.getHotels());
		robotClassEnter();
		
		ls.getNoOfRooms().click();
		
		robotClassDown(ls.getNoOfRooms());
		robotClassDown(ls.getNoOfRooms());
		
	robotClassEnter();
	
	ls.getCheckIn().clear();
	
	sendKeys(ls.getCheckIn(), "02/02/2022");
	
	ls.getCheckOut().clear();
	
	sendKeys(ls.getCheckOut(), "05/02/2022");
	
	ls.getAdults().click();
	
	robotClassDown(ls.getAdults());
	robotClassDown(ls.getAdults());
	
	robotClassEnter();
	
	ls.getChild().click();
	
	robotClassDown(ls.getChild());
	
	robotClassEnter();
	
	clickJs(ls.getSearch());
	
	clickJs(ls.getHotel());
	
	clickJs(ls.getNext());
	
	ls.getfName().click();
	
	sendKeys(ls.getfName(), "Udaya");
	
	ls.getlName().click();
	
	sendKeys(ls.getlName(), "kumar");
	
	ls.getAddress().click();
	
	sendKeys(ls.getAddress(), "#25,Anna Nagar,Chennai-40");
	
	ls.getCreditCard().click();
	
	sendKeys(ls.getCreditCard(), "1234567899876542");
	
	ls.getCcType().click();
	
	robotClassDown(ls.getCcType());
	
	robotClassEnter();
	
	ls.getMonth().click();
	
	robotClassDown(ls.getMonth());
	
	robotClassDown(ls.getMonth());
	
	robotClassEnter();
	
	ls.getYear().click();
	
	robotClassDown(ls.getYear());
	robotClassDown(ls.getYear());
	robotClassDown(ls.getYear());
	robotClassDown(ls.getYear());
	robotClassDown(ls.getYear());
	robotClassDown(ls.getYear());
	robotClassDown(ls.getYear());
	robotClassDown(ls.getYear());
	robotClassDown(ls.getYear());
	robotClassDown(ls.getYear());
	robotClassDown(ls.getYear());
	robotClassDown(ls.getYear());
	
	robotClassEnter();
	
	ls.getCvvNo().click();
	
	sendKeys(ls.getCvvNo(), "355");
	
	ls.getBookNow().click();
	
	ls.getLogOut().click();
	
	
	
	
	



	
	
	
	
	
	
	
	
		
	}

}
