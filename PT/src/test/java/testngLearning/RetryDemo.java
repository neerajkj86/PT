package testngLearning;

import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class RetryDemo 
{
	
	 
	 @Test
		public void testcase1()
		{
			System.out.println("I am in test 1");
	}
		
	 @Test
		public void testcase2()
		{
			System.out.println("I am in test 2");
	}
		
		@Test(retryAnalyzer = testngLearning.RetryAnalyser.class)
		public void testcase3()
		{
			System.out.println("I am in test 3");
			Assert.fail();
	}
		
		@Test
		public void testcase4()
		{
			System.out.println("I am in test 4");
	}

}
