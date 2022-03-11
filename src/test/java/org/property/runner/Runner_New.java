package org.property.runner;

import org.Cucumber_Practise.Baseee_Class;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.adactin.helper.File_Reader_Manager;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(features = "src\\test\\java\\com\\loginfeature\\com\\Adactin.feature" , glue = "org\\stepdefinition\\property", 

					plugin = {"pretty"}, monochrome = true)


public class Runner_New {
	
	public static WebDriver driver;
	
	
	
@BeforeClass
	
	public static void setUp() throws Throwable {
		
		String browser = File_Reader_Manager.getInstance().getCrInstance().getBrowser();
		
		driver= Baseee_Class.setUp(browser);
		
//		String url = File_Reader_Manager.getInstance().getCrInstance().getUrl();
//		driver.get(url);
//		
//		
//		String fname = File_Reader_Manager.getInstance().getCrInstance().fname();
//		System.out.println(fname);
//		
//		
//		String lname = File_Reader_Manager.getInstance().getCrInstance().lname();
//		System.out.println(lname);
//		
//		
//		String cvv = File_Reader_Manager.getInstance().getCrInstance().cvv();
//		
//		System.out.println(cvv);
		
		
		
		
		
	

		
	}
	
	@AfterClass
	
	public static void close() {
		
		driver.close();

	}
	
	
	
	
	
	
	
	

}
