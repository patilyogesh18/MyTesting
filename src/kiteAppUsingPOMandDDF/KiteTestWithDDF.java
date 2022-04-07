package kiteAppUsingPOMandDDF;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class KiteTestWithDDF {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		
		FileInputStream Myfile = new FileInputStream("E:\\Velocity Data\\Book1.xlsx");
		Sheet Mysheet = WorkbookFactory.create(Myfile).getSheet("Sheet4");
		String myUserID = Mysheet.getRow(0).getCell(0).getStringCellValue();
		String myPassword = Mysheet.getRow(0).getCell(1).getStringCellValue();
		String myPin = Mysheet.getRow(0).getCell(2).getStringCellValue();
		
		System.setProperty("webdriver.chrome.driver", "E:\\Velocity Data\\Selenium\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe");
		
		ChromeOptions opt= new ChromeOptions();
		opt.addArguments("incognito");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		KiteLoginPage login= new KiteLoginPage(driver);
		login.enterUserID(Mysheet.getRow(0).getCell(0).getStringCellValue());
		login.enterPassword(myPassword);
		login.clickOnLoginButton();
		
		Thread.sleep(1000);
		KitePinPage pin= new KitePinPage(driver);
		pin.enterPin(myPin);
		pin.clickonContinueButton();
		
		Thread.sleep(1000);
		KiteHomePage home= new KiteHomePage(driver);
		home.validateUserID(myUserID);
		home.logout();
		
		driver.close();
		
	}
}
