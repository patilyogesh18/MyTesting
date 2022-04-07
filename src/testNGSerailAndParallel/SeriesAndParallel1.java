package testNGSerailAndParallel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SeriesAndParallel1 {
 
	  @Test
	  public void f1() {
		  
		  System.setProperty("webdriver.chrome.driver", "E:\\Velocity Data\\Selenium\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe");

			WebDriver driver=new ChromeDriver();
			driver.get("https://www.facebook.com/");
			driver.manage().window().maximize();
			driver.close();
  }
}
