package testngLearning;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class softassertion 
{
	// soft assertion is used if we want to execute the full code despite there are some failure in the code at different level.
	
	@Test
	public void SoftAssertion()
	{
	SoftAssert as = new SoftAssert();
	
	System.out.println("Validating Image");
	as.assertEquals(true, false,"Image is not present");
	
	
	System.out.println("Validating Iframe");

	as.assertTrue(false,"Iframe is not present");
	
	System.out.println("Test end");
	
	as.assertAll(); //this method is used to fail the test otherwise the testng will still pass the test with assertall method.
	
	}

}
