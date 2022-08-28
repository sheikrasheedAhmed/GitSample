//package testNGSample;
//
//import java.io.File;
//import java.io.IOException;
//import java.time.Duration;
//
//import org.apache.commons.io.FileUtils;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//public class ScreenShotSample {
//
//	public static void main(String[] args) throws IOException {
//		// TODO Auto-generated method stub
//		 System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\SeleniumDrivers\\chromedriver.exe");
//	        
//	       
//		 
//			
//			WebDriver driver=new ChromeDriver();
//			 driver.get("http://demo.guru99.com/test/delete_customer.php");	
//			 
//		 driver.manage().window().maximize();
//		 driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
////			 //   driver.findElement(By.name("cusid")).sendKeys("53920");		
////			 
////			 WebElement submit=driver.findElement(By.name("submit"));
////		        submit.click();
//		
//		      try {
//				Thread.sleep(3000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		        
//		        
//		        File dest=new File("D:\\Automation\\sample.png");
//		        
//		        
//		        TakesScreenshot screenshot=(TakesScreenshot)driver; //
//		        File source=screenshot.getScreenshotAs(OutputType.FILE);
//		        
//		       FileUtils.copyFile(source, dest);
//	}
//
//}
