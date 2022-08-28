package testNGSample;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;

public class BeforeAfterTestSample {
  @Test
  public void test1() {
	  System.out.println("Test1");
  }
  
  @Test
  public void test2() {
	  System.out.println("Test2");
  }
  @BeforeTest
  public void beforeTest() {
	  System.out.println("beforeTest");
	  
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("afterTest");
  }

  
  @BeforeMethod
  public void beforeMethod()
  {
	  System.out.println("beforeMethod");
  }
  @AfterMethod
  public void afterMethod()
  {
	  System.out.println("afterMethod");
  }
}
