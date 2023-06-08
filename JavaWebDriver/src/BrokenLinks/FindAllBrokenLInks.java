package BrokenLinks;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindAllBrokenLInks {
	public static void main(String[] args) throws InterruptedException, IOException {
		
		//Initiate driver
		System.setProperty("webdriver.firefox.driver","C:\\Users\\Fahad\\Documents\\Eclipse\\geckodriver-v0.33.0-win-aarch64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		//Maximize page
		driver.manage().window().maximize();
		
		//Implicit wait for 10 second
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		//open URL of webapplication
		
		driver.get("https://demo.guru99.com/test/newtours/index.php");
		
		//Wait
		Thread.sleep(3000);
		
		//Capture links from a webpage 
		List <WebElement> links = driver.findElements(By.tagName("a"));
		
		//Number of links
		int link_size = links.size();
		System.out.println(link_size);
		
		for(int i=0;i<links.size();i++) {
			//by using href attribute we can get URL of required link
			WebElement element = links.get(i);
			String url =element.getAttribute("href");
			URL link = new URL(url);
			//Create a connection using url object 'link'
			HttpURLConnection httpconn = (HttpURLConnection) link.openConnection();
			//Wait time 2 seconds
			Thread.sleep(2000);
			//establish connection
			httpconn.connect();
			int rescod = httpconn.getResponseCode();//Return response code. 
													//if  response code is above 400: its broken link
			if(rescod>=400) {
				System.out.println(url+"-"+" is broken link");
			}
			else {
				System.out.print(url+"-"+" is valid link");
			}
			System.out.println();
			
		}
	}

}
