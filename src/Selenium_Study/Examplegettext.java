package Selenium_Study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Examplegettext {

	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver", "E:\\Velocity Data\\Selenium\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://en-gb.facebook.com/");
	
		Thread.sleep(20000);
		
		driver.manage().window().maximize();
		
		Thread.sleep(20000);
		
		//System.out.println(driver.findElement(By.tagName("//h2[contains(text(),'Facebook helps you connect')]")).getText());
		
		WebElement WebText = driver.findElement(By.tagName("//h2[contains(text(),'Facebook helps you connect')]"));
		
		String ActualText = WebText.getText();
		
		System.out.println("Text is "+ActualText);
		String ExpectedText = "Facebook helps you connect and share with the people in your life.";
		
		if(ActualText.equals(ExpectedText))
		{
			System.out.println("Test is matching test case passed ");
		}
		else
		{
			System.out.println("Test is not matching test case failed ");
		}
		
		
	}	

	}


