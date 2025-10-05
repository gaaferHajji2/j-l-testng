package jafarloka;

import org.testng.annotations.Test;

public class JLokaTestGroup {

	@Test(groups = {"test-01", "test-04"})
	public void jLoka01() {
		System.out.println("Call From JLoka-01");
	}
	
	@Test(groups = "test-01")
	public void jLoka02() {
		System.out.println("Call From JLoka-02");
	}
	
	@Test(groups = {"test-02", "test-04"})
	public void jLoka03() {
		System.out.println("Call From JLoka-03");
	}
	
	@Test(groups = "test-02")
	public void jLoka04() {
		System.out.println("Call From JLoka-04");
	}
	
	@Test(groups = "test-03")
	public void jLoka05() {
		System.out.println("Call From JLoka-05");
	}
	
}
