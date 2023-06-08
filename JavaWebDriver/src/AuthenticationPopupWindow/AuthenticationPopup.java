package AuthenticationPopupWindow;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public abstract class AuthenticationPopup {
	public static void main(String[] args) {
		System.setProperty("webdriver.firefox.driver","C:\\Users\\Fahad\\Documents\\Eclipse\\geckodriver-v0.33.0-win-aarch64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://the-internet.herokuapp.com/basic_auth");
		// how to access authentication popup windows
		// http://username:password@URL [ rest of the url path]
		driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
		String text = driver.findElement(By.cssSelector("p")).getText();
		System.out.println(text);
	}

}
