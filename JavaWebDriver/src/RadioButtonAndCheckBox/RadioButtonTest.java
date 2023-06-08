package RadioButtonAndCheckBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButtonTest {
	public static void main(String[] args) {
		System.setProperty("webdriver.firefox.driver","C:\\Users\\Fahad\\Documents\\Eclipse\\geckodriver-v0.33.0-win-aarch64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		// Select Radio Button
		if(driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[5]/div/label[1]/input")).isSelected()==false) {
			driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[5]/div/label[1]/input")).click();
		}
		
	}
}
