package Misc;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class study3 {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nikil\\eclipse-workspace\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.w3schools.com/");
		
Thread.sleep(2000);
		
		String mainpageID = driver.getWindowHandle();
		
		System.out.println(mainpageID);
		
		driver.findElement(By.xpath("(//a[text()='Try it Yourself'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[text()='Try it Yourself'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[text()='Try it Yourself'])[1]")).click();
		Thread.sleep(2000);
		
		Set<String> allpageID = driver.getWindowHandles();
		
		
		for (String all:allpageID)
		{
			if(!all.equals(mainpageID))
			{
				driver.switchTo().window(all);
				Thread.sleep(5000);
				driver.findElement(By.xpath("(//a[@title='Change Theme'])[1]")).click();
				Thread.sleep(5000);
				
			}
		}
		driver.switchTo().window(mainpageID);
		String text = driver.findElement(By.xpath("(//a[text()='Try it Yourself'])[1]")).getText();
		System.out.println(text);
		
		

	}

}
