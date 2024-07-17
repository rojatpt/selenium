package testngframework;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Testng_2_TestCases_Exection_Priority {
	
	WebDriver driver;
  @Test
  public void  facebook() throws InterruptedException  {
	  driver.get("http://www.facebbok.com");
	  Thread.sleep(2000);
	  
	  
  }
  
  @Test
  public void gmail() {
	  driver.get("http://www.gmail.com");
	  
  }
  @Test(priority=1)
  public void google() {
	  driver.get("http://www.google.com");
	  
  }
  @Test
  public void twitter() {
	  driver.get("http://www.x.com");
	  
  }
  @Test(priority=0)
  public void selenium() {
	  driver.get("http://www.selenium.dev");
	  
  }
  @BeforeTest
  public void beforeTest() throws InterruptedException {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  Thread.sleep(2000);
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
