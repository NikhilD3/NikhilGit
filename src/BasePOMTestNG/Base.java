package BasePOMTestNG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.Reporter;

public class Base 
{
	//open browser
	//go to Website
	
	protected WebDriver driver; 

	public void openBrowser()
	{
		 // System.setProperty("webdriver.gecko.driver", "C:\\Users\\Nikil\\eclipse-workspace\\geckodriver.exe");
//		  driver = new FirefoxDriver();
//		  driver.manage().window().maximize();
//		  
//		  FirefoxOptions opt = new FirefoxOptions();
//		  opt.addArguments("incongito");
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nikil\\eclipse-workspace\\chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  
		  driver.get("https://kite.zerodha.com/");
		  Reporter.log("launching browser",true);
		  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
	}
}
