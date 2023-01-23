package com.inetbanking.testcases;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	
	public String uname="mngr473148";
	public String pword="ysAvuqu";
	public String baseURL="https://demo.guru99.com/v4/";
	public static Logger Logger;


	
	public static WebDriver driver;
	
	
	@BeforeClass
	public void setup() {
		
		System.setProperty("webdriver.chrome.driver","C://Users//StoicsLP-00137//git//automation//inetBankingV1//Drivers//chromedriver.exe");
		driver= new ChromeDriver();
		

Logger = Logger.getLogger("ebanking");
PropertyConfigurator.configure("log4j.properties");



		
		
	}

	
	
	@AfterClass
	public void teardown() {
		
		
		driver.quit();
		
	}
}
