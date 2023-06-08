package headless;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadLessChrome {
	public static void main(String[] args)
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Fahad\\Documents\\Eclipse\\chromedriver_win32\\chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions(); // Create an object of Chrome Headless
		//options.setHeadless(true); // below and this statement both are working similar.So you will anyone
		options.addArguments("--headless");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.google.com/");
		String expTitle = "Google";
		String actTitle = driver.getTitle();
		if(expTitle.equals(actTitle)) {
			System.out.println("Title of the page : "+ driver.getTitle());

		}
		else {
			System.out.println("Not found of page."+driver.getTitle());
		}
		System.out.println(driver.getCurrentUrl());
		
	}
}
