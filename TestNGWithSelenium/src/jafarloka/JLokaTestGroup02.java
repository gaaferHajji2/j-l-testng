package jafarloka;

import org.testng.annotations.Test;

public class JLokaTestGroup02 {

	@Test(groups= {"test-04", "test-05"})
	public void jLoka06() {
		System.out.println("Call From Another class with JLoka-06");
	}
	
}
