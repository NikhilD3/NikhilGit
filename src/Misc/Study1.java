package Misc;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Study1 {

	public static void main(String[] args) throws InterruptedException 	
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nikil\\eclipse-workspace\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.co.in/");
		
		Thread.sleep(1000);
		
		driver.findElement(By.name("q")).sendKeys("Nikhil");
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//input[@class='gNO89b'])[1]")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.linkText("Images")).click();
		
		Thread.sleep(1000);
		
		List<WebElement> images = driver.findElements(By.tagName("img"));
		
		System.out.println(images.size());
		
		
		

	}

}
