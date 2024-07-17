package popupaltert;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class AlertWindow {
	WebDriver driver;
	
  @Test
  public void alertBox() throws InterruptedException {
	  driver.get("https://seleniumlearn.com/confirmation-dialog-box");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//*[@id=\"node-102\"]/div/div[1]/div/div/button")).click();
	  Thread.sleep(1000);
	  driver.switchTo().alert().accept();
	  
	  
  }
  @Test
  public void alertBoxCancle() throws InterruptedException {
	  driver.get("https://seleniumlearn.com/confirmation-dialog-box");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//*[@id=\"node-102\"]/div/div[1]/div/div/button")).click();
	  Thread.sleep(1000);
	  driver.switchTo().alert().dismiss();
	  
	  
	  
  }
  @BeforeTest
  public void beforeTest() throws InterruptedException {
	  driver= new ChromeDriver();
	  driver.manage().window().maximize();
	  Thread.sleep(2000);
  }

}
