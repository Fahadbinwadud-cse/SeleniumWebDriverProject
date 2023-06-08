package HandlingBrowser;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SwitchingWindows {
	public static void main(String[] args) {
		System.setProperty("webdriver.firefox.driver","C:\\Users\\Fahad\\Documents\\Eclipse\\geckodriver-v0.33.0-win-aarch64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.findElement(By.xpath("/html/body/header/nav/div/div[2]/ul/li[4]/a")).click();
		driver.findElement(By.xpath("/html/body/header/nav/div/div[2]/ul/li[4]/ul/li[2]/a")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[1]/a")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div[1]/a/button")).click();
		//System.out.println(driver.getTitle());
		Set <String> s = driver.getWindowHandles();
		for(String i:s) {
			System.out.println(i);
			String t = driver.switchTo().window(i).getTitle();
			if(t.contains("Selenium")) {
				driver.close();
			}
		}
		
	}
}
