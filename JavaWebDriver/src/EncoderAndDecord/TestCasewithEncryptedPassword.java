package EncoderAndDecord;

import org.apache.commons.net.util.Base64;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCasewithEncryptedPassword {
	public static void main(String[] args) {
		// Set and initiate driver
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Fahad\\Documents\\Eclipse\\chromedriver_win32\\chromedriver.exe");
		// invoke browser
		WebDriver driver = new ChromeDriver();
		// maximize the browser window
		driver.manage().window().maximize();
		// open url
		driver.get("https://demo.nopcommerce.com");
		// go to login page so select login page
		driver.findElement(By.linkText("Log in")).click();
		// select email element and write email address
		driver.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys("fahmida@gmail.com");
		// select password element and write into password
		driver.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys(decodeString("dGVzdDEyMw=="));
		// login button click
		driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button")).click();
	}
	static String decodeString(String password) {
		byte[] decodeType= Base64.decodeBase64(password);
		return (new String(decodeType));
	}

}
