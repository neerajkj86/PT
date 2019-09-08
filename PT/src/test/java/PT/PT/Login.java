package PT.PT;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {

public static WebDriver driver ;

@BeforeSuite
public static void setupClass() {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();		
    
}
	


@Test(priority=1 , description = "Login into PTA Application")	
public void launchApplication() throws IOException, InterruptedException
{
	
	 driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
	 
	 driver.manage().window().maximize();
	 
	 Thread.sleep(3000);
	 
	//driver.get("http://pt-techprocess-app-tst001.dxc-londonmarket.com");
	 
		 
	driver.get("https://lmpropuser:%pA7eKo966xkPkBE!YbNF8@pt-techprocess-app-tst001.dxc-londonmarket.com");	 
	
	
	
	//Runtime.getRuntime().exec("Libraries\\Documents\\Authentication.exe");
	
	
   	
}

@Test (priority=2, description = " click on Contract Capture")	
public void contractcapture()
{
	
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	 driver.findElement(By.linkText("Contract Capture")).click();
	
}

@Test (priority=3,description = "Submission details")	
public void submissiondetails() throws Throwable
{
	
	 driver.findElement(By.xpath("//input[@id='treaty-number']")).sendKeys("1234");
	 
	 Thread.sleep(5000);
	 
	 //driver.findElement(By.xpath("//input[@id='umr']")).sendKeys("B0941ABCD001");
	
	 //Thread.sleep(5000);
	 
        driver.findElement(By.xpath("//button[@class='button']")).click();
        
        
	Thread.sleep(5000);
	
	//String actualTitle=driver.getTitle();
	
	String Actual_error = driver.findElement(By.xpath("//p[@class='form-element__error']")).getText();
	
	String Expected_error = "Please enter UMR";
	
	assertEquals(Actual_error, Expected_error);
	
	
	
}

@AfterSuite
public void quit()
{
	  driver.quit();
	  
}


	
}
