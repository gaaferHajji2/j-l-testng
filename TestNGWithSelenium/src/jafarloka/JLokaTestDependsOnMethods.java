package jafarloka;

import org.testng.Assert;
import org.testng.annotations.Test;

public class JLokaTestDependsOnMethods {

	@Test(dependsOnMethods = {"test2"})
	public void test1() {
		System.out.println("JLoka-01 Test-02");
		
	}
	
	@Test
	public void test2() {
		System.out.println("JLoka-01 Test-01");
		Assert.assertEquals(true, true);
	}
	
}
