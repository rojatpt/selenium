package popupaltertprompt;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class PromptWindow {
	WebDriver driver;
	
  @Test
  public void PromptDialogBox() throws InterruptedException {
	  driver.get("https://seleniumlearn.com/prompt-dialog-box");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//*[@id=\"node-103\"]/div/div[1]/div/div/button")).click();
	  Thread.sleep(2000);
	  driver.switchTo().alert().sendKeys("Vasishta");
	  Thread.sleep(1000);
	  driver.switchTo().alert().accept();
	  
	  
  }
  
  @BeforeTest
  public void beforeTest() throws InterruptedException {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  Thread.sleep(2000);
  }

}
