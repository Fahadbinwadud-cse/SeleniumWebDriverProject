package WebTableElements;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Calendar {
	public static void main(String[] args) {
		System.setProperty("webdriver.firefox.driver","C:\\Users\\Fahad\\Documents\\Eclipse\\geckodriver-v0.33.0-win-aarch64\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.timeanddate.com/date/duration.html?d1=19&m1=7&y1=2023&d2=&m2=&y2=&ti=on&");
		driver.findElement(By.xpath("/html/body/div[5]/main/article/div[1]/div/div/div/form/div[1]/div[3]/div/div[4]/button")).click();
		for(int y=1;y<=6;y++) {
			driver.findElement(By.xpath("/html/body/div[7]/div/div[2]/div[1]/span[2]/a[1]")).click();
			String year = driver.findElement(By.xpath("/html/body/div[7]/div/div[2]/div[1]/span[2]/a[2]")).getText();
			if(year.equals("2026")) {
				driver.findElement(By.xpath("/html/body/div[7]/div/div[2]/div[1]/span[2]/a[2]")).click();
				for(int m =1;m<=12;m++) {
					driver.findElement(By.xpath("/html/body/div[7]/div/div[2]/div[1]/span[1]/a[3]")).getText();
					String month = driver.findElement(By.xpath("/html/body/div[7]/div/div[2]/div[1]/span[1]/a[2]")).getText();
					if(month.equals("December")) {
						driver.findElement(By.xpath("/html/body/div[7]/div/div[2]/div[2]/div[1]/table/tbody/tr[3]/td[3]/a")).click();
					}
				
				}
			}
		}
		
	}

}
