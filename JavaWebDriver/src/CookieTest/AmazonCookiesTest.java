package CookieTest;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonCookiesTest {
	public static void main(String[] args) {
		//initiate driver
		System.setProperty("webdriver.chromedriver.driver","C:\\Users\\Fahad\\Documents\\Eclipse\\chromedriver_win32\\chromedriver.exe");
		//invoke to the browser
		WebDriver driver = new ChromeDriver();
		// maximize the browser window
		driver.manage().window().maximize();
		//open url
		driver.get("https://www.amazon.com/ref=nav_logo");
		//Capture all the cookies from browser
		Set<Cookie> cookies = driver.manage().getCookies();
		int noOfCookie = cookies.size();
		System.out.println("Total number of cookie : "+noOfCookie);
		//Read and print all the cookies
		/*for(Cookie cookie : cookies) {
			System.out.println(cookie.getName()+" : "+cookie.getValue());
		}*/
		//print specific cookie according to cookie Name
		//System.out.println(driver.manage().getCookieNamed("session-id-time"));
		//Add new cookie to the browser
		Cookie coObj = new Cookie("MyCookieIs","1234567890");
		driver.manage().addCookie(coObj);
		cookies = driver.manage().getCookies(); 
		System.out.println("Total number of cookes after then add cookes : "+cookies.size());
		//read and print Name and value all the cookie
		for(Cookie cookie:cookies) {
			System.out.println(cookie.getName()+" : "+cookie.getValue());
		}
		//Delete specific cookie
		driver.manage().deleteCookie(coObj);
		cookies = driver.manage().getCookies();
		System.out.println("Size of cookie : "+cookies.size());
		//Delete all cookies
		driver.manage().deleteAllCookies();
		cookies = driver.manage().getCookies();
		System.out.println("No. of cookies : "+cookies.size());
		// Close the browser window
		driver.quit();
		
	}

}
