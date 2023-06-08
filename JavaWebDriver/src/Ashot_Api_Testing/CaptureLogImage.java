package Ashot_Api_Testing;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;

public class CaptureLogImage {
	public static void main(String[] args) throws IOException {
		//set and initiate driver 
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Fahad\\Documents\\Eclipse\\chromedriver_win32\\chromedriver.exe");
		// invoke the browser
		WebDriver driver = new ChromeDriver();
		//maximize the browser window
		driver.manage().window().maximize();
		//open url
		driver.get("https://demo.automationtesting.in/Register.html");
		//select image
		WebElement logImageElement = driver.findElement(By.xpath("//*[@id=\"imagetrgt\"]"));
		// take screenshot image through the Ashot() method
		Screenshot logoImageScreenshot =  new AShot().takeScreenshot(driver, logImageElement);
		// get image , image format , image directory or saving path
		ImageIO.write(logoImageScreenshot.getImage(),"png",new File("C:\\Users\\Fahad\\Documents\\Eclipse\\Ashot Api\\image.png"));
		// image path store in file variable
		File f = new File("C:\\Users\\Fahad\\Documents\\Eclipse\\Ashot Api\\image.png");
		// check the path exist or not exists() is method
		if(f.exists()) {
			System.out.println("Image File Captured");
		}
		else {
			System.out.println("Image File not exist");
		}
	}

}
