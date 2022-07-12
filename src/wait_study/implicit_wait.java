package wait_study;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class implicit_wait {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nikil\\eclipse-workspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		
		//Thread.sleep(5000); // static wait/Java Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000)); //implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(2000));
		WebElement gmail = driver.findElement(By.linkText("Gmail"));
		wait.until(ExpectedConditions.visibilityOf(gmail));
        gmail.click();
		
		FluentWait wait1 = new FluentWait(driver);
		wait.withTimeout(Duration.ofMillis(2000));
		wait.pollingEvery(Duration.ofMillis(100));
		wait.ignoring(NoSuchElementException.class);
       
		
		

	}

}
