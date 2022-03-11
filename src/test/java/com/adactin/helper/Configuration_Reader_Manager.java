package com.adactin.helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class Configuration_Reader_Manager {

	public static Properties p;

	public Configuration_Reader_Manager() throws Throwable { // Give CRM as constructor
		
		
		//// In this class, I will read my file and access my methods given in the feature file

		File n = new File("src\\test\\java\\com\\adactin\\property\\login.properties");

		FileInputStream fis = new FileInputStream(n);

		p = new Properties(); // Properties is a class

		p.load(fis);

	}

	/// In order to access the property outside the method, we've declare in class
	/// level

	public String getBrowser() {

		String browser = p.getProperty("setup"); /// Give the key value here
		return browser; /// error comes since we have to access the return type, it will change it to
						/// the return type

	}

	public String getUrl() {

		String url = p.getProperty("url"); /// Give the key value here

		return url;

	}
	
	public String fname() {
		
		String fname = p.getProperty("fname");
		return fname;

	}
	
	public String lname() {

		String lname = p.getProperty("lname");
		return lname;
		
	}
	
	public String cvv() {
		String cvv = p.getProperty("cvv");
		return cvv;
		

	}
	
	
	
	

}
