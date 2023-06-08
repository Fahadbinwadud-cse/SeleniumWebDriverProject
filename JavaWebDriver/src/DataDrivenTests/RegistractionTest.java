package DataDrivenTests;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class RegistractionTest {
	public static void  main(String[] args) throws IOException {
		
		// FileInputStrem class used for read file from sheet and right side is path of file location.
		FileInputStream file = new FileInputStream("C:\\Users\\Fahad\\Desktop\\SQA\\Selenium Files\\Data Driven Tests\\Registration.xlsx");
		// XSSWorkbook class is used for interact with sheet.So that read file form sheet
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		// sheet is in the workbook. So used getSheet method providing sheet name and double quote in the name of sheet
		XSSFSheet sheet = workbook.getSheet("Registration");
		// getSheet method  providing sheet index from excel sheet.
		//XSSFSheet sheet = workbook.getSheetAt(0);
		int rowCount = sheet.getLastRowNum();//getLastRowNum method is counted only last row number
		System.out.print(rowCount);
		int colCount = sheet.getRow(0).getLastCellNum();// getRow method is return row number and getLastCellNum is return only last column number
		for(int i =0;i<rowCount;i++) {
			// XSSFRow is row type of variable.
			XSSFRow currentrow = sheet.getRow(i);// Focused on the current row
			for(int j=0;j<colCount;j++) {
				String value = currentrow.getCell(j).toString();
				System.out.print("   "+value);
			}
			System.out.println();
			
		}
		
	}
}