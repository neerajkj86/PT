package testngLearning;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyser implements IRetryAnalyzer

{

	private int retrycounter =0;
	private static int maxretrycount =5;
	public boolean retry(ITestResult result) {
		
		if (retrycounter<maxretrycount) {
		System.out.println("retrying test" +result.getName());
		retrycounter++;
		return true;
	}
	
	return false;
	}
	

}
