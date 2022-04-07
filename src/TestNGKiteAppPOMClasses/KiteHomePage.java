package TestNGKiteAppPOMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class KiteHomePage {
	// 1.
  @FindBy(xpath="//span[@class='user-id']")private WebElement userID;
  @FindBy(xpath="//a[@target='_self']")private WebElement logoutButton;
	
  // 2. 
  public KiteHomePage(WebDriver driver)
  {
	  PageFactory.initElements(driver,this);
  }
  
  public String getActualUserID()
  {
	 String actualUserID = userID.getText();
	 return actualUserID;
  }
  public void logOut() throws InterruptedException
  {
	  userID.click();
	  Thread.sleep(2000);
	  logoutButton.click();
  }
  
}
