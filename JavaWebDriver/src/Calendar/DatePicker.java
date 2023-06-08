package Calendar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DatePicker {
	public  static void main(String[] args) {
		System.setProperty("webdriver.firefox.driver","C:\\Users\\Fahad\\Documents\\Eclipse\\geckodriver-v0.33.0-win-aarch64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.findElement(By.xpath("//*[@id=\"datepicker\"]")).click();
		for(int i=0;i<12;i++) {
			driver.findElement(By.xpath("/html/body/div[5]/div/a[2]/span")).click();
			String month = driver.findElement(By.xpath("/html/body/div[5]/div/div/span[1]")).getText();
			if(month.equals("July")) {
				System.out.println(month);
				driver.findElement(By.linkText("21")).click();
				break;
			}
			
		}
	}

}
