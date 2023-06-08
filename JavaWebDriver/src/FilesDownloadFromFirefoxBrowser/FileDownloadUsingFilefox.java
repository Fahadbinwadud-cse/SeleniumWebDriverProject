package FilesDownloadFromFirefoxBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileDownloadUsingFilefox {

	public static void main(String[] args) {
		//initiate driver
		System.setProperty("webdriver.firefox.driver","C:\\Users\\Fahad\\Documents\\Eclipse\\geckodriver-v0.33.0-win-aarch64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		//maximize window
		driver.manage().window().maximize();
		//open url
		driver.get("https://demo.automationtesting.in/FileDownload.html");
		//select textbox element
		driver.findElement(By.id("textbox")).sendKeys("Hello.I'm here");
		//Generate text file
		driver.findElement(By.id("createTxt")).click();
		//download file from firefox browser
		driver.findElement(By.id("link-to-download")).click();
	}

}
