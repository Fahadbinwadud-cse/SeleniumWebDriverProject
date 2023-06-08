package FileUploadUsingAutoIT;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadOnChromeBrowser {
	public static void  main(String[] args) throws IOException, InterruptedException {
		//Initiate driver
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Fahad\\Documents\\Eclipse\\chromedriver_win32\\chromedriver.exe");
		//invoke the browser
		WebDriver driver = new ChromeDriver();
		//maximize  the window
		driver.manage().window().maximize();
		//open url
		driver.get("https://demo.automationtesting.in/Register.html");
		//select upload  file element
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"imagesrc\"]")).sendKeys("C:\\Users\\Fahad\\Desktop\\Fahad picture(Important)\\Applying img.jpg");
		/*WebElement button = driver.findElement(By.id("imagesrc"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", button);
		Runtime.getRuntime().exec("C:\\Users\\Fahad\\Documents\\Eclipse\\AutoIT\\NewFileUpload.exe"+" "+"C:\\Users\\Fahad\\Documents\\Eclipse\\AutoIT\\apple.jpg");
		System.out.println("Code is executed");*/

	}

}
