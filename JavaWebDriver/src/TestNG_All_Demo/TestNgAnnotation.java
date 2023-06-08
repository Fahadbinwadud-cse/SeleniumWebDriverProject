package TestNG_All_Demo;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgAnnotation {
	@BeforeTest
	public void LoginToApplication() {
		System.out.println("Login to application");
	}
	@BeforeGroups
	public void BeforeGroup() {
		System.out.println("This class will execute before class");
	}
	@BeforeMethod
	public void ConnectToDB() {
		System.out.println("DB Connected");
	}
	
	@Test(priority=1,description="This is a login Test",enabled=false)
	public void Login() {
		System.out.println("Login is successful");
	}
	@Test(priority=2 , description="This is a logout Test")
	public void Logout() {
		System.out.println("Logout is successful");
	}
	@AfterMethod
	public void DisConnectFromDB() {
		System.out.println("Disconnect from DB");
	}
	@AfterTest
	public void LogoutfromApplication() {
		System.out.println("Logout from application");
	}

	
}
