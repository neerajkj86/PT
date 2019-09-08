package testngLearning;

import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class DependencyTest2 
{
	// soft assertion is used if we want to execute the full code despite there are some failure in the code at different level.
	@Ignore
	@Test(priority =1)
	public void A()                   //Lets assume test B is dependent on test A
	{
	System.out.println("In test A");
	Assert.fail("Failed to test dependency");
	}
	@Test(dependsOnMethods = "A",groups = "sniff")
	public void B()
	{
	System.out.println("In test B");
	
	}
	@Test(dependsOnMethods="A",alwaysRun = true) //Soft Dependency where we can still execute the dependent test by marking as always run = true
	public void C()
	{
	System.out.println("In test C");
	
	Assert.fail("Failed due to some reason");
	
	}
	@Test(dependsOnMethods="A")
	public void D()
	{
	System.out.println("In test D");
	
	}
	
	

}
