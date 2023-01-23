package com.inetbanking.testcases;

import org.junit.Assert;
import org.testng.annotations.Test;

import com.inetbanking.pageObjects.LoginPage;



public class TC_LoginTest_001 extends BaseClass{

	
	@Test
	public void loginTest() {
		
		driver.get(baseURL);
		
		LoginPage LP =new LoginPage(driver);
		
		LP.setUsername(uname);
		
		Logger.info("username done");
		LP.setPassword(pword);
		Logger.info("password done");

		LP.clickSubmit();
		Logger.info("Passed done");
		System.out.println(driver.getTitle());	

		if(driver.getTitle().equals("Guru99 Bank Manager HomePage")) {
			
			
			Assert.assertTrue(true);
			
		}else {
			
			Assert.assertTrue(false);
		}
		
			
	}
	
	
	
	
	
	
	

}
