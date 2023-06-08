package FileUploadUsingAutoIT;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileUploadFromFirefoxBrowser {
	public static void main(String[] args) throws IOException, InterruptedException {
		//initiate driver 
		System.setProperty("webdriver.firefox.driver","C:\\Users\\Fahad\\Documents\\Eclipse\\geckodriver-v0.33.0-win-aarch64\\geckodriver.exe");
		//invoke browser
		WebDriver driver = new FirefoxDriver();
		//open url
		driver.get("https://demo.automationtesting.in/Register.html");
		//select the fileUpload element
		WebElement button = driver.findElement(By.xpath("//*[@id=\"imagesrc\"]"));
		//First round of uploading file
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()",button);
		Runtime.getRuntime().exec("C:\\Users\\Fahad\\Documents\\Eclipse\\AutoIT\\NewFileUpload.exe"+" "+"C:\\Users\\Fahad\\Documents\\Eclipse\\AutoIT\\apple.jpg");
		//Second round of uploading file
		js.executeScript("arguments[0].click()",button);
		Runtime.getRuntime().exec("C:\\Users\\Fahad\\Documents\\Eclipse\\AutoIT\\NewFileUpload.exe"+" "+"C:\\Users\\Fahad\\Documents\\Eclipse\\AutoIT\\Pineapple.png");
	
	
	}

}
