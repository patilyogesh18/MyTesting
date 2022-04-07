package Selenium_Study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iFrame1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Velocity Data\\Selenium\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.switchTo().frame("iframeResult");
		
		driver.findElement(By.xpath("//button[@type='button']")).click();
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("(//a[@title='Change Theme'])[1]")).click();
		
		
		
		
		
		
		
		
		
		
		

	}

}
