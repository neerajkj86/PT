package PT.PT;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NaukariWndows2 
{
	WebDriver driver;
	@Test
	public void dropdownselection() throws Exception
	{
	WebDriverManager.chromedriver().setup();
	
	driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	
	WebDriverWait wait = new WebDriverWait(driver, 5);
	
	//wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("")));

	//Wait wait = new FluentWait<T>(input).withTimeout(timeout)
	
//	Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)							
//			.withTimeout(30, TimeUnit.SECONDS) 			
//			.pollingEvery(5, TimeUnit.SECONDS) 			
//			.ignoring(NoSuchElementException.class);
	
	//Wait wait = new FluentWait(driver).withTimeout(30,TimeUnit.SECONDS).pollingEvery(5,TimeUnit.SECONDS).ignoreAll("NoSuchElementException")
	
	driver.get("https://www.naukri.com/");
	
String Parent=driver.getWindowHandle();
	
System.out.println("Naukari Window id is"+Parent );


Set <String> allwindows=driver.getWindowHandles();

int countofwindows= allwindows.size();

System.out.println("Total windows are " +countofwindows);

List <String> tabs = new ArrayList<String>(allwindows);

System.out.println(tabs.get(1)); //child window id
//System.out.println(tabs.get(0)); //Parent window id

String First_window=tabs.get(1);
String Second_window=tabs.get(2);
String Third_window=tabs.get(3);
String Parent_Window = tabs.get(0);


driver.switchTo().window(First_window).close();
driver.switchTo().window(Second_window).close();
driver.switchTo().window(Third_window).close();
driver.switchTo().window(Parent);
System.out.println("Parent window title is " +driver.getTitle());
Thread.sleep(3000);

driver.close();


	
	}
	
	}	