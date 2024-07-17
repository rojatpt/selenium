package demotestng;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class SeleniumDemo {
	WebDriver driver;
	
  @Test
  public void godaddy() {
	  
	  driver.get("http://www.godaddy.com");
  }
 public void swiggy() {
	  
	  driver.get("http://www.swiggy.com");
  }
  @BeforeTest
  public void beforeTest() {
	  
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
