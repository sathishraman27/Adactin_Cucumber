package com.cucum.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotelPage {
	
	public WebDriver driver;
	
	@FindBy(name="location")
	private WebElement Location;
	
	@FindBy(name="hotels")
	private WebElement Hotel;
	
	@FindBy(name="room_type")
	private WebElement Room;
	
	@FindBy(name="room_nos")
	private WebElement Nos;
	
	@FindBy(id="datepick_in")
	private WebElement Checkin;
	
	@FindBy(id="datepick_out")
	private WebElement Checkout;
	
	@FindBy(id="adult_room")
	private WebElement Adult;
	
	@FindBy(id="child_room")
	private WebElement Child;
	
	@FindBy(name="Submit")
	private WebElement Submit;
	
	public SearchHotelPage(WebDriver driver) {
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
				
	}

	public WebElement getLocation() {
		return Location;
	}

	public WebElement getHotel() {
		return Hotel;
	}

	public WebElement getRoom() {
		return Room;
	}

	public WebElement getNos() {
		return Nos;
	}

	public WebElement getCheckin() {
		return Checkin;
	}

	public WebElement getCheckout() {
		return Checkout;
	}

	public WebElement getAdult() {
		return Adult;
	}

	public WebElement getChild() {
		return Child;
	}

	public WebElement getSubmit() {
		return Submit;
	}
	
	
	
	
	
	

}
