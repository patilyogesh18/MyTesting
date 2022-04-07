package Framework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZerodhaWithDDF {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
	

		System.setProperty("webdriver.chrome.driver", "E:\\Velocity Data\\Selenium\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement userIdField = driver.findElement(By.id("userid"));
		WebElement passwordField = driver.findElement(By.id("password"));
		WebElement logInButton = driver.findElement(By.xpath("//button[@type='submit']"));
		
		userIdField.sendKeys("HD5857");
		passwordField.sendKeys("Ajinkya@123");
		logInButton.click();
		Thread.sleep(2000);
		WebElement pin = driver.findElement(By.id("pin"));
		WebElement continueButton = driver.findElement(By.xpath("//button[@type='submit']"));
		pin.sendKeys("969696");
		continueButton.click();
		Thread.sleep(2000);
		WebElement userId = driver.findElement(By.className("user-id"));
		
		String actualuserId = userId.getText();
		String expectedUserId = "HD5857";
		
		if(actualuserId.equals(expectedUserId)) 
		{
			System.out.println(" UserId matching TC Passed ");
		}else
		{
			System.out.println(" UserId Not matching TC Not Passed ");
		}
		userId.click();
		
		WebElement logOutButton = driver.findElement(By.xpath("//a[@target='_self']"));
		logOutButton.click();
		driver.close();
	}

}
