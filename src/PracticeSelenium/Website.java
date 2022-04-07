package PracticeSelenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Website {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Velocity Data\\Selenium\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		Thread.sleep(2000);
		
		driver.get("https://skpatro.github.io/demo/links/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		
		WebElement newWindowsButton = driver.findElement(By.xpath("//input[@name='NewWindow']"));
		
		newWindowsButton.click();
		
		Set<String> allWindowsId = driver.getWindowHandles();
		
		System.out.println(allWindowsId);
		
		Iterator<String> it = allWindowsId.iterator();
		String mainPageid = it.next();
		String childpageid = it.next();
		Thread.sleep(2000);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
