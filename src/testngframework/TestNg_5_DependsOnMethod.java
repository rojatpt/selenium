package testngframework;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class TestNg_5_DependsOnMethod {
	WebDriver driver;
	
  @Test(dependsOnMethods="method2")
       public void method1() {
	  driver.findElement(By.name("q")).sendKeys("Hello TestNG");
	  driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	  driver.findElement(By.className("gb_c")).click();
	  
	  }
  @Test
  public void method2() {
	driver.get("http://www.google.com");
	  
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
