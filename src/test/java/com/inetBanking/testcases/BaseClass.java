package com.inetBanking.testcases;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.inetBanking.Utilities.ReadConfig;

public class BaseClass {
ReadConfig rc=new ReadConfig();
	public String baseurl=rc.geturl();
	public String username=rc.getusername();
	public String password=rc.getpassword();
	public static WebDriver driver;
	public static Logger log;
	@Parameters("browser")
	@BeforeClass
	public void setup(String br)
	{
		log=Logger.getLogger("ebanking");
		PropertyConfigurator.configure("log4j.properties");
		if(br.equals("chrome"))
		{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		driver=new ChromeDriver();
		}else if(br.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
			driver=new FirefoxDriver();
		}
		else if(br.equals("ie"))
		{
			System.setProperty("webdriver.ie.driver","./driver/IEDriverServer.exe");
			driver=new InternetExplorerDriver();
		}
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get(baseurl);
	}
	@AfterClass
	public void teardown()
	{
		driver.quit();
	}

	public void captureScreen(WebDriver driver,String tcname) throws IOException
	{
	String photo="./screenshot/";
	Date d=new Date();
	String d1=d.toString();
	String date=d1.replaceAll(":","-");
	TakesScreenshot ts=(TakesScreenshot)driver;
	File src=ts.getScreenshotAs(OutputType.FILE);
	File dst=new File(photo+date+tcname+".jpeg");
	FileUtils.copyFile(src,dst);
}

	public String randomestring()
	{
		String generatedstring=RandomStringUtils.randomAlphabetic(8);
		return(generatedstring);
	}
	
	public static String randomeNum() {
		String generatedString2 = RandomStringUtils.randomNumeric(4);
		return (generatedString2);
}
}
