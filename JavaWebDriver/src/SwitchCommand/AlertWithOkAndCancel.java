package SwitchCommand;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertWithOkAndCancel {
	public static void main(String[] args) {
		System.setProperty("webdriver.firefox.driver","C:\\Users\\Fahad\\Documents\\Eclipse\\geckodriver-v0.33.0-win-aarch64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		//Alert with ok & cancel
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a")).click();
		String expTextOk = "You pressed Ok";
		//click alert box link
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div[2]/button")).click();
		//switch to alert box and click ok button
		driver.switchTo().alert().accept();
		//retrieved data from alert box
		String actTextOk = driver.findElement(By.xpath("//*[@id=\"demo\"]")).getText();
		if(expTextOk.equals(actTextOk)==true) {
			System.out.println("Ok button Test is passed");
		}
		// Again check the Cancel Button
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div[2]/button")).click();
		String expTextCancel = "You Pressed Cancel";
		// Cancel the button click by dismiss() method
		driver.switchTo().alert().dismiss();
		// retrieved data after clicked 
		String actTextCancel = driver.findElement(By.xpath("//*[@id=\"demo\"]")).getText();
		if(actTextCancel.equals(expTextCancel)==true) {
			System.out.println("Cancel button Test is passed");
		}
	}

}
