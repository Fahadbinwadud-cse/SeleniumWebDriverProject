package HandlingWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class RegisterForm {
	public static void main(String[] args) {
		System.setProperty("webdriver.firefox.driver","C:\\Users\\Fahad\\Documents\\Eclipse\\geckodriver-v0.33.0-win-aarch64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		// firstName , lastName, address, emailAddress, phone, Country
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[1]/div[1]/input")).sendKeys("fahad");
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[1]/div[2]/input")).sendKeys("bin wadud");
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[2]/div/textarea")).sendKeys("Ramganj,Lakshmipur");
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[3]/div[1]/input")).sendKeys("fahad@gmail.com");
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[4]/div/input")).sendKeys("019423423423");
		
		// Select Country Name
		WebElement lang = driver.findElement(By.id("Skills"));
		Select se = new Select(lang);
		se.selectByIndex(4);
	
	}
	
	
}
