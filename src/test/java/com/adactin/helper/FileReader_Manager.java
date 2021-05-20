package com.adactin.helper;


public class FileReader_Manager {
private FileReader_Manager() {
		
	}
	
	 public static FileReader_Manager getinstance() {
		 FileReader_Manager helper = new FileReader_Manager();
		return helper;
	}

	public Configuration_Reader getInstanceCR() throws Throwable {
		Configuration_Reader reader = new Configuration_Reader();
		return reader;
		
	}


	
}
