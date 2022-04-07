package TestNGKitePOM;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class KiteTestUsingTestNG {

	
	WebDriver driver;
	Sheet MySheet;
	KiteLoginPage login;
	KitePinPage pin;
	KiteHomePage home;


	@Parameters("browserName")
	@BeforeClass
  public void LaunchBrowser(String browser) throws EncryptedDocumentException, IOException 
  {
		if(browser.equals("chrome"))
		{
	
		Reporter.log("Launching chrome Browser",true);
		System.setProperty("webdriver.chrome.driver", "E:\\Velocity Data\\Selenium\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions opt= new ChromeOptions();
		opt.addArguments("--disable-notifications");
		driver=new ChromeDriver(opt);
		}
		else if(browser.equals("firefox"))
		{
		 Reporter.log("Launching firefox Browser",true);
		 System.setProperty("webdriver.gecko.driver", "E:\\Velocity Data\\Selenium\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		 FirefoxOptions opt= new FirefoxOptions();
		 opt.addArguments("--disable-notifications");
		 driver= new FirefoxDriver(opt);
		}
		
		driver.get("https://kite.zerodha.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		driver.manage().window().maximize();
		Reporter.log("Browser Launching success",true);
		
		FileInputStream MyFile=new FileInputStream("E:\\Velocity Data\\Book1.xlsx");
		MySheet = WorkbookFactory.create(MyFile).getSheet("Sheet4");
		login = new KiteLoginPage(driver);
		pin = new KitePinPage(driver);
		home = new KiteHomePage(driver);
		
		
  }
	@BeforeMethod
	public void LoginToKiteApp() 
	{
		String UserID = MySheet.getRow(0).getCell(0).getStringCellValue();
		String Password = MySheet.getRow(0).getCell(1).getStringCellValue();
		String Pin = MySheet.getRow(0).getCell(2).getStringCellValue();
		Reporter.log("Entering UserID and Password",true);
		
		login.enterUserID(UserID);
		login.enterPassword(Password);
		login.clickOnLoginButton();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		Reporter.log("Entering Pin ",true);
		pin.enterPin(Pin);
		pin.clicknnContinueButton();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
			
	}	
	@Test
	public void validateUserID()
	{
	Reporter.log("validating userID",true);
	String expectedUserID = MySheet.getRow(0).getCell(0).getStringCellValue();
	String actualUserID = home.getactualUserID();
	Assert.assertEquals(actualUserID, expectedUserID,"actual and expected useriD not matching");
	Reporter.log("User ID validated suceesfully, TC is passed",true);
	}
	@AfterMethod
	public void logoutFromKiteApp() throws InterruptedException
	{
		Reporter.log("Logging out...",true);
		home.logout();
		}
		@AfterClass
		public void closeBrowser()
		{
		Reporter.log("closing browser",true);
		driver.close();
		}
	
}
