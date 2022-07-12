package SizeAndPosition;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetSize {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nikil\\eclipse-workspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(1000);
		
		System.out.println(driver.manage().window().getSize());
		
		Dimension d = new Dimension(1500, 1500);
		
		driver.manage().window().setSize(d);
		

	}

}
