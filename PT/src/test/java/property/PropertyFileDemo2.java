package property;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PropertyFileDemo2 {

	//key value pair
	public static WebDriver driver ;
	public static void main(String[] args) throws Throwable {
		
        
		Configreader obj = new Configreader();
		
		//System.out.println(OR.getProperty("URL"));
		
		//String TestURL=OR.getProperty("URL");
		
		WebDriverManager.chromedriver().setup();
          
         driver = new  ChromeDriver();
         
         driver.get(obj.GetApplicatonURL());


		
	}

}
