package UploadAndDownloadFileUsingSikuli;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class FileUploadFromChrome {/*
	public static void main(String[] args) throws InterruptedException, FindFailed {
		// initiate driver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Fahad\\Documents\\Eclipse\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//maximize the window
		driver.manage().window().maximize();
		//open url
		driver.get("https://demo.automationtesting.in/Register.html");
		//find element and select element
		driver.findElement(By.xpath("//*[@id=\"imagesrc\"]")).click();
		//define image file path
		String imageFilepath = "C:\\Users\\Fahad\\Documents\\Eclipse\\Sikuli image\\";
		String inputFilepath = "C:\\Users\\Fahad\\Documents\\Eclipse\\Sikuli image\\";
		// Create sekuli screen object
		Screen sc = new Screen();
		// Create Pattern object with parameterize
		Pattern fileInputTextbox = new Pattern(imageFilepath+"FileTextBox.png");
		Pattern openButton = new Pattern(imageFilepath+"OpenButton.png");
		Thread.sleep(5000);
		// three operation
		sc.wait(fileInputTextbox, 20);
		sc.type(fileInputTextbox, inputFilepath+"apple.jpg");
		sc.click(openButton);
	}*/

}
