package org.Cucumber_Practise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Adactin_Project {

	public static WebDriver driver;

	@FindBy(name = "username")
	private WebElement userName;

	@FindBy(id = "password")
	private WebElement passWord;

	@FindBy(id = "login")
	private WebElement login;

	@FindBy(xpath = "//select[@name='location']")
	private WebElement location;

	@FindBy(xpath = "//select[@name='hotels']")
	private WebElement hotels;

	@FindBy(xpath = "//select[@name='room_type']")
	private WebElement roomType;

	@FindBy(xpath = "//select[@name='room_nos']")
	private WebElement noOfRooms;

	@FindBy(xpath = "//input[@name='datepick_in']")
	private WebElement checkIn;

	@FindBy(xpath = "//input[@name='datepick_out']")
	private WebElement checkOut;

	@FindBy(xpath = "//select[@name='adult_room']")
	private WebElement adults;

	@FindBy(xpath = "//select[@id='child_room']")
	private WebElement child;

	@FindBy(xpath = "//input[@type='submit']")
	private WebElement search;

	@FindBy(id = "radiobutton_0")
	private WebElement hotel;

	@FindBy(name = "continue")
	private WebElement next;

	@FindBy(xpath = "(//input[@type='text'])[11]")
	private WebElement fName;

	@FindBy(xpath = "(//input[@type='text'])[12]")
	private WebElement lName;

	@FindBy(name = "address")
	private WebElement address;

	@FindBy(xpath = "(//input[@type='text'])[13]")
	private WebElement creditCard;

	@FindBy(id = "cc_type")
	private WebElement ccType;

	@FindBy(id = "cc_exp_month")
	private WebElement month;

	@FindBy(id = "cc_exp_year")
	private WebElement year;

	@FindBy(id = "cc_cvv")
	private WebElement cvvNo;

	@FindBy(id = "book_now")
	private WebElement bookNow;

	@FindBy(xpath = "(//input[@type='button'])[3]")
	private WebElement logOut;

//	public Adactin_Project(WebDriver driver1) {  
	
	//// THIS IS THEPAGEFACTORY OF PREVIOUS CLASS ALWAYS CREATE NEW
//
//		this.driver = driver1;
//		PageFactory.initElements(driver, this);
//	

//	public Adactin_Project(WebDriver driver2) {
//
//	this.driver = driver2;
//	
//	PageFactory.initElements(driver2, this);
//	}

//	public Adactin_Project(WebDriver driver2) {
//		
//		this.driver = driver2;
//		
//		PageFactory.initElements(driver2, this);
//	}

//	public Adactin_Project(WebDriver driver2) {
//		
//		this.driver = driver2;
//		
//		PageFactory.initElements(driver2, this);
	
	
//	}

//	public Adactin_Project(WebDriver driver2) {
//		this.driver = driver2;
//		PageFactory.initElements(driver2, this);
//	}

	public Adactin_Project(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver2, this);
	}

	public WebElement getLogOut() {
		return logOut;
	}

	public WebElement getBookNow() {
		return bookNow;
	}

	public WebElement getCvvNo() {
		return cvvNo;
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getYear() {
		return year;
	}

	public WebElement getMonth() {
		return month;
	}

	public WebElement getCcType() {
		return ccType;
	}

	public WebElement getCreditCard() {
		return creditCard;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getlName() {
		return lName;
	}

	public WebElement getfName() {
		return fName;
	}

	public WebElement getNext() {
		return next;
	}

	public WebElement getHotel() {
		return hotel;
	}

	public WebElement getSearch() {
		return search;
	}

	public WebElement getChild() {
		return child;
	}

	public WebElement getAdults() {
		return adults;
	}

	public WebElement getCheckOut() {
		return checkOut;
	}

	public WebElement getCheckIn() {
		return checkIn;
	}

	public WebElement getNoOfRooms() {
		return noOfRooms;
	}

	public WebElement getRoomType() {
		return roomType;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getUserName() {
		return userName;
	}

	public WebElement getPassWord() {
		return passWord;
	}

	public WebElement getLogin() {
		return login;
	}

}
