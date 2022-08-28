package testNGSample;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;

public class TestNGSample2 {
	public WebDriver driver;
  @Test
  public void test1() {
//	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
//	  driver.findElement(By.name("cusid")).sendKeys("123");	
	  
	  System.out.println("test1");
  }
  @Test
  public void test2() {
//	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
//	  driver.findElement(By.name("cusid")).clear();
	  System.out.println("test2");
  }
  

  
  @BeforeTest
  public void beforeTest() {
//	  System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\SeleniumDrivers\\chromedriver.exe");
//      
//      
//		
//		driver=new ChromeDriver();
//		 driver.get("http://demo.guru99.com/test/delete_customer.php");	
//		 driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
//		 
//		 driver.manage().window().maximize();
		 
	  System.out.println("beforeTest");
	
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("afterTest");
	 // driver.quit();
  }
  
  
  
  @BeforeMethod
  public void beforeMethod()
  {
	  System.out.println("beforeMethod");
  }
  
  @org.testng.annotations.AfterMethod
  public void AfterMethod()
  {
	  System.out.println("AfterMethod");
  }

}




//Before suite

//before Test
//BeforeClass
//AfterClass

//BeforeClass
//AfterClass
//After Test


//before Test
//After Test

//before Test
//After Test

