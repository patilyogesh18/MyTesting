package Selenium_Study;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popup2 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Velocity Data\\Selenium\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		//driver.get("https://the-internet.herokuapp.com/basic_auth");
		
		//driver.manage().window().maximize();
		
		//Thread.sleep(2000);
		
		// Syntax:-
		
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		
		

	}

}
