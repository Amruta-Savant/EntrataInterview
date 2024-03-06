package day5_testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Testng_Annotation {
 

@Test(priority = 1 )
  public void testcase1()
		  {
	  System.out.println("Iam in main test1");
  }
  @Test(invocationCount = 2)
  public void testcase2()
		  {
	  System.out.println("Iam in main test2");
  }
  @BeforeMethod
  public void beforeMetho() {
	  System.out.println("Iam in before method");
	  
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("Iam in after method");
	  
  }


  
  @BeforeClass
  public void beforeClass() {
	  System.out.println("Iam in before class");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("Iam in after class");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("Iam in before test");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("Iam in after test");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("Iam in before suite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("Iam in after suite");
  }

}
