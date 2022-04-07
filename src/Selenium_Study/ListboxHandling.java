package Selenium_Study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListboxHandling {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Velocity Data\\Selenium\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
	WebElement DropdownBox = driver.findElement(By.name("dropdown-class-example"));
		
	Select s=new Select(DropdownBox);
	
	s.selectByVisibleText("Option3");
	Thread.sleep(2000);
	
	s.selectByIndex(1);
	Thread.sleep(5000);
	
	s.selectByValue("option2");
		System.out.println("IsMultiple state is "+s.isMultiple());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
