package testngframework;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Testng_10_Group_Execution {
	
	WebDriver driver;
  @Test
  public void  facebook() throws InterruptedException  {
	  driver.get("http://www.facebbok.com");
	  
  }
  @Test(groups="food")
  public void swiggy() {
	  driver.get("http://www.swiggy.com");
	  
  }
  @Test
  public void eenadu() {
	  driver.get("http://www.eenadu.net");
	  
  }
  @Test
  public void google() {
	  driver.get("http://www.google.com");
	  
  }
  @Test
  public void godaddy() {
	  driver.get("http://www.godaddy.com");
	  
  }
  @Test(groups="food")
  public void zomato() {
	  driver.get("http://www.zomato.com");
	  
  }
  
  @Test
  public void gmail() {
	  driver.get("http://www.gmail.com");
	  
  }
  
  @Test
  public void twitter() {
	  driver.get("http://www.x.com");
	  
  }
  @Test
  public void selenium() {
	  driver.get("http://www.selenium.dev");
	  
  }
  @BeforeTest(groups="food")
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
