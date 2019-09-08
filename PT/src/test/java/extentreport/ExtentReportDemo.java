package extentreport;

import java.io.IOException;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import junit.framework.Assert;

public class ExtentReportDemo 
{
	
	
	//1) Extent HTML reporter
	// 2) Extent Test
	// 3) Extent Reports
	
	
@Test	
 public void LoginTest() throws Throwable

 {
	
	ExtentHtmlReporter reporter = new ExtentHtmlReporter("./Reports/ExtentReport.html");
	
	ExtentReports extent = new ExtentReports();
	
	extent.attachReporter(reporter);
	
	//create first test using logger
	
	ExtentTest logger= extent.createTest("Login Test", "THis is the login Funcionality");
	
	logger.log(Status.INFO, "Amazon login");
	
	logger.log(Status.INFO, "Pass");
	
	logger.log(Status.WARNING, "Dont pass wrong data");
	
	//Assert.fail("Unabl to login");
	
	logger.log(Status.FAIL, "Test cases is failed");
	
	logger.addLog(MediaEntityBuilder.createScreenCaptureFromPath("C:\\Users\\jainne\\Documents\\nEERAJ\\Selenium CV\\Screenshot\\Capture.PNG"));
	//logger.addScreenCaptureFromPath("C:\\Users\\jainne\\Documents\\nEERAJ\\Selenium CV\\Screenshot\\Capture.PNG");
	//org.testng.Assert.fail("Test is failed");
	extent.flush();
	 System.out.println("Login to Amazon");
	 
	 ExtentTest logger1 = extent.createTest("Log off test","Logg off successfully");
	 
	 logger1.log(Status.PASS, "Test is passsed");
	 
	 
	 
	 
	 
	 
 }
 
}
