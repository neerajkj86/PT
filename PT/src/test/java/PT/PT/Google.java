package PT.PT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Google {

	
	
	
	public static void main(String[] args) throws Throwable {
		
		 WebDriver driver;
		 
		 
		 
		 WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
	
		
		
		driver.get("https://www.google.com/");
		
		driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div/div[1]/div/div[1]/input")).sendKeys("Dhruv Mohan");
		
		//Thread.sleep(5000);
		driver.close();
		
		

	}

}
