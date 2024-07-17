package testngframework;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class TestNg_6_Description {
	WebDriver driver;
	
  @Test
       public void redmine() {
	  driver.get("http://www.redmine.org");
	  	  
	  }
  @Test(description="search")
  public void redmine1() {
	driver.findElement(By.id("q")).click();
	  
  }
  @Test(description="download menu bar")
  public void redmine2() {
	driver.findElement(By.className("download")).click();
  }
  @Test(description = "signin")
  public void redmine3() {
	driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[1]/span[4]/ul/li[2]/a")).click();
  }
  @Test(description="help for top bar")
  public void redmine4() {
	driver.findElement(By.className("help")).click();
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
