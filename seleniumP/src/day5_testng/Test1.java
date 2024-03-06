package day5_testng;

import org.testng.annotations.Test;

public class Test1 {
	@Test(threadPoolSize = 2,groups = "smoke",invocationCount=3)
	public void tc1() throws InterruptedException
	{
		System.out.println("Iam in tc1");
		Thread.sleep(4000);
	}
	
	@Test(groups="regression")
	public void tc2()
	{
		System.out.println("Iam in tc2");
	}

}
