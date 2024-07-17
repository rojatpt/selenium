package testngframework;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class TestNg_3_Disable_ignor {
	WebDriver driver;
	
 
     @Test(enabled=false)
      public void  facebook()  {
	  driver.get("http://www.facebbok.com");
	  
	  
	  
}

@Test
public void gmail() {
	  driver.get("http://www.gmail.com");
	  
}
@Test(enabled=false)
public void google() {
	  driver.get("http://www.google.com");
	  
}
   @Ignore
@Test
public void twitter() {
	  driver.get("http://www.x.com");
	  
}
@Test
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
	 // driver.quit();
  }

}
