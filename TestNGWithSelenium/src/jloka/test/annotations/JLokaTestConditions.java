package jloka.test.annotations;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class JLokaTestConditions {

	// Note: This will apply only for the test that contains the methods.
	@BeforeTest
	public void login() {
		System.out.println("Login is executed");
	}
	
	@Test
	public void search() {
		System.out.println("Search is executed");
	}
	
	@Test
	public void doAction() {
		System.out.println("----------------");
		System.out.println("User make action");
	}
	
	// Note: This will apply only for the test that contains the methods.
	// they will not invoked for the second class in the suit, else the classes are under the same test-tag
	@AfterTest
	public void logout() {
		System.out.println("Logout is executed");
	}
	
}
