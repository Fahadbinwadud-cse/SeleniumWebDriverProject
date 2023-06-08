package RadioButtonAndCheckBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Checkbox {

	public static void main(String[] args) {
		System.setProperty("webdriver.firefox.driver","C:\\Users\\Fahad\\Documents\\Eclipse\\geckodriver-v0.33.0-win-aarch64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		// Select the checkbox
		driver.findElement(By.xpath("//*[@id=\"checkbox1\"]")).click();
		driver.findElement(By.id("checkbox2")).click();
		driver.findElement(By.id("checkbox2")).click();
	}

}
