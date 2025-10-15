package jloka.test.annotations;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class JLokaTestMethodsConditions {

	// Pre-condition
	@BeforeMethod
	public void login() {
		System.out.println("Login executed");
	}
	
	// Post-condition
	@AfterMethod
	public void logout() {
		System.out.println("Logout executed");
	}
	
	@Test
	public void addToCart() {
		System.out.println("User invoke add to cart");
	}
	
	@Test
	public void removeFromCart() {
		System.out.println("User invoke remove from cart");
	}
	
}
