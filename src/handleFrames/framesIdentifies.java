package handleFrames;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class framesIdentifies {
	WebDriver driver;
	
  @Test
  public void framesValues() throws InterruptedException {
	  driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
	  Thread.sleep(2000);
	  
	  WebElement obj = driver.findElement(By.id("iframeResult"));
	  driver.switchTo().frame(obj);
	  Thread.sleep(2000);
	  
	  driver.findElement(By.xpath("/html/body/button")).click();
	  Thread.sleep(2000);
	  driver.switchTo().alert().accept();
	  
	  
	  
  }
  @BeforeTest
  public void beforeTest() throws InterruptedException {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  Thread.sleep(2000);
  }

}
