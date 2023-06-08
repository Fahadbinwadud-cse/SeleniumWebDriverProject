package SwitchCommand;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertwithTextBox {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.firefox.driver","C:\\Users\\Fahad\\Documents\\Eclipse\\geckodriver-v0.33.0-win-aarch64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div[3]/button")).click();
		String expText = "Hello fahad How are you today";
		driver.switchTo().alert().sendKeys("Fahad");
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		String actText = driver.findElement(By.xpath("//*[@id=\"demo1\"]")).getText();
		if(actText.equals(actText)) {
			System.out.println("Textbox Test is passed");
		}
		else {
			System.out.println("Test is failed");
		}
		
	}

}
