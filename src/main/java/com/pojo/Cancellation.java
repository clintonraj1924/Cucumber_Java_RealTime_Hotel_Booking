package com.pojo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cancellation extends BaseClass {

	public Cancellation() {

		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//a[text( ) ='Booked Itinerary']")
	private WebElement linkBkngItnry;

	@FindBy(id = "order_id_text")
	private WebElement txtSrchOrdId;

	@FindBy(id = "search_hotel_id")
	private WebElement btnGo;

	@FindBy(xpath = "//input[@value='Cancel Selected']")
	private WebElement btnCancel;

	@FindBy(id = "check_all")
	private WebElement cbtnCheck;

	public WebElement getCbtnCheck() {
		return cbtnCheck;
	}

	public WebElement getLinkBkngItnry() {
		return linkBkngItnry;
	}

	public WebElement getTxtSrchOrdId() {
		return txtSrchOrdId;
	}

	public WebElement getBtnGo() {
		return btnGo;
	}

	public WebElement getBtnCancel() {
		return btnCancel;
	}

	public void CancelBooking() {
		WebElement txtOrder = driver.findElement(By.id("order_no"));
		String attribute = txtOrder.getAttribute("value");

		click(getLinkBkngItnry());

		type(getTxtSrchOrdId(), attribute);

		click(getBtnGo());

		click(getCbtnCheck());

		click(getBtnCancel());

		aler();

	}
}

