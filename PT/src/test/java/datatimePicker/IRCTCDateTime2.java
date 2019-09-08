package datatimePicker;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IRCTCDateTime2 {
	

	//To get the desired date and month from the calender 
	
WebDriver driver;
	
	@Test
	public void getDate() throws Throwable
	{
		
		
WebDriverManager.chromedriver().setup();
		

      ChromeOptions ops = new ChromeOptions();
      
      ops.addArguments("disable-notifications");
		
      driver = new ChromeDriver(ops);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://www.irctc.co.in/nget/train-search");
	
		String Month = "October";
		
		String Day = "4";
		
WebElement Datetime=driver.findElement(By.xpath("//*[@id='divMain']/div/app-main-page/div[2]/div/div[1]/div/div/div[1]/div/app-jp-input/div[3]/form/div[3]/p-calendar/span/button/span[2]"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].click();", Datetime);
		
		Thread.sleep(3000);
		
		//Get the Month Text 
		while(true)
		{
		String Actual_Monthtext = driver.findElement(By.xpath("//*[@id=\"divMain\"]/div/app-main-page/div[2]/div/div[1]/div/div/div[1]/div/app-jp-input/div[3]/form/div[3]/p-calendar/span/div/div/div/span[1]")).getText();
		
		if (Actual_Monthtext.equalsIgnoreCase(Month))
		{
			
			break;
		}
		
		else 
		{
			
			driver.findElement(By.xpath("//*[@id=\"divMain\"]/div/app-main-page/div[2]/div/div[1]/div/div/div[1]/div/app-jp-input/div[3]/form/div[3]/p-calendar/span/div/div/a[2]/span")).click();
		}
		}
		

		
		driver.findElement(By.xpath("//table/tbody/tr/td/a[contains(text(),"+Day+")]")).click(); //parametrized the day so we can change the value easily.
		
		Thread.sleep(3000);
		
		//select the 3 Tier Class from drop down
		
	driver.findElement(By.xpath("//*[@id=\"journeyClass\"]/div/div[3]")).click();
	
List <WebElement> TrainClass =driver.findElements(By.xpath("//div[@class='ui-dropdown-items-wrapper']/ul/li/span"));


System.out.println(TrainClass.size());

System.out.println(TrainClass.get(6).getText());

for (int i=0;i<TrainClass.size();i++)
{
	TrainClass.get(i).getText();
}
        Thread.sleep(3000);
		driver.close();
		
		
}
}