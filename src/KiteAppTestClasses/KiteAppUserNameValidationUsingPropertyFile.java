package KiteAppTestClasses;

import java.io.IOException;
import java.sql.Driver;
import java.time.Duration;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BaseClasses.BaseUsingPropertyFile;
import TestNGKiteAppPOMClasses.KiteHomePage;
import TestNGKiteAppPOMClasses.KiteLoginPage;
import TestNGKiteAppPOMClasses.KitePinPage;
import utilityPackage.Utility;
import utilityPackage.UtilityUsingPropertyFile;

public class KiteAppUserNameValidationUsingPropertyFile extends BaseUsingPropertyFile{
	KiteLoginPage login;
	KitePinPage pin;
	KiteHomePage home;
	
	
	
	@BeforeClass
	public void launchingBrowser() throws IOException
	{
		launchBrowser();
		login=new KiteLoginPage(driver);
		pin= new KitePinPage(driver);
		home= new KiteHomePage(driver);	
	}
	
	@BeforeMethod
	public void LoginToKiteApp() throws IOException
	{
		login.enterUserID(UtilityUsingPropertyFile.getDataFromPropertyFile("UN"));
		login.enterPassword(UtilityUsingPropertyFile.getDataFromPropertyFile("PWD"));
		login.clickOnLoginButtton();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		pin.enterPin(UtilityUsingPropertyFile.getDataFromPropertyFile("PIN"));
		pin.clickonContinueButton();
	}
	@Test
	
	public void  validateUserID() throws IOException
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		String expectedUserID = UtilityUsingPropertyFile.getDataFromPropertyFile("UN");
		String actualUserID = home.getActualUserID();
		//Assert.fail();
		Assert.assertEquals(expectedUserID,actualUserID,"Actual and Expected UserID not matching ");
		UtilityUsingPropertyFile.takeScreenshot(driver,10);
	}
	
	@AfterMethod
	public void logoutFromKiteApp(ITestResult result) throws InterruptedException, IOException
	{
		if(result.getStatus()==result.FAILURE)
		{
			UtilityUsingPropertyFile.takeScreenshot(driver,11);
		}
		else
		{
			Reporter.log("TC is passed",true);
			
		}
		
		home.logOut();
	}
	
	@AfterClass
	public void closingBrowser()
	{
		closeBrowser();
	} 
}
