package Selenium_Study;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopup2 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Velocity Data\\Selenium\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		
		
		
		
		
		
		
		
		
		

	}

}
