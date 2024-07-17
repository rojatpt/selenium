package redminedroupdown;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;

public class RedmineDroup {
	WebDriver driver;
	
  @Test
  public void Redmine() throws InterruptedException {
	  
	  driver.get("https://www.redmine.org/account/register");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//*[@id=\"user_mail\"]")).sendKeys("rojakoti92@gmail.com");
	  Thread.sleep(2000);
	  Select obj = new Select(driver.findElement(By.xpath("//*[@id=\"user_language\"]")));
	   obj.selectByVisibleText("Basque");
	   
	   
	  
  }
  @BeforeTest
  public void beforeTest() throws InterruptedException {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  Thread.sleep(2000);
	  
  }

}
