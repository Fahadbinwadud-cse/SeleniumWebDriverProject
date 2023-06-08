package Selenium.webdriver.basictest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstTest {

	public static void main(String[] args)
	{
		
		System.setProperty("webdriver.firefox.marionette","C:\\Users\\Fahad\\Documents\\Eclipse\\geckodriver-v0.33.0-win-aarch64\\geckodriver.exe");
		
		//FirefoxDriver driver=new FirefoxDriver(); // Invoke the browser
		
		WebDriver driver = new FirefoxDriver(); // Invoke the browser
		driver.get("https://demo.guru99.com/test/newtours/");//Open URL in the browser
		//driver.findElement(By.name("userName")).sendKeys("mercury");
		//Another type is
		WebElement username =driver.findElement(By.name("userName"));
		username.sendKeys("mercury");//Enter user name
		driver.findElement(By.name("password")).sendKeys("mercury");
		driver.findElement(By.name("submit")).click();//Click on submit button
		String expTitle = "Login: Mercury Tours";
		String actTitle = driver.getTitle();//Return the title of the page
		//Validation
		System.out.println(actTitle);
		if(expTitle==actTitle) {
			System.out.println("Login Test is Pass");
		}
		else {
			System.out.println("Login Test is Failed");
		}
		driver.close();
		
		
	}

}
