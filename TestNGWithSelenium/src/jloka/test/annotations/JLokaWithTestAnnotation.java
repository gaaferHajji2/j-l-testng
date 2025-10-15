package jloka.test.annotations;

import org.testng.annotations.Test;

@Test
public class JLokaWithTestAnnotation {

	public void login() {
		System.out.println("Login method executed");
	}
	
	public void logout() {
		System.out.println("Logout method executed");
	}
	
}
