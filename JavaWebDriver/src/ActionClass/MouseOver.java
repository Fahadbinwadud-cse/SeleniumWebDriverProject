package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver {

	public static void main(String[] args) {
		System.setProperty("webdriver.firefox.driver","C:\\Users\\Fahad\\Documents\\Eclipse\\geckodriver-v0.33.0-win-aarch64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://demo.automationtesting.in/Index.html");
		//login application
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("fahad@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"enterimg\"]")).click();
		// Create Action class and object
		Actions act = new Actions(driver);
		
		WebElement swTo = driver.findElement(By.xpath("/html/body/header/nav/div/div[2]/ul/li[4]/a"));
		WebElement wind = driver.findElement(By.xpath("/html/body/header/nav/div/div[2]/ul/li[4]/ul/li[2]/a"));
		
		//act.moveToElement(swTo).build().perform();//mouse to switch to  tab
		//act.moveToElement(wind).click().build().perform();//mouse over to windows and click operation
		
		// all work in a single  statement
		act.moveToElement(swTo).moveToElement(wind).click().build().perform();		
	}

}
