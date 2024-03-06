package day6_listener;

import static org.testng.Assert.fail;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Testcase1 {
	@Test
	public <assertion> void tc1()
	{
		System.out.println("i am in tc1");
		SoftAssert s=new SoftAssert();
		s.fail();
		s.assertAll();
		
	}

	@Test(dependsOnMethods = "tc1" )
	public void tc2()
	{
		System.out.println("i am in tc2");
	}
	


}
