package Selenium_Study;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopup {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Velocity Data\\Selenium\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://skpatro.github.io/demo/links/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//String mainPageWindowId = driver.getWindowHandle(); //Will give windowId in String form.
		//System.out.println("WindowID Is "+mainPageWindowId);
		
		driver.findElement(By.name("NewWindow")).click(); // Opening Child browser popup.
		// We got multiple windows
		Set<String> allWindowsIds = driver.getWindowHandles();
		System.out.println("All windows id are "+allWindowsIds );
		
		
		Iterator<String> it = allWindowsIds.iterator(); //Pointing to -1
		String mainPageID = it.next();
		String childPageId = it.next();

		// switch selenium focus to child page
		Thread.sleep(2000);
		driver.switchTo().window(childPageId); //focused switched form main page to child page
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='the7-search']")).sendKeys("Selenium");
		Thread.sleep(3000);
		driver.close();
		
		//switch selenium focus to main page
		
		driver.switchTo().window(mainPageID);
		Thread.sleep(2000);
		
		driver.findElement(By.name("home"));
		Thread.sleep(2000);
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
