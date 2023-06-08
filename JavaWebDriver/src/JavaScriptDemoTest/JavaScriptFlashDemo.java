package JavaScriptDemoTest;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptFlashDemo {

	public static void main(String[] args) throws IOException {
		//initiate driver
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Fahad\\Documents\\Eclipse\\chromedriver_win32\\chromedriver.exe");
		//invoke browser
		WebDriver driver = new ChromeDriver();
		//maximize the browser window
		driver.manage().window().maximize();
		//open url
		driver.get("https://www.twoplugs.com/");
		// select login button element
		//WebElement joinfree = driver.findElement(By.xpath("/html/body/div/header/div/ul/li[2]/a"));
		//Flashing
		//JavaScriptUtil.flash(joinfree, driver);
		//Drawing border
		/*JavaScriptUtil.drawBorder(joinfree, driver);
		// Captue Screenshot
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File trg = new File("C:\\Users\\Fahad\\Documents\\Eclipse\\Capute Screenshot\\twoplugs.png");
		FileUtils.copyFile(src, trg);*/
		//Capture title of page 
		//System.out.println(driver.getTitle());
		//String title = JavaScriptUtil.getTitleByJS(driver);
		//System.out.println(title);
		// Login button click()
		//WebElement loginbtn = driver.findElement(By.xpath("/html/body/div[1]/header/div/ul/li[1]/a"));
		//JavaScriptUtil.clickElementByJS(loginbtn, driver);
		// Generate alert box call method
		//JavaScriptUtil.generateAlert(driver,"You click on login button....");
		// Refreshing page
		//driver.navigate().refresh();
		//JavaScriptUtil.refreshBrowserByJS(driver);
		//Scrolling and find element
		WebElement image = driver.findElement(By.xpath("/html/body/div/section[4]/div[2]/ul/li[1]/div[1]/img"));
		//JavaScriptUtil.scrollIntoView(image, driver);
		JavaScriptUtil.scrollPageDown(driver);
		
	}

}
