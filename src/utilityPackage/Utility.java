package utilityPackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Reporter;

public class Utility {
	
	static Sheet Mysheet;
	
  public static String ReadDataFromExcel(int rowIndex,int columnIndex) throws EncryptedDocumentException, IOException 
  {
	  	FileInputStream Myfile = new FileInputStream("E:\\Velocity Data\\Book1.xlsx");
	  	Mysheet = WorkbookFactory.create(Myfile).getSheet("Sheet3");
	  	String value = Mysheet.getRow(rowIndex).getCell(columnIndex).getStringCellValue();
		return value;
  }
  
  public static void takeScreenshot(WebDriver driver,int TCID) throws IOException 
  {
	 File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	 File dest=new File("E:\\Velocity Data\\Selenium\\Screenshot\\TC"+TCID+"Screenshot.png");
	 FileHandler.copy(src,dest);
	 Reporter.log("screenshot taken for TC " +TCID,true);
  }
}
