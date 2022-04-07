package Selenium_Study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectDropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Velocity Data\\Selenium\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demoqa.com/select-menu");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement MultiSelectBox = driver.findElement(By.name("cars"));
		
		Select s=new Select(MultiSelectBox);
		s.deselectByIndex(3);
		Thread.sleep(2000);
		
		s.selectByVisibleText("Volvo");
		Thread.sleep(5000);
		
		s.selectByValue("Saab");
		
		Thread.sleep(2000);
		s.deselectAll();
		
		
		
		
		
	}

}
