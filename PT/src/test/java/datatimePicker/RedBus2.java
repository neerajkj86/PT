package datatimePicker;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class RedBus2 {

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
		
	List<WebElement> date =driver.findElements(By.xpath("//input[@id=\"txtSource\"]/following::div[6]/div[@id='rb-calendar']/div/following::div[1]/child::div[3]/child::ul[2]/li"));
		
	
int totaldate =date.size();

System.out.println("Total element in the list is "+totaldate);

for (WebElement e: date)
{

	System.out.println(e.getText().toString());
	
}
	driver.close();	
		
		
}

}