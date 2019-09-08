package testngLearning;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserFactory 
{
	public static WebDriver driver;
	public static WebDriver getbrowserName(String Browser)
	{
		if (Browser.equalsIgnoreCase("chrome")){
			
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		
		else if(Browser.equalsIgnoreCase("firefox")){
			
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			
		}
		
		//driver.manage().window().maximize();
		//driver.get(URL);
		//driver.manage().deleteAllCookies();
		//driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		
		
		return driver;
		
	}

}
