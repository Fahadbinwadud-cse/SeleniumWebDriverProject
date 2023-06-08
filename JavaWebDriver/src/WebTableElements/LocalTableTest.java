package WebTableElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LocalTableTest {
	public static void main(String[] args) {
		System.setProperty("webdriver.firefox.driver","C:\\Users\\Fahad\\Documents\\Eclipse\\geckodriver-v0.33.0-win-aarch64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("C:\\Users\\Fahad\\Desktop\\SQA\\Selenium Files\\Table.html");
		//List<WebElement> rows = driver.findElements(By.xpath("/html/body/table/tbody/tr"));
		int rows = driver.findElements(By.xpath("/html/body/table/tbody/tr")).size();
		System.out.println(rows);
		int cols = driver.findElements(By.xpath("/html/body/table/tbody/tr/th")).size();
		System.out.println(cols);
		for(int i =2;i<=rows;i++) {
			for(int j=1;j<=cols;j++) {
				System.out.print(driver.findElement(By.xpath("/html/body/table/tbody/tr["+i+"]/td["+j+"]")).getText()+" ");
			}
			System.out.println();
		}
		
	}
}
