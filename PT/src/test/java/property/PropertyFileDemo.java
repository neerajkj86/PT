package property;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PropertyFileDemo {

	//key value pair
	public static WebDriver driver ;
	public static void main(String[] args) throws Throwable {
		
        
		Properties OR = new Properties();
		
		File src = new File("./Resources/OR.properties");
		
		FileInputStream fis = new FileInputStream(src);
		
		OR.load(fis);
		
		//System.out.println(OR.getProperty("URL"));
		
		String TestURL=OR.getProperty("URL");
		
		WebDriverManager.chromedriver().setup();
          
         driver = new  ChromeDriver();
         
         driver.get(TestURL);


		
	}

}
