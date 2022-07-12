package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEanabled_study {

	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nikil\\eclipse-workspace\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.zomato.com/");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		
		Thread.sleep(2000);
		
		WebElement otp = driver.findElement(By.xpath("(//button[@tabindex='0'])[3]"));
		
		driver.findElement(By.xpath("//input[@placeholder='Phone number']")).sendKeys("8888888888");
		
		Thread.sleep(2000);
		
		System.out.println(otp.isEnabled());
		
		
		

	}

}
