package testNGSample;

import org.testng.annotations.Test;

import net.bytebuddy.build.Plugin.Factory.UsingReflection.Priority;

import org.testng.annotations.BeforeTest;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class SampleTestNG {
	
	public WebDriver driver;
	  @Test
	  public void f1() {
		  System.out.println("f1");
	  }
	  @Test
	  public void f2() {
		  System.out.println("f2");
	  }
	  @Test(priority = 2)
	  public void f3() {
		  System.out.println("f3");
	  }
	  @Test(priority =1)
	  public void f4() {
		  System.out.println("f4");
	  }
	  @BeforeTest
	  public void beforeTest() {
//		  System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\SeleniumDrivers\\chromedriver.exe");
//	      
//	      
//			
//			 driver=new ChromeDriver();
//			 driver.get("http://demo.guru99.com/test/delete_customer.php");	
//			 
//			 driver.manage().window().maximize();
//			 driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
		  System.out.println("Before test");
		
	  }

	  @AfterTest
	  public void afterTest() {
		  System.out.println("After test");
	  }

}
