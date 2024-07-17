package testngframework;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class TestNg_8_invocationCount {
	WebDriver driver;
	
  @Test(invocationCount=2)
  public void google() {
	  driver.get("http://www.google.com");
	  driver.findElement(By.id("APjFqb")).sendKeys("Hello TestNG");
	  driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
  }
  @Test
  public void facebook() {
	  driver.get("http://www.facebook.com");
	  driver.findElement(By.name("email")).sendKeys("Hello TestNG");
	  
	  
  }
  @Test(invocationCount=3)
  public void selenium() {
	  driver.get("http://www.seleniumlearn.com");
	  driver.findElement(By.className("sf-depth-1")).click();
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
