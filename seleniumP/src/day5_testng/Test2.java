package day5_testng;

import org.testng.annotations.Test;

public class Test2 {
	@Test(groups="regression",threadPoolSize = 2)
	public void tc3()
	{
		System.out.println("Iam in tc3");
	}

}
