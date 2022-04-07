package Selenium_Study;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopup {

	public static void main(String[] args) throws InterruptedException {
	

		System.setProperty("webdriver.chrome.driver", "E:\\Velocity Data\\Selenium\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demoqa.com/alerts");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		WebElement clickMeButton1 = driver.findElement(By.id("alertButton"));
		
		clickMeButton1.click();
		
		Thread.sleep(2000);
		
		Alert Alt1 = driver.switchTo().alert();
		
		String Text = Alt1.getText();
		
		System.out.println(Text);
		
		Alt1.accept();
		
		Thread.sleep(2000);
		
		WebElement clickMeButton2 = driver.findElement(By.id("timerAlertButton"));
		
		clickMeButton2.click();
		
		Thread.sleep(6000);
		
		Alert Alt2 = driver.switchTo().alert();
		
		Thread.sleep(2000);
		
		Alt2.accept();
		
		
		WebElement clickMeButton3 =driver.findElement(By.id("confirmButton"));
		
		clickMeButton3.click();
		
		Thread.sleep(2000);
		
		Alert Alt3=driver.switchTo().alert();
		
		Alt3.dismiss();
		
		
		WebElement clickMeButton4 = driver.findElement(By.id("promtButton"));
		
		
		clickMeButton4.click();
		
		Alert Alt4 = driver.switchTo().alert();
		
		Alt4.sendKeys("YOGESH");
		Alt4.accept();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
