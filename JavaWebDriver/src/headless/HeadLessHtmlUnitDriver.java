package headless;

import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HeadLessHtmlUnitDriver {
	public static void main(String[] args) {
		HtmlUnitDriver driver = new HtmlUnitDriver();
		driver.get("https://web.facebook.com/?_rdc=1&_rdr");
		System.out.println("Title of the page : "+driver.getTitle());
		System.out.println("The Current URL of the page : "+driver.getCurrentUrl());
	}

}
