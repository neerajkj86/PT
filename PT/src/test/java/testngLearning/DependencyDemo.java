package testngLearning;

import static org.testng.Assert.fail;

import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

public class DependencyDemo 
{
	
	
		@Test
		public void independent() {
			System.out.println("Hello World");
		}
		
		//@Test(dependsOnMethods = "independent", retryAnalyzer = IRetryFailures.class)
		public void dependent() {
			//assert.fail("Test");
		}
	}



