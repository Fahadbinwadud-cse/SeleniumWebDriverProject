package DropDownTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class VerifyDropdownSortedOptions {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Fahad\\Documents\\Eclipse\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		WebElement element = driver.findElement(By.id("animals"));
		Select se = new Select(element);
		List originalList = new ArrayList();
		List tempList = new ArrayList();
		List <WebElement> options = se.getOptions();
		for(WebElement e : options) {
			originalList.add(e.getText());
			tempList.add(e.getText());
		}
		System.out.println("Before sorted orginalList is  : "+originalList);
		//tempList = originalList;
		System.out.println("Before sorting tempList is  : "+originalList);
		Collections.sort(tempList);
		System.out.println("After sorting tempList is : "+originalList);
		System.out.println("After sorting tempList is "+tempList);
		if(tempList.equals(originalList)) {
			System.out.println("Dropdown is sorted");
		}
		else {
			System.out.println("Dropdown is unsorted");
		}
		driver.close();
	}
	
	

}
