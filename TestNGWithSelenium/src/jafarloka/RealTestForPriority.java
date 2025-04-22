package jafarloka;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class RealTestForPriority {

	@Test(priority = 1)
	public void testLogin() {
		File serviceFile = new File("C:\\Tests\\Python-Selenium-From-Tutorial-01\\chromedriver.exe");
		
		ChromeDriverService service;
		
		service = new ChromeDriverService.Builder().usingDriverExecutable(serviceFile).usingAnyFreePort().build();
		
		ChromeDriver driver = new ChromeDriver(service);
		
		driver.get("https://opensource-demo.orangehrmlive.com");
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		WebElement el1 = wait.until(ExpectedConditions.presenceOfElementLocated(By.name("username")));
		
		el1.sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		
		driver.findElement(By.xpath("//button[text()[contains(., 'Login')]]")).click();
	}
	
	// Leave XPATH Is --> //a/span[text()='Leave']
	@Test(priority = 2)
	public void testCheckLeave() {
		
		File serviceFile = new File("C:\\Tests\\Python-Selenium-From-Tutorial-01\\chromedriver.exe");
		
		ChromeDriverService service;
		
		service = new ChromeDriverService.Builder().usingDriverExecutable(serviceFile).usingAnyFreePort().build();
		
		ChromeDriver driver = new ChromeDriver(service);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		WebElement el1 = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a/span[text()='Leave']")));
		
		el1.click();
	}
	
	// XPATH Of Username --> //p[@class='oxd-userdropdown-name']
	// By Link Txt Is --> Logout
	@Test(priority = 3)
	public void testLogout() {
		
	}
	
	@Test(priority = 4)
	public void exitFromBrowser() {
		
	}
	
}
