package Assertion;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertionDemoTest {
	// each and every test method using  different soft assertion object 
	// one object can't used different Test method bcoz first test method is failed
	SoftAssert softassert = new SoftAssert();
	@Test
	public void  demoTest_One() {
		softassert.assertEquals("wel","wel");//false failed
		softassert.assertAll();
	}
	@Test
	public void demoTest_Two() {
		softassert.assertEquals("Selenium", "selenium");//true passed
		softassert.assertAll();
	}

}
