package Ashot_Api_Testing;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.comparison.ImageDiff;
import ru.yandex.qatools.ashot.comparison.ImageDiffer;

public class CompareImage {

	public static void main(String[] args) throws IOException {
		//set and initiate driver 
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Fahad\\Documents\\Eclipse\\chromedriver_win32\\chromedriver.exe");
		// invoke the browser
		WebDriver driver = new ChromeDriver();
		//maximize the browser window
		driver.manage().window().maximize();
		//open url
		driver.get("https://demo.automationtesting.in/Register.html");
		
		BufferedImage expectedImage =ImageIO.read(new File("C:\\Users\\Fahad\\Documents\\Eclipse\\Ashot Api\\Inkedimage.jpg"));
		WebElement logoImageElement = driver.findElement(By.xpath("//*[@id=\"imagetrgt\"]"));
		Screenshot logoImageScreenShot = new AShot().takeScreenshot(driver, logoImageElement);
		
		BufferedImage actualImage = logoImageScreenShot.getImage();
		
		ImageDiffer imgDiff = new ImageDiffer();
		ImageDiff diff = imgDiff.makeDiff(expectedImage, actualImage);
		//this will  compare two image
		if(diff.hasDiff()==true) {
			System.out.println("Image are not same");
		}else {
			System.out.println("Image are same");
		}
	}

}
