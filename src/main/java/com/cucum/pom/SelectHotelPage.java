package com.cucum.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotelPage {
	
	public WebDriver driver;
	
	@FindBy(name="radiobutton_0")
	private WebElement Radio_button;
	
	@FindBy(name="continue")
	private WebElement Continue;
	
	public SelectHotelPage(WebDriver driver) {
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
		
	}

	public WebElement getRadio_button() {
		return Radio_button;
	}

	public WebElement getContinue() {
		return Continue;
	}
	
	
}

