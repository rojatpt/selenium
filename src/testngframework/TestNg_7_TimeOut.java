package testngframework;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class TestNg_7_TimeOut {
	WebDriver driver;
	
  @Test(timeOut=9000)
  public void method1() {
	  driver.get("http://www.google.com");
	  driver.findElement(By.id("APjFqb")).sendKeys("Hello TestNG");
	  driver.findElement(By.name("q")).sendKeys(Keys.ENTER);

	  
	  
	  		
  }
  @Test
  public void method2() {
	  driver.get("http://www.facebook.com");
	  driver.findElement(By.id("email")).sendKeys("vasishta");
	  driver.findElement(By.id("pass")).sendKeys("abcd");
	  
  }

  @BeforeTest
  public void beforeTest() throws InterruptedException {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  Thread.sleep(2000);
  }

  @AfterTest
  public void afterTest() {
	  //driver.quit();
  }

}
