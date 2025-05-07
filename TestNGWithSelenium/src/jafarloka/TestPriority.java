package jafarloka;

import org.testng.annotations.Test;

public class TestPriority {

	@Test(priority = 1)
	public void a() {
		System.out.println("This Is The Test Case a");
	}
	
	@Test(priority = 2)
	public void c() {
		System.out.println("This Is The Test Case c");
	}
	
	@Test (priority = 4)
	public void b() {
		System.out.println("This Is The Test Case b");
	}
	
	@Test (priority = 3)
	public void d() {
		System.out.println("This Is The Test Case d");
	}
}
