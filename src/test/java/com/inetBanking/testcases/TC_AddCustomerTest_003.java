package com.inetBanking.testcases;

	import java.io.IOException;

import org.openqa.selenium.Alert;
import org.testng.Assert;
	import org.testng.annotations.Test;

import com.inetBanking.pageobject.AddCustomerPage;
import com.inetBanking.pageobject.LoginPage;

	public class TC_AddCustomerTest_003 extends BaseClass
	{

		@Test
		public void addNewCustomer() throws InterruptedException, IOException
		{

			LoginPage lp=new LoginPage(driver);
			lp.setusername(username);
			log.info("user name provided");
			lp.setpassword(password);
			log.info("password provided");
			lp.clicklogin();
			
			Thread.sleep(3000);
			
			AddCustomerPage addcust=new AddCustomerPage(driver);
			
			addcust.clickAddNewCustomer();
			
			log.info("providing customer details....");
			
			
			addcust.custName("Pavan");
			addcust.custgender("male");
			addcust.custdob("10","15","1985");
			Thread.sleep(5000);
			addcust.custaddress("INDIA");
			addcust.custcity("HYD");
			addcust.custstate("AP");
			addcust.custpinno("5000074");
			addcust.custtelephoneno("987890091");
			
			String email=randomestring()+"@gmail.com";
			addcust.custemailid(email);
			addcust.custpassword("abcdef");
			addcust.custsubmit();
			
			Thread.sleep(3000);
			
			log.info("validation started....");
			
			boolean res=driver.getPageSource().contains("Customer Registered Successfully!!!");
			
			if(res==true)
			{
				Assert.assertTrue(true);
				log.info("test case passed....");
				
			}
			else
			{
				log.info("test case failed....");
				captureScreen(driver,"addNewCustomer");
				Assert.assertTrue(false);
			}
				
		}
		
		
	}

