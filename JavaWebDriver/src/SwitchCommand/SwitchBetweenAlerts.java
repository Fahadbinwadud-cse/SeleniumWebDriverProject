package SwitchCommand;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SwitchBetweenAlerts {
	public static void  main(String[] args) {
		System.setProperty("webdriver.firefox.driver","C:\\Users\\Fahad\\Documents\\Eclipse\\geckodriver-v0.33.0-win-aarch64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		// Alert with ok link
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[1]/a")).click();
		// Alert with ok Button
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div[1]/button")).click();
		// switch to alert box and retrieved data from alert box
		String alertText = driver.switchTo().alert().getText();
		// ok button click and close the alert 
		driver.switchTo().alert().accept();
		System.out.println(alertText);
		
		
		
	}

}
