package Selenium.webdriver.basictest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginTest {
	public static void main(String[] args) {
		System.setProperty("webdriver.firefox","C:\\Users\\Fahad\\Documents\\Eclipse\\geckodriver-v0.33.0-win-aarch64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://demo.guru99.com/test/newtours/");//open the url in the browser
		driver.manage().window().maximize();// this statement is  maximize the browser window
		System.out.println("this statement is maximize the browser windows");
		String titleIs = driver.getTitle(); // Return the title of the page
		System.out.println(titleIs);
		driver.findElement(By.name("userName")).sendKeys("mercury");//Firstly findElement in the browser then find the properties base on UI design such that name after write text in textbox	
		driver.findElement(By.name("password")).sendKeys("mercury");
		driver.findElement(By.name("submit")).click();//Click on submit button
		System.out.println(driver.getTitle());// print page title
		// validation
		String expTitle = "Login: Mercury Tours";
		String actTitle = driver.getTitle();//catch the title on the page, // Maybe it's contain " Login: Mercury Tours "
		if(expTitle.equals(actTitle)==true) {
			System.out.println("Login Test case title is Pass");
		}
		else {
			System.out.println("Login Test case title is failed");
		}
		driver.close();// this statement is close the window.
		System.out.println("close the browser window");
	}

}
