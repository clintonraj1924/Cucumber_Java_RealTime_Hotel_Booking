package com.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search extends BaseClass {

	public Search() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "location")
	private WebElement txtLocation;

	@FindBy(id = "hotels")
	private WebElement txtHotels;

	@FindBy(id = "room_type")
	private WebElement txtRoomType;

	@FindBy(id = "room_nos")
	private WebElement txtRooms;

	@FindBy(id = "datepick_in")
	private WebElement txtCheckin;

	@FindBy(id = "datepick_out")
	private WebElement txtCheckout;

	@FindBy(id = "adult_room")
	private WebElement txtAdult;

	@FindBy(id = "child_room")
	private WebElement txtChild;

	@FindBy(id = "Submit")
	private WebElement btnSubmit;

	public WebElement getTxtLocation() {
		return txtLocation;
	}

	public WebElement getTxtHotels() {
		return txtHotels;
	}

	public WebElement getTxtRoomType() {
		return txtRoomType;
	}

	public WebElement getTxtRooms() {
		return txtRooms;
	}

	public WebElement getTxtCheckin() {
		return txtCheckin;
	}

	public WebElement getTxtCheckout() {
		return txtCheckout;
	}

	public WebElement getTxtAdult() {
		return txtAdult;
	}

	public WebElement getTxtChild() {
		return txtChild;
	}

	public WebElement getbtnSubmit() {
		return btnSubmit;
	}

	public void SearchHotel(String Location, String Hotels, String roomType, String numberOfRooms, String checkInDate,
			String checkOutDate, String adultsPerRoom, String childrenPerRoom) {
		type(getTxtLocation(), Location);
		type(getTxtHotels(), Hotels);
		type(getTxtRooms(), numberOfRooms);
		type(getTxtRoomType(), roomType);
		type(getTxtCheckin(), checkInDate);
		type(getTxtCheckout(), checkOutDate);
		type(getTxtAdult(), adultsPerRoom);
		type(getTxtChild(), childrenPerRoom);
		click(getbtnSubmit());
	}

}
