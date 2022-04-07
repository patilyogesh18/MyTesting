package KiteAppTestClasses;

import java.io.IOException;
import java.sql.Driver;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BaseClasses.Base;
import TestNGKiteAppPOMClasses.KiteHomePage;
import TestNGKiteAppPOMClasses.KiteLoginPage;
import kiteAppUsingPOMandDDF.KitePinPage;
import utilityPackage.Utility;

public class KiteUserNameValidation extends Base{
	KiteLoginPage login;
	KitePinPage pin;
	KiteHomePage home;
	
	
@BeforeClass
	public void BrowserLaunch()
	{
	LaunchBrowser();
	login = new KiteLoginPage(driver);
	pin= new KitePinPage(driver);
	home= new KiteHomePage(driver);
	}
	
@BeforeMethod
public void loginToKiteApp() throws EncryptedDocumentException, IOException
{
	login.enterUserID(Utility.ReadDataFromExcel(0, 0));
	login.enterPassword(Utility.ReadDataFromExcel(0, 1));
	login.clickOnLoginButtton();
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	pin.enterPin(Utility.ReadDataFromExcel(0, 2));
	pin.clickonContinueButton();
}

@Test
public void validateUserName() throws EncryptedDocumentException, IOException
{
	int TCID=100;
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
	String actualUserID = home.getActualUserID();
	String expecteUserID = Utility.ReadDataFromExcel(0,0);
	Assert.assertEquals(actualUserID, expecteUserID,"Actual and Expected not matching");
	Utility.takeScreenshot(driver, TCID);
	Reporter.log("Validated UserName", true);
	
}

@AfterMethod
public void logoutFromKiteApp() throws InterruptedException
	{
	home.logOut();
	Reporter.log("Logging out", true);
	}
@AfterClass
public void closingBrowser()
	{
	closeBrowser();
	}

}