package testNGSample;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionSample {
  @Test
  public void f() {
	  
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\SeleniumDrivers\\chromedriver.exe");
      
      
		 
		
		WebDriver driver=new ChromeDriver();
		 driver.get("http://demo.guru99.com/test/delete_customer.php");	
		 
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
	 
	 WebElement submit=driver.findElement(By.name("submit"));
	 boolean status=submit.isDisplayed();
	 
	 System.out.println(status);
	 
	 Assert.assertEquals(true,status);
	 
	 String exp="Guru99 Ban";
			 
     WebElement title=driver.findElement(By.xpath("//h2[text()='Guru99 Bank']"));		
	 
	 String actual=title.getText();
	 System.out.println(actual);
	 Assert.assertEquals(actual,exp);
	 
	 
	 
  }
}
