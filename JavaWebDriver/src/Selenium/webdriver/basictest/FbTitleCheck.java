package Selenium.webdriver.basictest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FbTitleCheck {
	public static void main(String[] args) {
		System.setProperty("webdriver.firefox.fb","C:\\Users\\Fahad\\Documents\\Eclipse\\geckodriver-v0.33.0-win-aarch64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://web.facebook.com/?_rdc=1&_rdr");
		String actfbTitle = "Facebook – log in or sign up";
		String expfbTitle = driver.getTitle();
		if(actfbTitle.equals(expfbTitle)) {
			System.out.println("Fb title test case is Passed");
		}
		else {
			System.out.println("Fb title test case is Failed");
		}
		//driver.close();
		
	}
}
