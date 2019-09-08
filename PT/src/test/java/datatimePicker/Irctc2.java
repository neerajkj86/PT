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
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Irctc2 {
	
	
	
	WebDriver driver;
	
	@Test
	public void getDetails() throws Throwable
	{
		
		
WebDriverManager.chromedriver().setup();
		

      ChromeOptions ops = new ChromeOptions();
      
      ops.addArguments("disable-notifications");
		
      driver = new ChromeDriver(ops);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get("https://www.irctc.co.in/nget/train-search");
		
//		HashMap<String, String> hm = new HashMap<String, String>();
//
//		hm.put("GGN", "GURGAON");
//		
//		hm.put("JP", "JAIPUR");
//		
//		String From_Station = hm.get("JP");
//		
//		String To_Station = hm.get("GGN");
		
		
		driver.findElement(By.xpath("//*[@id=\"origin\"]/span/input")).sendKeys("GURGAON - GGN");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"destination\"]/span/input")).sendKeys("JAIPUR - JP");
		
		Thread.sleep(3000);
		
		
		WebElement Datetime=driver.findElement(By.xpath("//*[@id='divMain']/div/app-main-page/div[2]/div/div[1]/div/div/div[1]/div/app-jp-input/div[3]/form/div[3]/p-calendar/span/button/span[2]"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].click();", Datetime);
		
		Thread.sleep(3000);
		
		//close disha icon
		
//		List <WebElement> element= driver.findElements(By.xpath("//*[@id='corover-close-bth']"));
//		
//
//		
//		if (element.size()>0)
//		{
//			
//			element.get(0).click();
//			
//			
//			System.out.println("Closing chat bot");
//		}
//		
	
		List <WebElement> Alldates=driver.findElements(By.xpath("//table/tbody/tr/td"));
		
		Thread.sleep(3000);
		
		System.out.println("total element in the calender is "+Alldates.size());
		
		for (WebElement ele:Alldates)
		{	
			String date =ele.getText().trim();
			
			if(date.equalsIgnoreCase("12"))
			{
				js.executeScript("arguments[0].click();", ele);
				break;
			}
			
		
		System.out.println(date);
			
		}
		
		
		
		
	
	
	}
	
	@AfterMethod	
	public void teardown()
		{
			driver.close();
		}
		
		
		
		
	}


