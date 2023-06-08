package TestNG_All_Demo;

import org.testng.annotations.Test;

public class GroupTestNg {
	// groups annotation properties which type group methods we run
	@Test(groups= {"sanity"})
	public void test_One() 
	{
		System.out.println("This is test 1");
	}
	
	@Test(groups= {"sanity","regression"})
	public void Test_Two() {
		System.out.println("This is test 2");
	}
	
	@Test(groups= {"regression"})
	public void Test_Three() {
		System.out.println("this is test 3");
	}
	@Test(groups= {"sanity","regression"})
	public void  Test_Four()
	{
		System.out.println("This is test 4");
	}

}
