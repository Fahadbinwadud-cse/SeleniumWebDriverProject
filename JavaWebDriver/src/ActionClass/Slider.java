package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider {
	public static void main(String[] args) {
		System.setProperty("webdriver.firefox.driver","C:\\Users\\Fahad\\Documents\\Eclipse\\geckodriver-v0.33.0-win-aarch64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://jqueryui.com/slider/");
		//Firstly move to frame after element selection
		driver.switchTo().frame(0);
		// Create a web element variable
		WebElement source = driver.findElement(By.xpath("//*[@id=\"slider\"]"));
		// create action class and object
		Actions act = new Actions(driver);
		act.moveToElement(source).dragAndDropBy(source,300 , 0).build().perform();
		
	}

}
