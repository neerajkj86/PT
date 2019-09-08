package datatimePicker;

import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.swing.text.Document;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class RedBus {

	WebDriver driver;
	
	@Test
	public void BookingABus() throws Throwable
	
	
	{
		
WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get("https://www.redbus.in/bus-tickets/");

		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("window.scrollBy(0,200)");
		
		//long start_time =System.currentTimeMillis();
		
		driver.findElement(By.xpath("//input[@id='txtSource']")).sendKeys("New Delhi");
		
		driver.findElement(By.xpath("//input[@id='txtDestination']")).sendKeys("Jaipur");
		

		driver.findElement(By.xpath("//input[@id='txtOnwardCalendar']")).click();
		
		//driver.navigate().refresh();
		
		Thread.sleep(3000);
		
	driver.findElement(By.xpath("//input[@id='txtSource']/following::div[6]/div[@id='rb-calendar']/div/following::div[1]/child::div[3]/child::ul[2]/li[17]/span")).click();
	
	driver.findElement(By.xpath("//button[contains(text(),'Search Buses')]")).click();
		Thread.sleep(5000);

	driver.close();	
		
		
}

}