package MercuryTourWebApplication;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
	// HasMap checking
	static HashMap<String,String> loginData(){
		HashMap<String,String> hm = new HashMap<String,String>();
		hm.put("x","mercury@mercury");
		hm.put("y","mercury1@mercury1");
		hm.put("z","mercury2@mercury2");
		return hm;
	}

	public static void main(String[] args) {
		
		System.setProperty("webdrive.chrome.driver","C:\\Users\\Fahad\\Documents\\Eclipse\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/newtours/index.php");
		String credentials = loginData().get("y");
		String arr[] = credentials.split("@");
		driver.findElement(By.name("userName")).sendKeys(arr[0]);
		driver.findElement(By.name("password")).sendKeys(arr[1]);
		driver.findElement(By.name("submit")).click();
		if(driver.getTitle().equals("Login: Mercury Tours")==true){
			System.out.print("The Test case is passed");
		}else {
			System.out.println("The test case is failed");
		}
		driver.quit();
	}

}
