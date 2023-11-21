package com.step;

import java.util.concurrent.TimeUnit;

import com.pojo.BaseClass;
import com.pojo.Booking;
import com.pojo.Cancellation;
import com.pojo.Login;
import com.pojo.Search;
import com.pojo.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition extends BaseClass {
	
	@Given("User is on the Adactin page")
	public void user_is_on_the_Adactin_page() {
		browserConfiguration();
		openBroswer();
		openUrl("https://adactinhotelapp.com/index.php");
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		
	}

	@When("User should login with {string},{string}")
	public void user_should_login_with(String UserName, String Password) {
		Login login = new Login();
		login.LoginPage(UserName, Password);

	}

	@When("User enters {string},{string},{string},{string},{string},{string},{string},{string} and click Search")
	public void user_enters_and_click_Search(String Location, String Hotels, String roomType, String numberOfRooms,
			String checkInDate, String checkOutDate, String adultsPerRoom, String childrenPerRoom) {

		Search search = new Search();
		search.SearchHotel(Location, Hotels, roomType, numberOfRooms, checkInDate, checkOutDate, adultsPerRoom,
				childrenPerRoom);

	}

	@When("User select Hotel and click continue")
	public void user_select_Hotel_and_click_continue() {
		Select select = new Select();
		select.SelectClass();
	}

	@When("User enters {string},{string},{string},{string},{string},{string},{string},{string} and clicks booknow")
	public void user_enters_and_clicks_booknow(String firstName, String lastName, String address, String creditCardNo,
			String creditCardType, String expiryMonth, String expiryYear, String CVVNumber) {
		
		Booking booking = new Booking();
		booking.BookingClass(firstName, lastName, address, creditCardNo, creditCardType, expiryMonth, expiryYear, CVVNumber);
	}


	@When("User clicks Booking Itenary and cancels booking")
	public void user_clicks_Booking_Itenary_and_cancels_booking() {
		Cancellation cancel = new Cancellation();
		cancel.CancelBooking();
	}

	@Then("User gets {string} message")
	public void user_gets_message(String string) {
	}

}
