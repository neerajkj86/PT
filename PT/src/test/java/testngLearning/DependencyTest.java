package testngLearning;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class DependencyTest 
{
	// soft assertion is used if we want to execute the full code despite there are some failure in the code at different level.
	
	@Test(priority =1)
	public void A()                   //Lets assume test B is dependent on test A
	{
	System.out.println("In test A");
	Assert.fail("Failed to test dependency");
	}
	@Test(dependsOnMethods = {"A","C"})
	public void B()
	{
	System.out.println("In test B");
	
	}
	@Test(priority =3,groups="Sniff")
	public void C()
	{
	System.out.println("In test C");
	
	Assert.fail("Failed due to some reason");
	
	}
	@Test(priority =4,groups = "sniff")
	public void D()
	{
	System.out.println("In test D");
	
	}
	
	

}
