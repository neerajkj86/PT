package testngLearning;


import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class IncludeExclude 
{
	// soft assertion is used if we want to execute the full code despite there are some failure in the code at different level.
	
	@Test 
	public void test1()
	{
	
		System.out.println("I am in Test 1");
	
	}
	
	@Test
	public void test2()
	{
		System.out.println("I am in Test 2");
	}

	
	@Test
	public void test3()
	{
		System.out.println("I am in Test 3");
	}
}
