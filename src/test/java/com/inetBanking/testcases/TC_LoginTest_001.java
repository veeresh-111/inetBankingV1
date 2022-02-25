package com.inetBanking.testcases;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.inetBanking.pageobject.LoginPage;

public class TC_LoginTest_001 extends BaseClass
{

	@Test
	public void loginTest() throws Exception
	{
		log.info("Entered the URL of app");
		LoginPage lp=new LoginPage(driver);
		log.info("Entered the username");
		lp.setusername(username);
		log.info("Entered the password");
		lp.setpassword(password);
		lp.clicklogin();
		if(driver.getTitle().equals("Guru99 Bank Manager HomePage"))
		{
			Assert.assertTrue(true);
			log.info("Login test passed");
		}else
		{
			captureScreen(driver,"loginTest");
			Assert.assertTrue(false);
			log.info("Login test failed");
		}
		 
	}
}
