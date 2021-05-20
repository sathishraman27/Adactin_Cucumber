package com.adactin.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.adactin.helper.FileReader_Manager;
import com.cucum.baseclass.BaseClass;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src//test//java//com//adactin//feature", 
glue="com.adactin.stepdefinition",monochrome=true, dryRun = false, 
strict = true,
plugin = {"html:ProjectReport/Cucumber_Report", "pretty", "json:Report/Cucumber.json",
		"com.cucumber.listener.ExtentCucumberFormatter:Report/Sample.html"}
	
)
	
		
public class Test_Runner {
	
	public static WebDriver driver;
	
	@BeforeClass
	public static void set_Up() throws Throwable {
		
		String browser = FileReader_Manager.getinstance().getInstanceCR().getBrowser();
		driver = BaseClass.launch(browser);
//		driver.get("https://adactinhotelapp.com/");
//		Thread.sleep(4000);
	}
	
	@AfterClass
	public static void tear_Down() {
		
		driver.close();
		
	}
	
	
	}
	
	


