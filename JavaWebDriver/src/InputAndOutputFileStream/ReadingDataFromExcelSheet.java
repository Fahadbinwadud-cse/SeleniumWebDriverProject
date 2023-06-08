package InputAndOutputFileStream;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingDataFromExcelSheet {
	public static void main(String[] args) throws Exception 
	{
		FileInputStream file = new FileInputStream("C:\\Users\\Fahad\\Desktop\\SQA\\Selenium Files\\Data Driven Tests\\Test1.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		int rowCount = sheet.getLastRowNum();
		int colCount = sheet.getRow(0).getLastCellNum();
		for(int i=0;i<=rowCount;i++) {
			XSSFRow courrentRow = sheet.getRow(i);//Focus the row
			for(int j=0;j<colCount;j++) {
				String value = courrentRow.getCell(j).toString();// read the sheet cell
				System.out.print(" "+value);

			}
			System.out.println();
			
		}
	
	}

}
