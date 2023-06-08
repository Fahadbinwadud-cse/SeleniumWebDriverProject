package DropDownTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SpeedDropDownTest {
	public static void main(String[] args) {
		System.setProperty("webdriver.firefox.driver","C:\\Users\\Fahad\\Documents\\Eclipse\\geckodriver-v0.33.0-win-aarch64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		// Dropdown Test
		WebElement speed = driver.findElement(By.id("speed"));
		Select select = new Select(speed);
		//select.selectByIndex(2);
		select.selectByVisibleText("Fast");
		int noOfItems = select.getOptions().size();
		System.out.println("Total of dropdown items : "+noOfItems);
		
	}

}
