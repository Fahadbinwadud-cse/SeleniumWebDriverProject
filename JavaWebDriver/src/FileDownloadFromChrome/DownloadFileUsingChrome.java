package FileDownloadFromChrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DownloadFileUsingChrome {

	public static void main(String[] args) {
		//Initiate driver
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Fahad\\Documents\\Eclipse\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//Maximize chrome window
		driver.manage().window().maximize();
		//Open url of web application
		driver.get("https://demo.automationtesting.in/FileDownload.html");
		//select textbox element and write some text using sendKeys() method
		driver.findElement(By.id("textbox")).sendKeys("Hello.I am there");
		//click on Generate text button file and show download file
		driver.findElement(By.id("createTxt")).click();
		// Download text file
		driver.findElement(By.id("link-to-download")).click();
		
		//Download pdf files on chrome browser
		
		//Select textbox element ; all html element are WebElement 
		driver.findElement(By.xpath("//*[@id=\"pdfbox\"]")).sendKeys("Hello.I'm new at automation testing.");
		// Generate pdf file  
		driver.findElement(By.xpath("//*[@id=\"createPdf\"]")).click();
		// Download pdf file on the chrome browser
		driver.findElement(By.xpath("//*[@id=\"pdf-link-to-download\"]")).click();
		
		
	}

}
