package testNGSample;

import org.testng.annotations.Test;

public class Dependency {
  @Test(dependsOnMethods = "method5")
  public void method1
  () {
	 System.out.println("method1"); 
  }
  @Test
  public void method2() {
	  System.out.println("method2"); 
  }
  @Test
  public void method3() {
	  System.out.println("method3"); 
  }
  @Test
  public void method4() {
	  System.out.println("method4"); 
  }
  @Test
  public void method5() {
	  System.out.println("method5"); 
  }
}
