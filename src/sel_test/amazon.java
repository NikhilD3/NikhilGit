package sel_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazon {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nikil\\eclipse-workspace\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		Thread.sleep(10000);
		WebElement mobiles = driver.findElement(By.id("twotabsearchtextbox"));
		
		mobiles.sendKeys("mobile");
		Thread.sleep(1000);
		
		WebElement search = driver.findElement(By.xpath("//input[@value='Go']"));
		Thread.sleep(10000);
		search.click();
		
		Thread.sleep(10000);

	}

}
