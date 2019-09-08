package PT.PT;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alert {

	
	WebDriver driver;
	@Test(enabled = true)
	public void AlertBox() throws Throwable
	
	
	{
		
WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("http://demo.automationtesting.in/Alerts.html");
		
		//driver.findElement(By.xpath("//*[@id='menu1']")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a")).click();
		
		driver.findElement(By.xpath("//*[@id='Textbox']/button")).click();
		
		
		
		Thread.sleep(3000);
		
	driver.switchTo().alert();
	
	Robot bot = new Robot();
	
	bot.keyPress(KeyEvent.VK_CONTROL);
	bot.keyPress(KeyEvent.VK_A);
	
	bot.keyRelease(KeyEvent.VK_CONTROL);
	bot.keyRelease(KeyEvent.VK_A);
	
		Thread.sleep(5000);
		
		bot.keyPress(KeyEvent.VK_BACK_SPACE);
		
		bot.keyRelease(KeyEvent.VK_BACK_SPACE);
		
		Thread.sleep(5000);
		
		driver.switchTo().alert().sendKeys("Neeraj");
		
		Thread.sleep(5000);
		
		driver.switchTo().alert().accept();
	
	//	driver.close();
		
		
		
		
	}

}
