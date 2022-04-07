package Selenium_Study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iFrameStudy {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "E:\\Velocity Data\\Selenium\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.switchTo().frame("courses-iframe");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[contains(text(),'Click to Start Selenium Practice Now')]")).click();
		
		
		
		

	}

}
