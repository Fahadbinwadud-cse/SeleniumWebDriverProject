package PracticeForm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class StudentRegistrationForm {
	public static void main(String[] args) {
		System.setProperty("webdriver.firefox.marionette","C:\\Users\\Fahad\\Documents\\Eclipse\\geckodriver-v0.33.0-win-aarch64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://demo.guru99.com/test/newtours/index.php");
		driver.findElement(By.name("userName")).sendKeys("Nilima");
		/*driver.findElement(By.id("userEmail")).sendKeys("nilima@gmail.com");
		driver.findElement(By.id("currentAddress")).sendKeys("Kustiya");
		driver.findElement(By.id("permanentAddress")).sendKeys("Dhaka");*/
		//driver.findElement(By.id("submit")).click();
	}
}
