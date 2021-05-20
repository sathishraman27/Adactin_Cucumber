package com.adactin.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.adactin.helper.FileReader_Manager;
import com.adactin.helper.Page_Object_Manager;
import com.adactin.runner.Test_Runner;
import com.cucum.baseclass.BaseClass;
import com.cucum.pom.BookHotelPage;
import com.cucum.pom.Loginpage;
import com.cucum.pom.SearchHotelPage;
import com.cucum.pom.SelectHotelPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step_Definition extends BaseClass {
	
	public static WebDriver driver = Test_Runner.driver;	
//	public static Loginpage login = new Loginpage(driver);	
//	public static SearchHotelPage search = new SearchHotelPage(driver);	
//	public static SelectHotelPage Select = new SelectHotelPage(driver);
//	public static BookHotelPage hotel = new BookHotelPage(driver);	
	public static Page_Object_Manager pom = new Page_Object_Manager(driver);
	
	
	@Given("^user Launch The Application$")
	public void user_Launch_The_Application() throws Throwable {
		
		String url = FileReader_Manager.getinstance().getInstanceCR().openurl();
		openlink(url);
	    
	}

	@When("^user Enter The \"([^\"]*)\" In Username Field$")
	public void user_Enter_The_In_Username_Field(String username) throws Throwable {
		
		inputvalues(pom.getInstanceLogin().getUsername(), username);
	}

	@When("^user Enter The \"([^\"]*)\" In Password Field$")
	public void user_Enter_The_In_Password_Field(String password) throws Throwable {
		
		inputvalues(pom.getInstanceLogin().getPassword(), password);
	    
	}

	@Then("^user Click On The Login Button And It Navigates To Search Hotel Page$")
	public void user_Click_On_The_Login_Button_And_It_Navigates_To_Search_Hotel_Page() throws Throwable {
	    
		clickonelement(pom.getInstanceLogin().getLogin());
	}
	
	@When("^Select location In Location Field$")
	public void select_location_In_Location_Field() throws Throwable {
	    
		select(pom.getInstanceSearch().getLocation(), "Los Angeles");
		
	}
	
	@Given("^Select the Hotel In Hotels Field$")
	public void select_the_Hotel_In_Hotels_Field() throws Throwable {
		
		select(pom.getInstanceSearch().getHotel(), "Hotel Hervey");		
	   
	}

	@Given("^Select the Room In Room Type Field$")
	public void select_the_Room_In_Room_Type_Field() throws Throwable {
		
		select(pom.getInstanceSearch().getRoom(), "Deluxe");
	    
	}

	@Given("^Select the Number of rooms In Number Of Rooms Field$")
	public void select_the_Number_of_rooms_In_Number_Of_Rooms_Field() throws Throwable {
	    
		select(pom.getInstanceSearch().getNos(), "2");
		
	}

	@Given("^Select the Check in Date In Check In Date Field$")
	public void select_the_Check_in_Date_In_Check_In_Date_Field() throws Throwable {
	    
		inputvalues(pom.getInstanceSearch().getCheckin(), "14/05/2021");
		
	}

	@Given("^Select the Check out Date In Check out Date Field$")
	public void select_the_Check_out_Date_In_Check_out_Date_Field() throws Throwable {
	   
		inputvalues(pom.getInstanceSearch().getCheckout(), "15/05/2021");
	}

	@Given("^Select the Adults Room In Adults Per Room Field$")
	public void select_the_Adults_Room_In_Adults_Per_Room_Field() throws Throwable {
	    
		select(pom.getInstanceSearch().getAdult(), "2");
		
	}

	@Given("^Select the Children Room In Children Per Room Field$")
	public void select_the_Children_Room_In_Children_Per_Room_Field() throws Throwable {
	  
		select(pom.getInstanceSearch().getChild(), "2");
	}

	@Then("^User Click on Search Button In Search Field$")
	public void user_Click_on_Search_Button_In_Search_Field() throws Throwable {
	    
		clickonelement(pom.getInstanceSearch().getSubmit());
	}

	@When("^Click on the Radio Button$")
	public void click_on_the_Radio_Button() throws Throwable {
		
		clickonelement(pom.getInstanceSelect().getRadio_button());
	   
	}

	@Then("^User Click on the Continue$")
	public void user_Click_on_the_Continue() throws Throwable {
		
		clickonelement(pom.getInstanceSelect().getContinue());
		    
	}
	
	@When("^Enter the First name in First name field$")
	public void enter_the_First_name_in_First_name_field() throws Throwable {
	    
		inputvalues(pom.getInstanceBook().getFirst_name(), "Sathish");
	}

	@When("^Enter the Last name in Last name field$")
	public void enter_the_Last_name_in_Last_name_field() throws Throwable {
		
		inputvalues(pom.getInstanceBook().getLast_name(), "Raman");
	    
	}

	@When("^Enter the Address in the Address field$")
	public void enter_the_Address_in_the_Address_field() throws Throwable {
		
		inputvalues(pom.getInstanceBook().getAddress(), "18 Railroad, Los Angels");
	    
	}

	@When("^Enter the Card number in Card number field$")
	public void enter_the_Card_number_in_Card_number_field() throws Throwable {
		
		inputvalues(pom.getInstanceBook().getCard_Num(), "585658");
	    
	}

	@When("^Select the Card Type in the Card type field$")
	public void select_the_Card_Type_in_the_Card_type_field() throws Throwable {
		
		select(pom.getInstanceBook().getCard_Type(), "VISA");
	    
	}

	@When("^Select the Expiry date and Expiry year$")
	public void select_the_Expiry_date_and_Expiry_year() throws Throwable {
		
		select(pom.getInstanceBook().getExp_month(), "2");
		select(pom.getInstanceBook().getExp_year(), "2022");
	    
	}

	@When("^Enter the CVV number in the CVV field$")
	public void enter_the_CVV_number_in_the_CVV_field() throws Throwable {
		
		inputvalues(pom.getInstanceBook().getCVV(), "456");
	    
	}
	
}
