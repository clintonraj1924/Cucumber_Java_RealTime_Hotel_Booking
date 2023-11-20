package com.pojo;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;

	static Actions a;

	static JavascriptExecutor j;

	static Alert b;

	static Select v;
	// 1)Browserconfiguration
	public static void browserConfiguration() {
		WebDriverManager.chromedriver().setup();
	}

	// 2)OpenBroswer
	public static void openBroswer() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	// 3)OpenUrl
	public static void openUrl(String url) {
		driver.get(url);
		
	}

	// 4)Get Print Title
	public static void title() {
		String title = driver.getTitle();
		System.out.println(title);
	}

	// 5)CurrentUrl
	public static void currentUrl() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
	}

	// 6)Enter the Username & password
	public static void type(WebElement element, String data) {
		element.sendKeys(data);
	}

	// 7) Click the Button
	public static void click(WebElement element) {
		element.click();
	}

	// 8)Display the text
	public static void attributeValue(WebElement element) {
		String attribute = element.getAttribute("value");
		System.out.println(attribute);
	}

	// 9)Print the Heading Name
	public static void attributeText(WebElement element) {
		String text = element.getText();
		System.out.println(text);
	}

	// 10)Navigator Url page
	public static void navUrl(String url) {
		driver.navigate().to(url);
	}

	// 11)Navigator Refresh
	public static void navRef() {
		driver.navigate().refresh();
	}

	// 12)Navigator Back
	public static void navBac() {
		driver.navigate().back();
	}

	// 13)Navigator Forward
	public static void navFor() {
		driver.navigate().forward();
	}


	// 15)Double Click Action
	public static void actDoub(WebElement element) {
		a = new Actions(driver);
		a.doubleClick(element).perform();
	}

	// 16)Contextclick Action
	public static void actCont(WebElement element) {
		a = new Actions(driver);
		a.contextClick(element).perform();
	}

	// 17) Robot Keypress control and all
	public static void robCont() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_A);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_A);
	}

	// 18) Robot Keypress control and cut
	public static void robCut() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_X);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_X);
	}

	// 19) Robot Keypress control and cut
	public static void robCopy() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_C);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_C);
	}

	// 20) Robot Keypress control and paste
	public static void robPaste() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
	}

	// 21) JavaScript methods for Passing Values
	public static void javaText(WebElement name, String data) {
		j = (JavascriptExecutor) driver;
		j.executeScript("arguments[0].setAttribute('value','" + data + "')", name);
	}

	// 22) JavaScript method Click button
	public static void javaBtn(WebElement element) {
		j = (JavascriptExecutor) driver;
		j.executeScript("arguments[0].click()", element);
	}

	// 23) Javascript scrollview
	public static void javascroll(WebElement data) {
		j = (JavascriptExecutor) driver;
		j.executeScript("arguments[0].scrollIntoView(true)", data);
	}

	// 24) drag and drop
	public static void drag(WebElement src, WebElement desc) {
		a = new Actions(driver);
		a.dragAndDrop(src, desc).perform();
	}

	// 25) Alert Accept
	public static void aler() {
		b = driver.switchTo().alert();
		b.accept();
	}

	// 26) Pass the value in Alert
	public static void alervalue(String value) {
		b = driver.switchTo().alert();
		b.sendKeys(value);
		b.accept();
	}

	// 27) Dropdown Select Index
	public static void selectInd(WebElement data, int no) {
		v = new Select(data);
		v.selectByIndex(no);
	}

	// 28) Dropdown Select Value
	public static void selectVis(WebElement data, String no) {
		v = new Select(data);
		v.selectByValue(no);
	}

	// 29) Dropdown Selectby Visibletext
	public static void selectText(WebElement data, String no) {
		v = new Select(data);
		v.selectByVisibleText(no);
	}

	// 30) Move to the Element
	public static void moveTo(WebElement data) {
		a = new Actions(driver);
		a.moveToElement(data).perform();
	}

	// 31) Print the Text
	public static void allVal(WebElement datas) {
		v = new Select(datas);
		List<WebElement> allSelectedOptions = v.getAllSelectedOptions();
		for (WebElement yz : allSelectedOptions) {
			System.out.println(yz.getAttribute("value"));
		}
	}

	// 32) Print the Text for Day
	public static void textPr(WebElement dataValue) {
		v = new Select(dataValue);
		List<WebElement> options = v.getOptions();
		for (WebElement xy : options) {
			System.out.println(xy.getText());
		}
	}

	// 33) Mutliple option Select
	public static void multi() {
		boolean multiple = v.isMultiple();
		System.out.println(multiple);
	}

	// 34 Print the First Select value
	public static void first() {
		WebElement firstSel = v.getFirstSelectedOption();
		System.out.println(firstSel.getText());
	}

	// 35 Deselect the Select Index
	public static void deindex(int data) {
		v.deselectByIndex(data);
	}

	// 36 Deselect the Select value
	public static void devalu() {
		v.deselectByValue("data");

	}

	// 37 Deselect the Select Index
	public static void visible() {
		v.deselectByVisibleText("data");
	}

	// 38 Deselect all
	public static void deall() {
		v.deselectAll();
	}

}
