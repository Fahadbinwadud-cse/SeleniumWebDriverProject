package HandlingWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class AnotherOneDropDownTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.firefox.driver","C:\\Users\\Fahad\\Documents\\Eclipse\\geckodriver-v0.33.0-win-aarch64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		WebElement dropCountry = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div/div[2]/div/div/div/p/select"));
		Select se = new Select(dropCountry);
		//se.selectByIndex(4);
		//se.selectByValue("DZA");
		se.selectByVisibleText("Bangladesh");
		int numOfCountry = se.getOptions().size();
		System.out.println(numOfCountry);
	
	}

}
