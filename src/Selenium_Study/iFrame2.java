package Selenium_Study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iFrame2 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Velocity Data\\Selenium\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		Thread.sleep(2000);
		
		driver.get("https://demoqa.com/nestedframes");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.switchTo().frame("frame1");
		
		WebElement parent = driver.findElement(By.xpath("//body[text()='Parent frame']"));
		
		String parent1 = parent.getText();
		
		System.out.println("Text og parent frame "+parent1);
		
		driver.switchTo().frame("//iframe[@srcdoc='<p>Child Iframe</p>']");
		
		driver.findElement(By.xpath(""));
		
		
		
		
		
		
		
		
		
		

	}

}
