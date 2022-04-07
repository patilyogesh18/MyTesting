package mouseActionsSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {



	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "E:\\Velocity Data\\Selenium\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement doubleClickButton = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));

		//actions class
		Actions act=  new Actions(driver);
		
		act.doubleClick(doubleClickButton).perform();
		
		act.moveToElement(doubleClickButton).doubleClick().build().perform();		
	
//		Actions act=new Actions(driver);
//		
//		// act.doubleClick(doubleClickButton).perform();
//		
//		act.moveToElement(doubleClickButton).doubleClick().build().perform();
//		
		
		
	}
		
	
}
