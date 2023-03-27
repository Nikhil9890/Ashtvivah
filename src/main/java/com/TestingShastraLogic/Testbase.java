package com.TestingShastraLogic;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.TestingShastra_utils.FileUtils;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class Testbase extends KeyWord {
	static ExtentTest test;
	static ExtentReports report;
	
	@BeforeClass
	public static void startTest()
	{
	report = new ExtentReports(System.getProperty("user.dir")+"ExtentReportResults.html");
	test = report.startTest("ExtentDemo");
	}
	
	@AfterClass
	public static void endTest()
	{
	report.endTest(test);
	report.flush();
	}
	
	@BeforeMethod
	public static void launch_Browser(){
		String env=System.getProperty("env");
		System.out.println("environment"+env);
		KeyWord.openbrowser("chrome");
		//KeyWord.launchUrl(FileUtils.getappurl(env));
	}
	
	@AfterMethod
	public static void closeBrowser() {
		KeyWord.driver.quit();
	}
	
}
