package Selenium_Study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isDisplayedUse {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Velocity Data\\Selenium\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		WebElement HideTextbox = driver.findElement(By.xpath("//input[@id='displayed-text']"));
		
		System.out.println(HideTextbox.isDisplayed());
		
		Thread.sleep(2000);
		
		boolean result = HideTextbox.isDisplayed();
		
		driver.findElement(By.xpath("//input[contains(@id,'hide')]")).click();
			
		System.out.println(HideTextbox.isDisplayed());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
