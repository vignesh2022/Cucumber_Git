package org.stepdefinition.property;

import static org.junit.Assert.assertTrue;

import java.awt.AWTException;

import org.Cucumber_Practise.Adactin_Project;
import org.Cucumber_Practise.Baseee_Class;
import org.openqa.selenium.WebDriver;
import org.property.runner.Runner_New;

import com.adactin.helper.File_Reader_Manager;

import io.cucumber.java.en.*;

public class Step_Daefinition_Property extends Baseee_Class {

	public static WebDriver driver = Runner_New.driver;

	Adactin_Project b = new Adactin_Project(driver);

	@Given("The User launched the Application")
	public void the_user_launched_the_application() throws Throwable {
		
//	urlMax(File_Reader_Manager.getInstance().getCrInstance().getUrl());

		urlMax("https://adactinhotelapp.com/");
		System.out.println("browser is launched");

	}

	@When("The user enter the user name and password")
	public void the_user_enter_the_user_name_and_password() {

		sendKeys(b.getUserName(), "UdayKarthik");
		sendKeys(b.getPassWord(), "udaya@123");

		System.out.println("user entered login credentials");

	}

	@When("User click the login button")
	public void user_click_the_login_button() {

		clickJs(b.getLogin());

		System.out.println("login is over");

	}

	@Then("The user Validate the Login is sucessful")
	public void the_user_validate_the_login_is_sucessful() {

		assertTrue(driver.getCurrentUrl().endsWith("com/SearchHotel.php"));

		System.out.println("success");

	}

	///////// 2nd page //////////////////
	
	
	@When("user will select the location")
	public void user_will_select_the_location() throws Throwable {
		
		Thread.sleep(3000);

		b.getLocation().click();
		
		Thread.sleep(3000);
		
		

	}



	@When("User will select the hotels")
	public void user_will_select_the_hotels() throws AWTException, Throwable {
		
		Thread.sleep(3000);
		
		b.getHotels().click();
		
		Thread.sleep(5000);

		robotClassDown(b.getHotels());
		robotClassEnter();

	}

	@When("user will select the room type")
	public void user_will_select_the_room_type() throws AWTException {

		b.getRoomType().click();

		robotClassDown(b.getHotels());
		robotClassDown(b.getHotels());
		robotClassDown(b.getHotels());
		robotClassDown(b.getHotels());
		robotClassEnter();

	}

	@When("user will select the no of rooms needed")
	public void user_will_select_the_no_of_rooms_needed() throws AWTException {
		
		b.getNoOfRooms().click();

		robotClassDown(b.getNoOfRooms());
		robotClassDown(b.getNoOfRooms());

		robotClassEnter();

	}

	@When("user will give the check in date")
	public void user_will_give_the_check_in_date() {

		b.getCheckIn().clear();
		sendKeys(b.getCheckIn(), "18/02/2022");

	}

	@When("user will give the check out date")
	public void user_will_give_the_check_out_date() {

		b.getCheckOut().clear();
		sendKeys(b.getCheckOut(), "22/02/2022");

	}

	@When("user will sepcify the no of adults accompanying")
	public void user_will_sepcify_the_no_of_adults_accompanying() throws AWTException {

		b.getAdults().click();
		robotClassDown(b.getAdults());
		robotClassDown(b.getAdults());

		robotClassEnter();

	}

	@When("user will provide the children coming with them")
	public void user_will_provide_the_children_coming_with_them() throws AWTException {

		b.getChild().click();
		robotClassDown(b.getChild());

		robotClassEnter();

	}

	@Then("user will verify the details given and go for booking")
	public void user_will_verify_the_details_given_and_go_for_booking() {

		clickJs(b.getSearch());

		System.out.println("User preference is given");

	}

	///////////////// 3rd page //////////////////

	@When("user will select the radio button")
	public void user_will_select_the_radio_button() {

		clickJs(b.getHotel());

	}

	@When("user will continue for the booking")
	public void user_will_continue_for_the_booking() {

		clickJs(b.getNext());

	}

	@Then("user will validate the information provided and proceed")
	public void user_will_validate_the_information_provided_and_proceed() {

		System.out.println("User will proceed for booking");

	}

	@When("user will give the firstname")
	public void user_will_give_the_firstname() throws Throwable {

		b.getfName().click();
		
	sendKeys(b.getfName(), File_Reader_Manager.getInstance().getCrInstance().fname());

//		sendKeys(b.getfName(), "Udaya");

	}

	@When("User will give the lastname")
	public void user_will_give_the_lastname() throws Throwable {

		b.getlName().click();

//		sendKeys(b.getlName(), "kumar");
		
		sendKeys(b.getlName(),File_Reader_Manager.getInstance().getCrInstance().lname());

	}

	@When("User will give the address")
	public void user_will_give_the_address() {

		b.getAddress().click();

		sendKeys(b.getAddress(), "#25,Anna Nagar,Chennai-40");

	}

	@When("User will give the credit card details")
	public void user_will_give_the_credit_card_details() {

		b.getCreditCard().click();
		sendKeys(b.getCreditCard(), "1234567899876542");

	}

	@When("User will mention the card type")
	public void user_will_mention_the_card_type() throws AWTException {

		b.getCcType().click();

		robotClassDown(b.getCcType());

		robotClassEnter();

	}

	@When("User will give the expiry month for the card")
	public void user_will_give_the_expiry_month_for_the_card() throws AWTException {

		b.getMonth().click();

		robotClassDown(b.getMonth());
		robotClassDown(b.getMonth());

		robotClassEnter();

	}

	@When("User will provide the expiry year for the card")
	public void user_will_provide_the_expiry_year_for_the_card() throws AWTException {
		
		b.getYear().click();
		
		robotClassDown(b.getYear());
robotClassDown(b.getYear());
robotClassDown(b.getYear());
robotClassDown(b.getYear());
robotClassDown(b.getYear());
robotClassDown(b.getYear());
robotClassDown(b.getYear());
robotClassDown(b.getYear());
robotClassDown(b.getYear());
robotClassDown(b.getYear());
robotClassDown(b.getYear());
robotClassDown(b.getYear());

		robotClassEnter();

	}

	@When("User will give the cvv no for the card")
	public void user_will_give_the_cvv_no_for_the_card() throws Throwable {
		
		sendKeys(b.getCvvNo(), File_Reader_Manager.getInstance().getCrInstance().cvv());
		
		

	}

	@Then("User will validate the details and book the hotel")
	public void user_will_validate_the_details_and_book_the_hotel() {

	}

}
