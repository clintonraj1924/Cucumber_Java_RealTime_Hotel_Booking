package com.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Select extends BaseClass {

	public Select() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "radiobutton_0")
	private WebElement btnSelect;

	@FindBy(id = "continue")
	private WebElement btnContinue;

	public WebElement getBtnSelect() {
		return btnSelect;
	}

	public WebElement getBtnContinue() {
		return btnContinue;
	}

	public void SelectClass() {
		click(getBtnSelect());
		click(getBtnContinue());
	}

}
