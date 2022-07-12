package scroll_study;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrolling {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nikil\\eclipse-workspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/");
		
		JavascriptExecutor jve = ((JavascriptExecutor)driver);
		jve.executeScript("window.scrollBy(80,900)");
		
		
		
//		JavascriptExecutor je = ((JavascriptExecutor)driver);
//		
//		je.executeScript("window.scrollBy(80,900)");
		
		//Thread.sleep(1000);

	}

}
