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

public class TestInvocationCount {
	
	String homePageUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
	
	@Test(invocationCount = 2)
	public void testLogin() {
		File serviceFile = new File("C:\\Tests\\Python-Selenium-From-Tutorial-01\\chromedriver.exe");
		
		ChromeDriverService service = new ChromeDriverService.Builder().usingDriverExecutable(serviceFile).usingAnyFreePort().build();
		
		ChromeDriver driver = new ChromeDriver(service);
		
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com");
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		WebElement el1 = wait.until(ExpectedConditions.presenceOfElementLocated(By.name("username")));
			
		el1.sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
			
		driver.findElement(By.xpath("//button[text()[contains(., 'Login')]]")).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		System.out.println("The Current URL Is: " + driver.getCurrentUrl());
			
		Assert.assertEquals(driver.getCurrentUrl(), homePageUrl);
					
		driver.quit();
	}
}
