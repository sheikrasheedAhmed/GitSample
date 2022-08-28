package testNGSample;

import org.testng.annotations.Test;

public class GroupTesting {
  @Test(groups ={"Regression","smoke"})
  public void method1() {
	  System.out.println("Regression1");
  }
  @Test(groups="Sanity")
  public void method2() {
	  System.out.println("Sanity1");
  }
  @Test(groups = "Smoke")
  public void method3() {
	  System.out.println("Smoke1");
  }
  @Test(groups = "Sanity")
  public void method4() {
	  System.out.println("Sanity2");
  }
  @Test(groups = "Regression")
  public void method5() {
	  System.out.println("Regression2");
  }
  @Test(groups ="Smoke")
  public void method6() {
	  System.out.println("Smoke2");
	  
	  
  }
}
