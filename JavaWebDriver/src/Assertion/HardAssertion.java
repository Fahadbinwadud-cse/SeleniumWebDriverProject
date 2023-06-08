package Assertion;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertion {
	@Test
	void  test_One() {
		Assert.assertTrue(true);//passed
		Assert.assertEquals("welcome","welcome"); //true - passed
		//Assert.assertTrue(false);
		Assert.assertEquals("Selenium","Selenium");
		System.out.println("Successfully passed");
	}
 
}
