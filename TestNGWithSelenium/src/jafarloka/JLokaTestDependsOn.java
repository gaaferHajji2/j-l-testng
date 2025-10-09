package jafarloka;

import org.testng.Assert;
import org.testng.annotations.Test;

public class JLokaTestDependsOn {

	@Test(dependsOnMethods = {"test2"})
	public void test1() {
		System.out.println("JLoka-01 Test-02");
		
	}
	
	@Test(dependsOnGroups = {"t-01"})
	public void test2() {
		System.out.println("JLoka-01 Test-01");
		Assert.assertEquals(true, true);
	}
	
	@Test(groups = "t-01")
	public void test3() {
		System.out.println("JLoka-01 Test-03 group-01");
	}
	
	@Test(groups= "t-01")
	public void test4() {
		System.out.println("JLoka-01 Test-03 group-02");
	}
}
