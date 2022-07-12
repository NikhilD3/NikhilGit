package Screenshot;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot_study {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nikil\\eclipse-workspace\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 
		 driver.get("https://www.google.co.in/");
		 
		 Thread.sleep(2000);
		 
		 File scr = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 
		 File destination = new File("D:\\Selenium Screenshots\\myscreenshot.png");
		 
		 org.openqa.selenium.io.FileHandler.copy(scr, destination);

	}

}
