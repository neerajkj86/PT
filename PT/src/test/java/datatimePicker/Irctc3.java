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

public class Irctc3 {
	
	
	
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
		
		
		//to change the month we have to click here
		driver.findElement(By.xpath("//*[@id=\"divMain\"]/div/app-main-page/div[2]/div/div[1]/div/div/div[1]/div/app-jp-input/div[3]/form/div[3]/p-calendar/span/div/div/a[2]/span")).click();
		
		List <WebElement> Allrowdates=driver.findElements(By.xpath("//table/tbody/tr"));
		
		
		
		List <WebElement> Allcoldates=driver.findElements(By.xpath("//table/tbody/tr[1]/td"));
		
		Thread.sleep(3000);
		
		System.out.println("total rowselement in the calender is "+Allrowdates.size());
		
		
		System.out.println("total col element in the calender is "+Allcoldates.size());
		
		boolean flag =false;
		for (int i=1;i<=Allrowdates.size();i++){
			for(int j=1;j<=Allcoldates.size();j++){
			
			WebElement tobeclicked=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td["+j+"]"));
				String Dateele= tobeclicked.getText().trim();
				
			
				
			if (Dateele.equalsIgnoreCase("24"))
			{
				tobeclicked.click();
				Thread.sleep(3000);
				flag = true;
				break;
			}
			
		
			}
		
			if(flag)
			{
				break;
			}
			
			}
			
		
		
		
		
	
	
	}
	
	@AfterMethod	
	public void teardown()
		{
			driver.close();
		}
		
		
		
		
	}


