package datatimePicker;

import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Irctc5 {
	
	
	
	WebDriver driver;
	
	@Test
	public void getDetails() throws Throwable
	{
		
		
WebDriverManager.chromedriver().setup();
		

      ChromeOptions ops = new ChromeOptions();
      
      ops.addArguments("disable-notifications");
		
      driver = new ChromeDriver(ops);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://www.irctc.co.in/nget/train-search");
		

		
		driver.findElement(By.xpath("//*[@id=\"origin\"]/span/input")).sendKeys("GURGAON - GGN");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"destination\"]/span/input")).sendKeys("JAIPUR - JP");
		
		
		
		
//		WebElement ele= driver.findElement(By.xpath("//span[contains(text(),'Ask DISHA')]"));
//		
//		act.moveToElement(ele).perform();
		
		Thread.sleep(10000);
		
	//	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"corover-close-btn\"]")));
		
		
		driver.findElement(By.xpath("//*[@id='corover-close-btn']")).click();
		
		Thread.sleep(10000);
		
		
		
		
		
	        
		
	System.out.println("AI Chat boot is clicked");
		
		
	
	
	}
	
	@AfterMethod	
	public void teardown()
		{
			driver.close();
		}
		
		
		
		
	}


