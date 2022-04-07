package Selenium_Study;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class ScreenShotTest {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Velocity Data\\Selenium\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		driver.manage().window().maximize();
		
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		String Randomvalue=RandomString.make(2);
		
		File destination=new File("E:\\Velocity Data\\Selenium\\Screenshot\\screenshot"+Randomvalue+".png");
		
		FileHandler.copy(source, destination);
		
		
		
		

	}

}
