package com.adactin.helper;

public class File_Reader_Manager {

	public File_Reader_Manager() {
		
		// pvt empty constructor is create for not creating the object of FRM anywhere else 
		
	}

	//static method -  We create object for FRM 
	
	public static File_Reader_Manager getInstance() {

		File_Reader_Manager m = new File_Reader_Manager();

		return m;

	}
	
	//Non-static method - we create object for CRM

	public Configuration_Reader_Manager getCrInstance() throws Throwable {

		Configuration_Reader_Manager reader = new Configuration_Reader_Manager();

		return reader;

	}
	
	
	
	
	
	

}
