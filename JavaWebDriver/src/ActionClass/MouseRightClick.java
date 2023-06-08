package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseRightClick {
	public static void main(String[] args) {
		System.setProperty("webdriver.firefox.driver","C:\\Users\\Fahad\\Documents\\Eclipse\\geckodriver-v0.33.0-win-aarch64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		//Mouse right click operation
		Actions act = new Actions(driver);
		WebElement button = driver.findElement(By.xpath("/html/body/div[1]/section/div/div/div/p/span"));
		//Right click on the element
		act.contextClick(button).build().perform();
		//click the copy option
		driver.findElement(By.xpath("/html/body/ul/li[7]/span")).click();
		//Capture the text from the copy alert box
		String  copyText = driver.switchTo().alert().getText();
		System.out.println(copyText);
		driver.switchTo().alert().accept();
	}
}
