package jafarloka;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestDataProvider {

	@Test(dataProvider = "getAllData")
	public void testDataProvider(String jL01, String jL02) {
		System.out.println("The jL01 is: " + jL01);
		System.out.println("The jL02 is: " + jL02);
	}
	
	@DataProvider
	public Object[][] getAllData() {
		
		Object[][] arr = new Object[2][2];
		
		arr[0][0] = "JLoka-01";
		arr[0][1] = "JLoka-02";
		
		arr[1][0] = "JLoka-03";
		arr[1][1] = "JLoka-04";
		
		return arr;
	}
	
}
