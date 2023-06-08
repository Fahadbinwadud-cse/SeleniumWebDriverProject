package TestNG_All_Demo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependenceExample {
	@Test
	void startCar() {
		System.out.println("Car started");
		Assert.fail();
	}
	//dependsOnMethods annotation it's depends on method 
	@Test(dependsOnMethods= {"startCar"})
	void driveCar() {
		System.out.println("Car driving");
	}
	@Test(dependsOnMethods= {"startCar"})
	void stopCar() {
		System.out.println("Car stopped");
	}
	// alwaysRun annotation is run this method anyway 
	@Test(dependsOnMethods= {"driveCar","stopCar"},alwaysRun = true)
	void parkCar() {
		System.out.println("Car parked");
	}
}
