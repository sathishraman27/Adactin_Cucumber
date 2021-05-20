package com.cucum.baseclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {

	// browser launch

	public static WebDriver driver;

	public static WebDriver launch(String type) {

		if (type.equalsIgnoreCase("chrome")) {

			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");

		} else if (type.equalsIgnoreCase("firefox")) {

			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "//Driver//chromedriver.exe");

			return driver = new FirefoxDriver();
		}

		return driver = new ChromeDriver();

	}

//get url

	public static void openlink(String link) {

		driver.get(link);

		// maximize

		driver.manage().window().maximize();

	}

//click

	public static void clickonelement(WebElement element) {
		element.click();
	}

//send keys

	public static void inputvalues(WebElement element, String s) {
		element.sendKeys(s);
	}

	// close

	public static void close() {
		driver.close();

	}

//navigation

	public static void navigateto(String url) {
		driver.navigate().to(url);

	}

	// quit

	public static void quitall() {
		driver.quit();
	}
	
	//navigate back
	
	public static void navigateback() {
		driver.navigate().back();
	}
	
	//navigate forward
	
	public static void navigateforw() {
		driver.navigate().forward();

	}
	
	//refresh
	
	public static void refresh(String url) {
		driver.navigate().refresh();		

	}
	
	//alert
	
	public static void alerrt(WebElement element) {
		driver.switchTo().alert();
		
	}
	
	//actions
	
	public static void actions(WebElement element) {
		Actions ac = new Actions(driver);
		ac.click(element).build().perform();
		
	}
	
	//actions right click
	
	public static void righclick(WebElement element) {
		Actions ac = new Actions(driver);
		ac.contextClick(element).build().perform();

	}
	
	//mouse over
	
	public static void mouseovr(WebElement element) {
		Actions mo = new Actions(driver);
		mo.moveToElement(element).build().perform();

	}

	//select
	
	public static void select(WebElement element,String value) throws InterruptedException {
		Select s = new Select(element);
		Thread.sleep(4000);
		s.selectByValue(value);
			
		
	}
	
	public static void selectmonth(WebElement element, String s) {
		Select month = new Select(element);
		month.selectByVisibleText(s);
		
	}
	
	public static void selectyear(WebElement element) {
		Select year = new Select(element);
		year.selectByValue("1987");

	}
	
	//implicit wait
	
	public static void implicitwait() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	
	
	
}




