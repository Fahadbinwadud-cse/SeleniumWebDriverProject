package JavaScriptDemoTest;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavaScriptUtil {
	// button flashing method, in this here all method are static so we call methods through this class name
	public static void flash(WebElement element, WebDriver driver) {
		String bgColor = element.getCssValue("backgroundColor");
		for(int i=0 ;i<500;i++) {
			changeColor("#000000",element,driver);
			changeColor(bgColor,element,driver);
		}
	}
	// changeColor method
	public static void changeColor(String color,WebElement element, WebDriver driver) {
		JavascriptExecutor js =((JavascriptExecutor)driver);
		js.executeScript("arguments[0].style.backgroundColor ='"+ color +"'",element);
		try {
			Thread.sleep(20);
		}catch(InterruptedException e){
			
		}
	}
	// drawing the web element boarder
	public static void drawBorder(WebElement element, WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].style.border='3px solid red'", element);
	}
	// js title
	public static String getTitleByJS(WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		String title = js.executeScript("return document.title;").toString();
		return title;
	}
	// javascript click method click() this method internally work 
	public  static void clickElementByJS(WebElement element, WebDriver driver){
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].click();", element);
	}
	//Generate alert box
	public static void generateAlert(WebDriver driver,String messgae) {
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("alert('"+ messgae + "')");
	}
	// Refreshing method using Javascript 
	public static void  refreshBrowserByJS(WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("history.go(0)");
	}
	// Scrolling  select element using java script method
	public static void scrollIntoView(WebElement element, WebDriver driver) {
		JavascriptExecutor js =( (JavascriptExecutor)driver);
		js.executeScript("arguments[0].scrollIntoView(true);",element);
	}
	// scrolling down of the page
	public static void scrollPageDown(WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	}
	
}
