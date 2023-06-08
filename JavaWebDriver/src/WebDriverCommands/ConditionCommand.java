package WebDriverCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ConditionCommand {

	public static void main(String[] args) {
		System.setProperty("webdriver.firefox.driver","C:\\Users\\Fahad\\Documents\\Eclipse\\geckodriver-v0.33.0-win-aarch64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/pages/create/?ref_type=registration_form");
		WebElement email = driver.findElement(By.xpath("//*[@id=\"email\"]"));
		WebElement pass = driver.findElement(By.xpath("//*[@id=\"pass\"]"));
		if(email.isDisplayed() && email.isEnabled()) 
		{// isDisplaye() is element in the page or not return true and false and isEnable method text box is activate write to text on the text box
			email.sendKeys("fahad@gmail.com");// sendKesy() is write text on text box
		}
		if(pass.isDisplayed() && pass.isEnabled()) {
			pass.sendKeys("fahad");
		}
	}

}
