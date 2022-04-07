package Selenium_Study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isSelectedUse {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Velocity Data\\Selenium\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		WebElement Option1Checkbox = driver.findElement(By.name("checkBoxOption1"));
		
		//result = Option1Checkbox.click();
		
		//System.out.println(Option1CheckBox.isSelected()).
		
		boolean result = Option1Checkbox.isSelected();
		
		if(result) {
			System.out.println("Checkbox is already selected ");
		}
		else {
			System.out.println("Check box is not selected, Selecting check box now");
			Option1Checkbox.click();
			Thread.sleep(100);
			boolean result2 = Option1Checkbox.isSelected();
			System.out.println("Updated checkBox selected status is "+result2);
				
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
