package com.inetbanking.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {

	
	Properties pro;
	
	
	public ReadConfig() {
		
		
		File src= new File("C://Users//StoicsLP-00137//git//automation//inetBankingV1//configuration//config.properties");
		
		try {
			
			
			FileInputStream fie= new FileInputStream(src);
			pro =new Properties();
			pro.load(fie);
			
			
		}catch (Exception e) {
			// TODO: handle exception
			
			System.out.println("Exception is "+e.getMessage());
		}
		
		
		
		
		
		
		
		
		
		
		
	}
	
	public String getApplicationURL()
	{
		
		
		
		String baseURL=pro.getProperty("baseURL");
		return baseURL;
	}
	
	
	public String getusername()
	{
		
		
		
		String uname=pro.getProperty("uname");
		return uname;
	}
	
	
	public String getpassword()
	{
		
		
		
		String pword=pro.getProperty("pword");
		return pword;
	}
	
	
	
	
	
}
