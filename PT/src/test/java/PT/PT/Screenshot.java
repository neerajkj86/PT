package PT.PT;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screenshot {

	
	@Test
	public void takesscreenshots() throws IOException
	{
		WebDriver driver;
		
		WebDriverManager.chromedriver().setup();
		
		
		ChromeOptions ops = new ChromeOptions();
		
		driver = new ChromeDriver(ops);
		
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.id("email")).sendKeys("12345");
		
		driver.findElement(By.id("pass")).sendKeys("123");
		
		
		TakesScreenshot ts = (TakesScreenshot)driver; //always remember these three lines of code for screenshots
		
		File Src=ts.getScreenshotAs(OutputType.FILE); //taking screeshot and storing in buffer memory
		
		FileUtils.copyFile(Src, new File("./Screenshot/facebook.png"));
		
		driver.close();
				
		
		
	}
}
