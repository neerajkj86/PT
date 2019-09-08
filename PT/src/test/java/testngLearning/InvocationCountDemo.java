package testngLearning;

import org.testng.annotations.Test;

public class InvocationCountDemo extends BrowserFactory
{
	
	@Test(invocationCount = 5,threadPoolSize = 3)
	public void login()
	{
		//System.out.println("Launching chrome browser");
		
		driver = getbrowserName("chrome");
		driver.get("https://www.google.com/");

		System.out.println(driver.getTitle());
		driver.quit();
	}

}
