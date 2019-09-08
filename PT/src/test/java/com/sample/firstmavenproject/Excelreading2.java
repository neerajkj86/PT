package com.sample.firstmavenproject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Excelreading2 {

public static WebDriver driver;
	
@BeforeMethod
public void setup()
	{
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	}

@Test(dataProvider="FetchExcelLogins")	
public void logintoutest(String Username,String Password) throws Throwable
{
driver.get("https://prod-keycloak.cloud.utest.com/auth/realms/applause/protocol/openid-connect/auth/?client_id=utestv2&redirect_uri=https%3A%2F%2Fwww.utest.com%2Foauth-login%2F%3Freturn_to%3Dhttps%253A%252F%252Fwww.utest.com%252F&response_type=code");
Thread.sleep(3000);
driver.findElement(By.id("username")).sendKeys("Username");
driver.findElement(By.id("password")).sendKeys("Password");
driver.findElement(By.id("kc-login")).click();
Thread.sleep(3000);
Assert.assertTrue(driver.getTitle().contains("Test"),"User is not able to login-invalid credentials");
System.out.println("Page title Verified -user is abl to login successfully");
		
	}
@DataProvider(name = "FetchExcellogins")
public Object [][] PassdatatoTest () throws Throwable
{
	String excelPath="C:\\Users\\jainne\\eclipse-workspace\\firstmavenproject\\excel\\data.xlsx";
	
	ExcelUtils config = new ExcelUtils(excelPath, "Sheet1");
	
int rowCount = config.getRowCount();
	
	int colCount = config.getColCount();
	
	Object data[][]=new Object[rowCount-1][colCount];
	
	for (int i=1;i<rowCount;i++)
	{
		
		for (int j=0;j<colCount;j++)
		{
			String Celldata = ExcelUtils.getCellData(i, j);
			
			System.out.print(Celldata + "  ");
		}
		
		System.out.println();
	}
	return data;
	
}



@AfterMethod
public void teardown()
{
	driver.close();
}
}
