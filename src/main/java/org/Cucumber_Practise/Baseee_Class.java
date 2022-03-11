package org.Cucumber_Practise;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;



public class Baseee_Class {

	public static WebDriver driver;

	/////////// ###################### BROWSER SETUP ######################
	/////////// //////////////////////////

	public static WebDriver setUp(String browser) {
		
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\HP\\\\eclipse-workspace\\\\Cucumber\\\\Driver\\\\chromedriver.exe");
			driver = new ChromeDriver();
			
			
		}
		
		else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\HP\\eclipse-workspace\\Cucumber\\Driver\\geckodriver.exe");
			driver = new FirefoxDriver();
			
		}
		
		else {
			System.out.println("browser is not launched");
		}
		return driver;
		
		
//		System.setProperty("webdriver.chrome.driver",
//				"C:\\Users\\HP\\eclipse-workspace\\Cucumber\\Driver\\chromedriver.exe");
//
//		return driver = new ChromeDriver();

	}

///////////  ######################  GET URL   ###################### //////////////////////////

	public static WebDriver urlMax(String Url) {

		driver.get(Url);
		driver.manage().window().maximize();
		return driver;

	}

///////////  ######################  GET CURRENT URL   ###################### //////////////////////////

	public static String urlCurrent() {

		String currentUrl = driver.getCurrentUrl();

		return currentUrl;

	}

///////////  ######################  GET TITLE   ###################### //////////////////////////

	public static String getTitle() {

		String title = driver.getTitle();

		return title;

	}

///////////  ######################  GET TEXT   ###################### //////////////////////////

	public static String getText(WebElement element) {
		String text = element.getText();
		return text;

	}

///////////  ######################  GET ATTRIBUTE   ###################### //////////////////////////

	public static String getAttribute(WebElement element) {

		String attribute = element.getAttribute("value");

		return attribute;

	}

///////////  ######################  CLOSE   ###################### //////////////////////////

	public static void close() {
		driver.close();

	}

///////////  ######################  QUIT   ###################### //////////////////////////

	public static void quit() {

		driver.quit();

///////////  ######################  NAVIGATE TO   ###################### //////////////////////////

	}

	public static void navigateTo(String url) {

		driver.navigate().to(url);
	}

///////////  ######################  NAVIGATE BACK   ###################### //////////////////////////

	public static void navigateBack() {

		driver.navigate().back();

	}

///////////  ######################  NAVIGATE FORWARD   ###################### //////////////////////////

	public static void navigateForward() {

		driver.navigate().forward();

	}

///////////  ######################  NAVIGATE REFRESH  ###################### //////////////////////////

	public static void refresh() {

		driver.navigate().refresh();

	}

///////////  ######################  LOCATORS  ###################### //////////////////////////

	//// ???????????? HOW TO ACCESS All the locators simultaneously ????????????

	public static WebElement locatorByName(String name) {

		WebElement nam = driver.findElement(By.name(name));

		return nam;

	}

	public static WebElement locatorByClass(String classname) {

		WebElement cname = driver.findElement(By.className(classname));

		return cname;

	}

	public static WebElement locatorById(String Id) {

		WebElement id = driver.findElement(By.id(Id));

		return id;

	}

	public static WebElement locatorByXpath(String xpath) {

		WebElement path = driver.findElement(By.xpath(xpath));

		return path;

	}

	public static WebElement locatorByLinked_Text(String linktext) {

		WebElement ltext = driver.findElement(By.linkText(linktext));

		return ltext;

	}

	public static WebElement locatorByPartial_LinkText(String partiallinktext) {

		WebElement parltext = driver.findElement(By.partialLinkText(partiallinktext));

		return parltext;

	}



///////////  ######################  click  ###################### //////////////////////////

	/// How to create Click as a method

	public static WebElement Click(WebElement element) {

		return element;

	}



///////////  ######################  ALERT  ###################### //////////////////////////

	public static void alertOk() {

		Alert ok = driver.switchTo().alert();

		ok.accept();

	}

	public static void dismiss() {

		Alert cancel = driver.switchTo().alert();

		cancel.dismiss();

	}

	public static void alertWithPrompt(String value) {

		Alert skey = driver.switchTo().alert();
		skey.sendKeys(value);

	}

///////////  ######################  JAVASCRIPT EXECUTOR  ###################### //////////////////////////

	/// INSERT SENDKEYS

	public static void insertJs(WebElement element, String data) {

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].setAttribute('value','data');", element);

	}

	/// Get Text

	public static void getTextJs(WebElement element) {

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("return arguments[0].getAttribute('value')", element);

	}

	// Click

	public static void clickJs(WebElement element) {

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].click()", element);

	}

	// ScrollDown

	public static void scrollDown(WebElement element) {

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].scrollIntoView(true);", element);

	}

	// ScrollUp

	public static void scrollUp(WebElement element) {

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].scrollIntoView(false);", element);

	}

	/// PIXELSCROLL

	public static void pixelScroll(WebElement element) {

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("window.scrollBy(0,-3000)", element);

	}

///////////  ######################  ACTIONS  ###################### //////////////////////////

	// MOUSEHOVER

	public static void mouseHover(WebElement element) {

		Actions ac = new Actions(driver);

		ac.moveToElement(element).perform();

	}

	// Rt.CLICK

	public static void rtClick(WebElement element) {

		Actions ac = new Actions(driver);

		ac.contextClick(element).perform();

	}

///////////  ######################  ROBOTCLASS  ###################### //////////////////////////

	// VK_UP

	public static void robotClassDown(WebElement element) throws AWTException {

		Robot r = new Robot();

		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);

	}

	// VK_DOWN

	public static void robotClassUp() throws AWTException {

		Robot r = new Robot();

		r.keyPress(KeyEvent.VK_UP);
		r.keyRelease(KeyEvent.VK_UP);

	}

	// VK_ENTER

	public static void robotClassEnter() throws AWTException {

		Robot r = new Robot();

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

	}

///////////  ######################  SELECT  ###################### //////////////////////////

	// DROPDOWN BY INDEX

	public static void dropDownIndex(WebElement dropdown) {

		Select s = new Select(dropdown);

		s.selectByIndex(0);

	}

	//// DROPDOWN BY VALUE

	public static void dropDownValue(WebElement value) {
		Select s = new Select(value);

		s.selectByValue(getTitle());

	}

	// DROPDOWN BY INDEX

	public static void dropDownVisibility(WebElement visibile) {

		Select s = new Select(visibile);

		s.selectByVisibleText(getTitle());

	}

///////////  ######################  FRAMES  ###################### //////////////////////////

	//// SINGLE FRAME

	public static void singleFrame() {

		WebDriver frame = driver.switchTo().frame("singleframe");

	}

///////////  ######################  WAITS  ###################### //////////////////////////

	// IMPLICIT

	public static void implicit() {

		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);

	}

	// EXPLICIT

	public static void explicit(WebElement element) {

		WebDriverWait wait = new WebDriverWait(driver, 30);

		wait.until(ExpectedConditions.visibilityOf(element));

	}

	////// SUBMIT

	public static void submit(WebElement element) {

		element.submit();

	}

	public static void defaultContent() {

		WebDriver defaultContent = driver.switchTo().defaultContent();

	}

	public static void multiFrameSwitch(WebElement element) {

		WebDriver multiframesw = driver.switchTo().frame(element);

	}

	public static void screenShot() throws IOException {

		TakesScreenshot n = (TakesScreenshot) driver;

		File screenshotAs = n.getScreenshotAs(OutputType.FILE);

		File v = new File("C:\\Users\\HP\\eclipse-workspace\\Selenium_Project\\Snippets\\frames.png");

		FileUtils.copyFile(screenshotAs, v);
		

	}
	
	
///////////  ######################  SENDKEYS  ###################### //////////////////////////

///
public static void sendKeys(WebElement element, String data) {

	element.sendKeys(data);

}

	
	

}
