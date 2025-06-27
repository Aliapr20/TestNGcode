package testng_Package;

import static org.testng.Assert.assertEquals;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class Skiptestcase {
	@Test(priority=1)
	public void openmethod1()
	{
	System.out.println("Test case pass");
		
	}
	@Test(priority=2)
	public void openmethod2()
	
	{
		throw new SkipException("The test case skipped");
		
	}
	@Test(priority=3,enabled=false)
	public void openmethod3()
	
	{
		System.out.println("The test case skipped here too");
	}
	@Test(priority=3)
	public void openmethod4()
	
	{
		assertEquals("1","1");
	}
	
	
	
}
