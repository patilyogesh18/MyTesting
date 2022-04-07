package zerodhaUsingPOMSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLoginPage 
{

	// 1. Variable declaration--> Webelement
	
	@FindBy(id = "userid")private WebElement userID;
	@FindBy(id = "password") private WebElement Password;
	@FindBy(xpath="//button[@type='submit']") private WebElement Loginbutton;
	
	// 2. Use Constructor-->
	
	public KiteLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	// 3. Method which works on data members
	
	public void sendUserID()
	{
		userID.sendKeys("HD5857");
	}
	
	public void sendPassword() 
	{
		Password.sendKeys("Ajinkya@123");
	}
	
	public void clickOnLoginButton() 
	{
		Loginbutton.click();
	}
	
}
