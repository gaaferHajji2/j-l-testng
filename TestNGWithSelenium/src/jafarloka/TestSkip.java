package jafarloka;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class TestSkip {

	@Test(priority = 5)
	public void a() {
		System.out.println("This Is The Test Case a");
	}
	
	@Test(priority = 2, enabled=false)
	public void c() {
		System.out.println("This Is The Test Case c");
	}
	
	@Test (priority = 2)
	public void b() {
		System.out.println("This Is The Test Case b");
	}
	
	@Ignore
	@Test (priority = 3)
	public void d() {
		System.out.println("This Is The Test Case d");
	}
	
}
