package com.inetbanking.testcases;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.inetbanking.utilities.ReadConfig;

public class BaseClass {
	
	
	ReadConfig readconfig=new ReadConfig();
	
	public String baseURL= readconfig.getApplicationURL();
	
	public String uname= readconfig.getusername();
	public String pword= readconfig.getpassword();
	
	
	public static Logger Logger;


	
	public static WebDriver driver;
	
	@Parameters("browser")
	@SuppressWarnings("static-access")
	@BeforeClass
	public void setup(String br) {
		
		
		

Logger = Logger.getLogger("ebanking");
PropertyConfigurator.configure("log4j.properties");

if (br.equals("chrome")) {
	
	System.setProperty("webdriver.chrome.driver","C://Users//StoicsLP-00137//git//automation//inetBankingV1//Drivers//chromedriver.exe");
	driver= new ChromeDriver();
}
else if (br.equals("edge")) {
	
	System.setProperty("webdriver.chrome.driver","C://Users//StoicsLP-00137//git//automation//inetBankingV1//Drivers//msedgedriver.exe");
	driver= new EdgeDriver();
	
}
		
		
	}

	
	
	@AfterClass
	public void teardown() {
		
		
		driver.quit();
		
	}
	
	public void captureScreen(WebDriver driver, String tname) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);

		
		File target = new File("C://Users//StoicsLP-00137//git//automation//inetBankingV1" + "/Screenshots/" + tname + ".png");
		FileUtils.copyFile(source, target);
		System.out.println("Screenshot taken");
	}
}
