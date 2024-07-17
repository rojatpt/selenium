package testngframework;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TestNG_9_Run_TestCases_XMLfiles {
	
	WebDriver driver;
	
  @Test
  public void facebook() {
	  driver.get("http://www.facebook.com");
  }
  @Test
  public void selenium() {
	  driver.get("http://www.seleniumlearn.com");
  }
  @Test
  public void twitter() {
	  driver.get("http://www.x.com");
  }
  @Test
  public void amazon() {
	  driver.get("http://www.amazon.com");
  }
  @BeforeMethod
  public void beforeMethod()  {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	 
  }

  @AfterMethod
  public void afterMethod() {
	  driver.quit();
  }
  }

 