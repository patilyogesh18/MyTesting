package excelSheetStudy;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class ExcelTest1 {

	

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream Myfile = new FileInputStream("E:\\Velocity Data\\Book1.xlsx");
		
		Sheet Mysheet = WorkbookFactory.create(Myfile).getSheet("Sheet1");
		
		String Value = Mysheet.getRow(0).getCell(1).getStringCellValue();
		
		System.out.println(Value);
		
	}
		

	

}
