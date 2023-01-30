package com.inetbanking.testcases;

import java.io.IOException;

import org.junit.Assert;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;
import com.inetbanking.pageObjects.LoginPage;



public class TC_LoginTest_001 extends BaseClass{

	
	@Test
	public void loginTest() throws IOException {
		
		driver.get(baseURL);
		Logger.info("login url done");
		LoginPage LP =new LoginPage(driver);
		
		LP.setUsername(uname);
		
		Logger.info("username done");
		LP.setPassword(pword);
		Logger.info("password done");

		LP.clickSubmit();
		Logger.info("Passed done");
		System.out.println(driver.getTitle());	

		if(driver.getTitle().equals("Guru99 Bank Manager HomePage123")) {
			
			
			Assert.assertTrue(true);
			
		}else {
			captureScreen(driver,"loginTest");
			Assert.assertTrue(false);
			
			Logger.info("Login test failed");

		}
		
		
			
	}
	
	
	
	
	
	
	

}
