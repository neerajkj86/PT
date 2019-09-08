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

public class Irctc4 {
	
	
	
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
		
		WebDriverWait wait = new WebDriverWait(driver, 30);
		
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//iframe[@id='google_ads_iframe_/37179215/GPT_NWEB_HOME_RIGHT_BOTTOM_0']")));
		
	//	driver.switchTo().frame("//iframe[@id='google_ads_iframe_/21748009408/ATD_IRCTC/ATD_320x50_GENERAL_0']");
		
		System.out.println("Frame is reached");
		//iframe[@id='google_ads_iframe_/21748009408/ATD_IRCTC/ATD_320x50_GENERAL_0']
		
		//close disha icon
		
		Thread.sleep(5000);
		
		
	WebElement ele = driver.findElement(By.xpath("//span[contains(text(),'Ask DISHA')]"));
	
	Actions act = new Actions(driver);
	
	act.moveToElement(ele).perform();
	
	Thread.sleep(5000);
	
	driver.findElement(By.xpath("//*[@id=\"corover-close-btn\"]")).click();
		
	System.out.println("AI Chat boot is clicked");
		
		
	
	
	}
	
	@AfterMethod	
	public void teardown()
		{
			driver.close();
		}
		
		
		
		
	}


