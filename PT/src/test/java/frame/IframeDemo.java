package frame;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IframeDemo {

	
	public static WebDriver driver;
	public static void main(String[] args) throws Throwable {
		
		
		WebDriverManager.chromedriver().setup();
		
		
		//ChromeOptions ops = new ChromeOptions();
		
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_submit_get");
		
	List <WebElement> framecount=driver.findElements(By.tagName("iframe"));
	
	System.out.println(framecount.size());
	
	
	for(WebElement frame : framecount)
	{
		System.out.println(frame.getAttribute("id"));
	}
		
	//driver.switchTo().frame("iframeResult");
	
	//driver.switchTo().frame(frameElement)
	
		driver.findElement(By.xpath("/html/body/button")).click();
		Thread.sleep(3000);
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("/html/body/div[5]/div/button")).click();
		Thread.sleep(3000);
		driver.close();
		

	}

}
