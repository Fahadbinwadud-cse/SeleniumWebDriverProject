package ScrollingTest;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling {
	public static void main(String[] args) {
		//initiate driver
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Fahad\\Documents\\Eclipse\\chromedriver_win32\\chromedriver.exe");
		//invoke the browser
		WebDriver driver = new ChromeDriver();
		//maximize the window
		driver.manage().window().maximize();
		//open url
		driver.get("https://www.countries-ofthe-world.com/flags-of-the-world.html");
		//create temporary java script object
		JavascriptExecutor js = (JavascriptExecutor)driver;
		//Scroll by using pixel
		//js.executeScript("window.scrollBy(0,1000)","");
		//Scroll page till we find element
		//WebElement flag = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div[2]/div[2]/div[2]/table[1]/tbody/tr[16]/td[1]/img"));
		//js.executeScript("arguments[0].scrollIntoView()",flag);
		// Scroll page till bottom
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		
	}

}
