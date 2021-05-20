package com.cucum.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookHotelPage {
	
	public WebDriver driver;
	
	@FindBy(name="first_name")
	private WebElement First_name;
	
	@FindBy(name="last_name")
	private WebElement Last_name;
	
	@FindBy(name="address")
	private WebElement Address;
	
	@FindBy(name="cc_num")
	private WebElement Card_Num;
	
	@FindBy(name="cc_type")
	private WebElement Card_Type;
	
	@FindBy(name="cc_exp_month")
	private WebElement Exp_month;
	
	@FindBy(name="cc_exp_year")
	private WebElement Exp_year;
	
	@FindBy(name="cc_cvv")
	private WebElement CVV;
	
	public BookHotelPage(WebDriver driver) {
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
	}

	public WebElement getFirst_name() {
		return First_name;
	}

	public WebElement getLast_name() {
		return Last_name;
	}

	public WebElement getAddress() {
		return Address;
	}

	public WebElement getCard_Num() {
		return Card_Num;
	}

	public WebElement getCard_Type() {
		return Card_Type;
	}

	public WebElement getExp_month() {
		return Exp_month;
	}

	public WebElement getExp_year() {
		return Exp_year;
	}

	public WebElement getCVV() {
		return CVV;
	}

	
	
}
