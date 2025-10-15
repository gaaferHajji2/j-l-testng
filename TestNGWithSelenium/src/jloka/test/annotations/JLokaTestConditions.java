package jloka.test.annotations;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class JLokaTestConditions {

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
		System.out.println("User make action");
	}
	
	@AfterTest
	public void logout() {
		System.out.println("Logout is executed");
	}
	
}
