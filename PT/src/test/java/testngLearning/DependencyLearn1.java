package testngLearning;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependencyLearn1 {

	@Test (groups="Sniff")
	public void testcase1()
	{
		System.out.println("I am in test 1");
		Assert.fail("Test Failed");
	}
	
	@Test (dependsOnMethods ="testcase1",groups="Sniff")
	public void testcase2()
	{
		System.out.println("I am in test 2");
	}
	
	@Test(dependsOnMethods="testcase1")
	public void testcase3()
	{
		System.out.println("I am in test 3");
	}
	
	@Test(dependsOnMethods="testcase1",alwaysRun=true)
	public void testcase4()
	{
		System.out.println("I am in test 4");
	}
	
	@Test(dependsOnMethods="testcase1",groups="Sniff")
	public void testcase5()
	{
		System.out.println("I am in test 5");
	}
	
	
}
