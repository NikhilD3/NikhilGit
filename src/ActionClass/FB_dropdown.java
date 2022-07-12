package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FB_dropdown {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nikil\\eclipse-workspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		
		Thread.sleep(1000);
		
		WebElement month = driver.findElement(By.name("birthday_month"));
		
		Actions act= new Actions(driver);
		
		act.click(month).perform();
		
		for(int i=5;i<=11;i++)
		{
			act.sendKeys(Keys.ARROW_DOWN).perform();
			Thread.sleep(300);
			
		}
		
		act.sendKeys(Keys.ENTER);
		
		WebElement firstname = driver.findElement(By.xpath("(//input[@data-type='text'])[1]"));
		
		//firstname.sendKeys("Suraj");
		
		act.keyDown(firstname,Keys.SHIFT).sendKeys("s").keyUp(Keys.SHIFT).sendKeys("uraj").build().perform();
		

	}

}
