package testNGCrossBrowserTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FireFoxTest {
  @Test
  public void MyMethod1() 
  {
	  System.setProperty("webdriver.gecko.driver", "E:\\Velocity Data\\Selenium\\geckodriver-v0.30.0-win64\\geckodriver.exe");

		WebDriver driver= new FirefoxDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().window().maximize();
		driver.close();
  }
}
