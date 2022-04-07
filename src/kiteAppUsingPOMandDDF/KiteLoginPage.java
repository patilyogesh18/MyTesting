package kiteAppUsingPOMandDDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLoginPage {

	// 1.
	@FindBy(id="userid")private WebElement UserID;
	@FindBy(id="password")private WebElement Password;
	@FindBy(xpath = "//button[@type='submit']")private WebElement LoginButton;
	
	// 2. 
	public KiteLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	// 3.
	public void enterUserID(String uid)
	{
		UserID.sendKeys(uid);
	}
	
	public void enterPassword(String Pwd)
	{
	Password.sendKeys(Pwd);	
	}
	
	public void clickOnLoginButton()
	{
		LoginButton.click();
	}
	
	
	
	
	
	
}
