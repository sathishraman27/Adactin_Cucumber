package com.cucum.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	
	public  WebDriver driver;
	
	@FindBy(xpath = "(//input[@class='login_input'])[1]")
	private WebElement Username;
	
	@FindBy(name = "password")
	private WebElement Password;
	
	@FindBy(name = "login")
	private WebElement Login;
	
	public Loginpage(WebDriver driver) {
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
		
				
	}

	

	public WebElement getUsername() {
		return Username;
	}

	public WebElement getPassword() {
		return Password;
	}

	public WebElement getLogin() {
		return Login;
	}
		
	}
	


