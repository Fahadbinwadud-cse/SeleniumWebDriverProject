package WebDriverCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetCommands {
	public static void main(String[] args) {
		System.setProperty("webdriver.firefox.marionette","C:\\Users\\Fahad\\Documents\\Eclipse\\geckodriver-v0.33.0-win-aarch64//geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://demo.guru99.com/test/newtours/index.php");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		String text = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[1]/td/font/b")).getText();
		// return webElement text using method after method used .getText() method
		System.out.println(text);
		driver.close();
	}

}
