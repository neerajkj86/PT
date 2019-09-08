package testngLearning;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

//All test will be ignored if we put on class level
//@Ignore
public class IgnoreTestNG {

 @Ignore
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
	
	@Test
	public void testcase3()
	{
		System.out.println("I am in test 3");
}
	
	@Test
	public void testcase4()
	{
		System.out.println("I am in test 4");
}

}