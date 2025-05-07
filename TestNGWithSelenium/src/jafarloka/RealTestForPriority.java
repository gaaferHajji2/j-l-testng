package jafarloka;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RealTestForPriority {
	
	ChromeDriver driver;
	
	ChromeDriverService service;
	
	File serviceFile;
	
	WebDriverWait wait;
	
	String homePageUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";

	@Test(priority = 1)
	public void testLogin() {
		serviceFile = new File("C:\\Tests\\Python-Selenium-From-Tutorial-01\\chromedriver.exe");
		
		service = new ChromeDriverService.Builder().usingDriverExecutable(serviceFile).usingAnyFreePort().build();
		
		driver = new ChromeDriver(service);
		
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com");
		
		wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		WebElement el1 = wait.until(ExpectedConditions.presenceOfElementLocated(By.name("username")));
		
		el1.sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		
		driver.findElement(By.xpath("//button[text()[contains(., 'Login')]]")).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		Assert.assertEquals(driver.getCurrentUrl(), homePageUrl);
	}
	
	// Leave XPATH Is --> //a/span[text()='Leave']
	// For Employee Name --> //input[@placeholder='Type for hints...']
	@Test(priority = 2)
	public void testCheckLeave() {
		
		WebElement el1 = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a/span[text()='Leave']")));
		
		el1.click();
		
		WebElement el2 = wait.until(
				ExpectedConditions.presenceOfElementLocated(
							By.xpath("//input[@placeholder='Type for hints...']")
				)
			);
		
		el2.sendKeys("John");
		
		Assert.assertTrue(el2.isDisplayed());
	}
	
	// XPATH Of Username --> //p[@class='oxd-userdropdown-name']
	// By Link Txt Is --> Logout
	@Test(priority = 3)
	public void testLogout() {
		
		WebElement userNameElement = driver.findElement(By.xpath("//p[@class='oxd-userdropdown-name']"));
		
		userNameElement.click();
		
		WebElement logoutElement = wait.until(
				ExpectedConditions.presenceOfElementLocated(
						By.linkText("Logout")
				)
		);
		
		logoutElement.click();
		
		Assert.assertNotEquals(driver.getCurrentUrl(), homePageUrl);
		
	}
	
	@Test(priority = 4)
	public void exitFromBrowser() {
		
		driver.quit();
		
	}
	
}
