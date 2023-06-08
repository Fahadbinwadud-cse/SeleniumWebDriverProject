package UploadAndDownloadFileUsingSikuli;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class SikuliTest {
	public static void main(String[] args) throws InterruptedException, FindFailed {
		//initiate driver
		System.setProperty("webdriver.firefox.driver","C:\\Users\\Fahad\\Documents\\Eclipse\\geckodriver-v0.33.0-win-aarch64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		// open url 
		driver.get("https://demo.automationtesting.in/Register.html");
		// maximize the browser window
		driver.manage().window().maximize();
		// Select element
		driver.findElement(By.xpath("//*[@id=\"imagesrc\"]")).sendKeys("C:\\Users\\Fahad\\Documents\\Eclipse\\Sikuli image\\apple.jpg");
				
	
		
	}

}
