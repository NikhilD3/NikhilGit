package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabled {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nikil\\eclipse-workspace\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
	    driver.get("https://www.discoveryplus.in/");
	    
	    Thread.sleep(5000);
	    
	    WebElement signin = driver.findElement(By.xpath("(//h6[text()='Sign In'])[2]"));
	    signin.click();
	    
	    Thread.sleep(5000);
	    
	    //WebElement otp = driver.findElement(By.xpath("//button[text()='Get OTP']"));
//	    
	   // System.out.println(otp.isEnabled());
	    
//	    driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("8888888888");
//	    
//	    Thread.sleep(2000);
//	    System.out.println(otp.isEnabled());
//	    otp.click();
//	    Thread.sleep(2000);
//	    
//	    WebElement submit = driver.findElement(By.xpath("//button[@type='submit']"));
//	    
//	    System.out.println(submit.isEnabled());
//	    
//	    Thread.sleep(2000);
	    

	}

}
