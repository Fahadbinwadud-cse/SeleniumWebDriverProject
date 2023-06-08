package Selenium.webdriver.basictest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinkTest {
	public static void main(String[] args) {
		System.setProperty("webdriver.firefox.marionette", "C:\\Users\\Fahad\\Documents\\Eclipse\\geckodriver-v0.33.0-win-aarch64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://demo.guru99.com/test/newtours/index.php");
		driver.findElement(By.linkText("REGISTER")).click();
		String exp_registerTitle = "Register: Mercury Tours";
		String act_reg_Title = driver.getTitle();
		System.out.println(act_reg_Title);
		if(exp_registerTitle.equals(act_reg_Title)) {
			System.out.println("Register Title test case is Pass");
		}
		else {
			System.out.println("Register Title test case is Failed");
		}
		driver.close();
	}
}
