package DataDrivenTests;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class RegistrationTourForm {
	public  static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.firefox.driver","C:\\Users\\Fahad\\Documents\\Eclipse\\geckodriver-v0.33.0-win-aarch64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://demo.guru99.com/test/newtours/index.php");
		//driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/a")).click();
		//driver.findElement(By.linkText("REGISTER")).click();
		// Getting Data from Excel Sheet
		FileInputStream file = new FileInputStream("C:\\Users\\Fahad\\Desktop\\SQA\\Selenium Files\\Data Driven Tests Files\\Registration.xlsx");
		// Get the workbook instance for XLS file
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		// Get first sheet from the workbook
		XSSFSheet sheet = workbook.getSheet("Registration");
		//Get last data row number from the sheet
		int noOfRows = sheet.getLastRowNum();
		System.out.println("Number of records in the excel sheet : "+noOfRows);
		for(int row =1;row<=noOfRows;row++) {
			XSSFRow current_row = sheet.getRow(row);// Focus in the current row
			
			String First_Name = current_row.getCell(0).toString();
			String Last_Name = current_row.getCell(1).toString();
			String Phone = current_row.getCell(2).toString();
			String Email = current_row.getCell(3).toString();
			String Address = current_row.getCell(4).toString();
			String City = current_row.getCell(5).toString();
			String State = current_row.getCell(6).toString();
			String Postal_Code = current_row.getCell(7).toString();
			String Country = current_row.getCell(8).toString();
			String User_name = current_row.getCell(9).toString();
			String Password = current_row.getCell(10).toString();
			String Confirm_password = current_row.getCell(11).toString();
			
			// Registration Process
			driver.findElement(By.linkText("REGISTER")).click();
			
			// Entering contact information
			driver.findElement(By.name("firstName")).sendKeys(First_Name);
			driver.findElement(By.name("lastName")).sendKeys(Last_Name);
			driver.findElement(By.name("phone")).sendKeys(Phone);
			driver.findElement(By.name("userName")).sendKeys(Email);
			
			// Entering Mailing Information
			driver.findElement(By.name("address1")).sendKeys(Address);
			driver.findElement(By.name("city")).sendKeys(City);
			driver.findElement(By.name("state")).sendKeys(State);
			driver.findElement(By.name("postalCode")).sendKeys(Postal_Code);
			
			// Country Selection
			Select dropcountry = new Select(driver.findElement(By.name("country")));
			dropcountry.selectByVisibleText(Country);
			
			//Entering User information
			driver.findElement(By.name("email")).sendKeys(User_name);
			driver.findElement(By.name("password")).sendKeys(Password);
			driver.findElement(By.name("confirmPassword")).sendKeys(Confirm_password);
			
			//Submitting form
			driver.findElement(By.name("submit")).click();
			if(driver.getPageSource().contains(" Thank you for registering")) {
				System.out.println("Registration Completed for "+row+" record");
			}
			else {
				System.out.println("Registration Failed for "+row+" record");
			}
			
		}
		System.out.println("Data Driven Test Completed");
		
		driver.close();
		driver.quit();
		file.close();
		
	}

}
