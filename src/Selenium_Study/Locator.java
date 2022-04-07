package Selenium_Study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator{

	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", "E:\\Velocity Data\\Selenium\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("email")).sendKeys("1245");
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("pass")).sendKeys("24214");
		
		Thread.sleep(2000);
		
		//driver.findElement(By.tagName("button")).click();
		
		//driver.findElement(By.tagName("button")).click();
		
		//Thread.sleep(2000);
		
		//driver.findElement(By.id("pass")).clear();
		
		
		
		
		
		
		
		
		
		
		

	}

}
