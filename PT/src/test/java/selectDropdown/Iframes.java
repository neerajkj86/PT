package selectDropdown;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Iframes {
	
WebDriver driver;
	
	@Test
	public void Iframeesdata() throws Throwable
	{
		
		
WebDriverManager.chromedriver().setup();
		

      ChromeOptions ops = new ChromeOptions();
      
      ops.addArguments("disable-notifications");
		
      driver = new ChromeDriver(ops);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get("http://demo.automationtesting.in/Frames.html");
		
		driver.switchTo().frame("singleframe");
		
		driver.findElement(By.xpath("/html/body/section/div/div/div/input")).sendKeys("Neeraj");
		Thread.sleep(5000);
		driver.switchTo().defaultContent();
}

	@AfterMethod
	public void teardown()
	{
	driver.close();
	}
	
	
}