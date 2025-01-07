package jafarloka;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckAssertion {

	
	@Test
	public void checkAssertionEquals() {
		System.setProperty(
			"webdriver.chrome.driver", 
			"C:\\Tests\\Python-Selenium-From-Tutorial-01\\chromedriver.exe"
		);
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com");
		
//		driver.get("https://google.com");
//		
//		String url = driver.getCurrentUrl();
//		String title = driver.getTitle();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		WebElement el1 = wait.until(ExpectedConditions.presenceOfElementLocated(By.name("username")));
		
		el1.sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		
		driver.findElement(By.xpath("//button[text()[contains(., 'Login')]]")).click();
		
		String url = driver.getCurrentUrl();
		
//		System.out.println("The Current URL is: " + url);
		
		String expectedUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
		
//		assertEquals(url, expectedUrl);
		
		Assert.assertEquals(url, expectedUrl);
	}
	
	@Test
	public void checkAssertionNotEquals() {
		System.setProperty(
				"webdriver.chrome.driver", 
				"C:\\Tests\\Python-Selenium-From-Tutorial-01\\chromedriver.exe"
			);
			
			ChromeDriver driver = new ChromeDriver();
			
			driver.get("https://opensource-demo.orangehrmlive.com");
			
//			driver.get("https://google.com");
//			
//			String url = driver.getCurrentUrl();
//			String title = driver.getTitle();
			
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
			
			WebElement el1 = wait.until(ExpectedConditions.presenceOfElementLocated(By.name("username")));
			
			el1.sendKeys("Admin");
			driver.findElement(By.name("password")).sendKeys("admin12");
			
			driver.findElement(By.xpath("//button[text()[contains(., 'Login')]]")).click();
			
			String url = driver.getCurrentUrl();
			
//			System.out.println("The Current URL is: " + url);
			
			String expectedUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
			
//			assertEquals(url, expectedUrl);
			
			Assert.assertNotEquals(url, expectedUrl);
	}
}
