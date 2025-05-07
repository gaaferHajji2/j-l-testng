package jafarloka;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test02ForTestNGXMLFile {
	
	private static String CurrentUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/time/viewTimesheet/employeeId/";

	@Test
	public void check01() {
		WebElement t1 = RealTestForPriority.driver.findElement(By.xpath("//span[text()='Time']"));
		
		t1.click();
		
		WebElement t2 = RealTestForPriority.wait.until(
			ExpectedConditions.presenceOfElementLocated(
					By.xpath("//input[@placeholder='Type for hints...']")
			)
		);
		
		t2.sendKeys("John Doe");
		
		WebElement t3 = RealTestForPriority.driver.findElement(By.xpath("//button[@type='submit']"));
		
		t3.click();
		
		Assert.assertTrue(RealTestForPriority.driver.getCurrentUrl().startsWith(CurrentUrl));
		
	}
	
}
