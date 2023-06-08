package InputAndOutputFileStream;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TextOne {
	public static void main(String[] args) throws IOException {
		
		FileInputStream file =new  FileInputStream("C:\\Users\\Fahad\\Desktop\\SQA\\Selenium Files\\Data Driven Tests\\Test1.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		
	}

}
