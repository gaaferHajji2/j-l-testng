package jafarloka;

import static org.testng.Assert.assertNotNull;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CallMultipleClasses {

	@Test(priority = 1)
	public void checkTimeAndSearch() {
		WebElement timeElement = RealTestForPriority.wait.until(
			ExpectedConditions.presenceOfElementLocated(
				By.xpath("//span[text()='Time']")
			)
		);
		
		timeElement.click();
		
		RealTestForPriority.driver.findElement(By.xpath("//input[@placeholder='Type for hints...']")).sendKeys("John");
		
//		try {
//			RealTestForPriority.driver.manage().wait(3000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		WebElement t2 = RealTestForPriority.wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@role='listbox']/*[1]")));
		
//		t2.click();
		
//		System.out.println("t2 is: " + t2.getText());
		
//		RealTestForPriority.driver.findElement(By.xpath("//div[@role='listbox']/*[1]")).click();
		
		RealTestForPriority.driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		WebElement t1 = RealTestForPriority.wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[text()='Invalid']")));
		
//		WebElement t1 = RealTestForPriority.wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//p[text()='No Timesheets Found']")));
	
		assertNotNull(t1);
	}
	
	@Test(priority = 3)
	public void testLogout() {
		
		WebElement userNameElement = RealTestForPriority.driver.findElement(By.xpath("//p[@class='oxd-userdropdown-name']"));
		
		userNameElement.click();
		
		WebElement logoutElement = RealTestForPriority.wait.until(
				ExpectedConditions.presenceOfElementLocated(
						By.linkText("Logout")
				)
		);
		
		logoutElement.click();
		
		Assert.assertNotEquals(RealTestForPriority.driver.getCurrentUrl(), RealTestForPriority.homePageUrl);
		
	}
	
	@Test(priority = 4)
	public void exitFromBrowser() {
		
		RealTestForPriority.driver.quit();
		
	}
	
}
