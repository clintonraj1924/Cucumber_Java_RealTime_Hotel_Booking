package com.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Booking extends BaseClass {
	public Booking() {

		PageFactory.initElements(driver, this);
	}

	String orderId;
	
	@FindBy(id = "first_name")
	private WebElement txtFirst;

	@FindBy(id = "last_name")
	private WebElement txtLast;

	@FindBy(id = "address")
	private WebElement txtAddress;

	@FindBy(id = "cc_num")
	private WebElement txtCc;

	@FindBy(id = "cc_type")
	private WebElement txtCcType;

	@FindBy(id = "cc_exp_month")
	private WebElement txtCcexp1;

	@FindBy(id = "cc_exp_year")
	private WebElement txtCcexp2;

	@FindBy(id = "cc_cvv")
	private WebElement txtCvv;

	@FindBy(id = "book_now")
	private WebElement btnBook;

	@FindBy(id = "order_no")
	private WebElement txtOrder;

	public WebElement getTxtFirst() {
		return txtFirst;
	}

	public WebElement getTxtLast() {
		return txtLast;
	}

	public WebElement getTxtAddress() {
		return txtAddress;
	}

	public WebElement getTxtCc() {
		return txtCc;
	}

	public WebElement getTxtCcType() {
		return txtCcType;
	}

	public WebElement getTxtCcexp1() {
		return txtCcexp1;
	}

	public WebElement getTxtCcexp2() {
		return txtCcexp2;
	}

	public WebElement getTxtCvv() {
		return txtCvv;
	}

	public WebElement getBtnBook() {
		return btnBook;
	}

	public WebElement getTxtOrder() {
		return txtOrder;
	}

	public void BookingClass(String firstName, String lastName, String address, String creditCardNo,
			String creditCardType, String expiryMonth, String expiryYear, String CVVNumber) {

		type(getTxtFirst(), firstName);
		type(getTxtLast(), lastName);
		type(getTxtAddress(), address);
		type(getTxtCc(), creditCardNo);
		type(getTxtCcType(), creditCardType);
		type(getTxtCcexp1(), expiryMonth);
		type(getTxtCcexp2(), expiryYear);
		type(getTxtCvv(), CVVNumber);
		click(getBtnBook());
		attributeValue(getTxtOrder());
		
		
	    	
		 

	}

}
