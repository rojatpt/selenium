package locators;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class linktextpartiallinktext {
	static WebDriver driver;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
	}
    
	/*@Test
	void linkpartialtext() throws InterruptedException {
	     driver.get("http://hyderabadreport.com/user");
	     Thread.sleep(2000);
	     
	     driver.findElement(By.linkText("Telangana")).click();
	     Thread.sleep(3000);
	     driver.findElement(By.partialLinkText("National")).click();*/
	@Test
	void tageName() throws InterruptedException {
		
		Thread.sleep(2000);
		driver.get("https://www.ndtv.com");
		Thread.sleep(2000);
		
		/*List<WebElement>ndtvlinks = driver.findElements(By.tagName("a"));
		Thread.sleep(2000);
	
		System.out.println(ndtvlinks.size());
	     System.out.println("Total number of links on NDTV application : "+ndtvlinks.size());*/
		
		
		List<WebElement>ndtvheadings=driver.findElements(By.tagName("headings"));
		Thread.sleep(2000);
		
		System.out.println(ndtvheadings.size());
		
	}

}
