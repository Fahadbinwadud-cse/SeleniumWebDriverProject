package Assertion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest {
	@Test
	public void flightReservationLogin()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Fahad\\Documents\\Eclipse\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/newtours/index.php");
		WebElement userNameText = driver.findElement(By.name("userName"));
		WebElement userPassword = driver.findElement(By.name("password"));
		
		//This is to check whether the textbox is displayed or not 
		//Test will only continue , if the below statement is true
		Assert.assertTrue(userNameText.isDisplayed());
		userNameText.sendKeys("mercury");
		
		Assert.assertTrue(userPassword.isDisplayed());
		userPassword.sendKeys("mercury");
		
		// this assertion is opposite from asserTrue() method when it's return false then below statement execute
		// this is basically negative command
		/*Assert.assertFalse(userNameText.isDisplayed());
		userNameText.sendKeys("fahad");
		
		Assert.assertFalse(userPassword.isDisplayed());
		userPassword.sendKeys("fahad");*/
		
		driver.findElement(By.name("submit")).click();
		
		String  expTitle = "Login: Mercury Tours";
		
		Assert.assertEquals(expTitle,driver.getTitle());//compare both the title
		System.out.println("Program is completed");
		driver.quit();
		
	}
	
}
