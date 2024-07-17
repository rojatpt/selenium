package locators;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class LocatorConcepts {
	static WebDriver driver;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@Test
	void idnameclassnamecssselector() throws InterruptedException {
		Thread.sleep(2000);
		driver.get("http://hyderabadreport.com/user");
		Thread.sleep(2000);
		driver.findElement(By.id("edit-name")).sendKeys("roja");
		Thread.sleep(2000);
		driver.findElement(By.name("pass")).sendKeys("abc");
		Thread.sleep(1000);
		/*driver.findElement(By.className("form-submit")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("edit-name")).clear();
		Thread.sleep(2000);
		driver.findElement(By.id("edit-name")).sendKeys("meghana");*/
		/*driver.findElement(By.cssSelector("input#edit-submit")).click();
        Thread.sleep(2000);*/
        
        driver.findElement(By.cssSelector("input.form-submit")).click();
       // driver.findElement(By.cssSelector(".form-submit")).click();
        
	}

}
