package Assertion;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertionExample {
	//create a soft assertion object
	SoftAssert softAssertion = new SoftAssert();
	
	@Test
	public void  soft_Test()
	{
		softAssertion.assertTrue(true);//passed
		softAssertion.assertEquals("Welcome", "welcome");//false -> failed 
		softAssertion.assertEquals("selenium","selenium");
		System.out.println("program is executed");
		softAssertion.assertAll();
	}

}
