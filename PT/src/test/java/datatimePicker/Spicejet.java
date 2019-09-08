package datatimePicker;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Spicejet 
{
	
	
	
	WebDriver driver;
	
	//String dateval;
	@Test
	public void BookingFligh() throws Throwable
	
	
	{
		
WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get("https://www.spicejet.com/?gclid=Cj0KCQjw-b7qBRDPARIsADVbUbVyufxsgbLzGtI0H4NOi0RaKVvoMwBVarTNq8SlLqTdgmMr10E6yNsaAvA-EALw_wcB");

		
	WebElement date=driver.findElement(By.id("ctl00_mainContent_txt_Fromdate"));
		
	String dateval = "12-08";
		
	Thread.sleep(3000);
	selectDateByJS(driver, date, dateval);
	
	Thread.sleep(5000);
	
	driver.close();
	
}
	
	
	
	
	public static void selectDateByJS(WebDriver driver ,WebElement element,String datevalue)
	{
		
	
		JavascriptExecutor js = (JavascriptExecutor)driver;


		js.executeScript("arguments[0].setAttribute('value', '" +datevalue+"')",element);
	
		
	
	}
}	
	
	
	
	
	
	
	
