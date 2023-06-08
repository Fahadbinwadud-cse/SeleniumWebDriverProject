package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
	public static void main(String[] args) {
		System.setProperty("webdriver.firefox.driver","C:\\Users\\Fahad\\Documents\\Eclipse\\geckodriver-v0.33.0-win-aarch64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		WebElement source = driver.findElement(By.xpath("//*[@id=\"box5\"]"));
		WebElement target =driver.findElement(By.xpath("//*[@id=\"box105\"]"));
		Actions act = new Actions(driver);
		//act.clickAndHold(source).moveToElement(target).release().build().perform();
		// similar action is dragAnddrop() method
		act.dragAndDrop(source, target).build().perform();
	}

}
