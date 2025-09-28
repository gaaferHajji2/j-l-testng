package jafarloka;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestParametersWithTestNG {

	@Parameters({"jloka01", "jloka02"})
	@Test
	public void testParameters(String jloka01, String jloka02) {
		System.out.println("The jloka01 is: " + jloka01);
		
		System.out.println("The jloka02 is: " + jloka02);
	}
	
}
