package com.inetBanking.Utilities;

/*import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Reporting2 extends TestListenerAdapter
{
	public ExtentReports extent;
	public ExtentSparkReporter spark;
	public ExtentTest test;

		public void Onstart(ITestContext txt) throws Exception
		{

			String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());//time stamp
			String repName="Test-Report-"+timeStamp+".html";
			extent = new ExtentReports();
			 spark= new ExtentSparkReporter("./test-output/"+repName);  // html file report generated
			 spark.loadXMLConfig("./extent-config.xml");
	        spark.config().setTheme(Theme.DARK);
	        spark.config().setDocumentTitle("MyReport");
	        spark.config().setReportName("Extent Report Demo");
			extent.attachReporter(spark);
			extent.setSystemInfo("host","localhost");
			extent.setSystemInfo("environment","QA");
			extent.setSystemInfo("user","veeresh");
		}
			public void onSuccess(ITestResult tr) 
			{	
			test=extent.createTest("tr.gettest").assignAuthor("veeresh").assignCategory("smoke").assignCategory("regression").assignDevice("firefox 84");// create a test node in report
		// create test node steps in report
			test.info("URL IS loaded");
			test.info("values entered");
			test.log(Status.PASS,MarkupHelper.createLabel(tr.getName(),ExtentColor.GREEN));

			}
			public void onFailure(ITestResult tr)
			{
		 test=extent.createTest("tr.getname()").assignAuthor("KL rahul").assignAuthor("dravid").assignCategory("regression").assignDevice("chrome 64");// create a test node in report
		// create test node steps in report
			test.info("URL IS loaded");
			test.info("values entered");
			test.log(Status.FAIL,MarkupHelper.createLabel(tr.getName(),ExtentColor.RED));
			}
			public void onskipped(ITestResult tr)
			{
		 test=extent.createTest("tr.getname()").assignAuthor("KL rahul").assignAuthor("dravid").assignCategory("regression").assignDevice("chrome 64");// create a test node in report
			test.info("URL IS loaded");
			test.info("values entered");
			test.log(Status.SKIP,MarkupHelper.createLabel(tr.getName(),ExtentColor.ORANGE));
			}
			public void onfinish()
			{
	        extent.flush();// unless you call this method, your report will be written with logs
		}

	}*/


