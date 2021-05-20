package com.adactin.helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.cucum.pom.BookHotelPage;
import com.cucum.pom.Loginpage;
import com.cucum.pom.SearchHotelPage;
import com.cucum.pom.SelectHotelPage;

public class Page_Object_Manager {
	public WebDriver driver;

	private Loginpage login;
	private SearchHotelPage search;
	private SelectHotelPage select;
	private BookHotelPage book;

	public Page_Object_Manager(WebDriver driver) {
		this.driver = driver;

		PageFactory.initElements(driver, this);

	}
	
	public  Loginpage getInstanceLogin() {
		login = new Loginpage(driver);
		return login;

	}
	
	public SearchHotelPage getInstanceSearch() {
		search = new SearchHotelPage(driver);		
		return search;
	}
	
	public SelectHotelPage getInstanceSelect() {
		select = new SelectHotelPage(driver);
		return select;
		
	}
	
	public BookHotelPage getInstanceBook() {
		book = new BookHotelPage(driver);
		return book;
	}

}
