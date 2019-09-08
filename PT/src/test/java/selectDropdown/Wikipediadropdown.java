package selectDropdown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Wikipediadropdown 
{
	
	
WebDriver driver;
	
	@Test
	public void DropDownValues() throws Throwable
	{
		
		
WebDriverManager.chromedriver().setup();
		

      ChromeOptions ops = new ChromeOptions();
      
      ops.addArguments("disable-notifications");
		
      driver = new ChromeDriver(ops);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get("https://www.wikipedia.org/");
		
		WebElement dropdown = driver.findElement(By.id("searchLanguage"));
		
		Select select = new Select(dropdown) ;
		
		//select.selectByVisibleText("Galego");
		
		List <WebElement> allvalues= select.getOptions();
		System.out.println(allvalues.size());
		for (WebElement ele:allvalues )

		{
			System.out.println(ele.getText());
			
			//System.out.println(ele.getAttribute("innerHtml"));
			
		}
		
		
		
		Thread.sleep(3000);
		
		
	}
		
		
		@AfterMethod
		public void teardown()
		{
		driver.close();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		

}
