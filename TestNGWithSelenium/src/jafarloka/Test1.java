package jafarloka;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test1 {
	
	@Test
	public void launchGooglePage() {
		// Launch browser
		System.setProperty(
			"webdriver.chrome.driver", 
			"C:\\Tests\\Python-Selenium-From-Tutorial-01\\chromedriver.exe"
		);
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
		driver.quit();
	}
}

