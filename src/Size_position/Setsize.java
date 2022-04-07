package Size_position;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Setsize {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Velocity Data\\Selenium\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://skpatro.github.io/demo/links/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		

		//to get default size
		

		System.out.println(driver.manage().window().getSize());
		Dimension defaultSize = driver.manage().window().getSize();
		
		Thread.sleep(2000);
		
		//to set size create an object of Dimension class which will accept width and hieght
		
		Dimension d=new Dimension(1000,500);
		
		// us method setSize which will accept object of Dimension class
		
		Thread.sleep(2000);
		driver.manage().window().setSize(d);
		System.out.println(driver.manage().window().getSize());
		
		
		
		
		
		
		
		
		

	}

}
