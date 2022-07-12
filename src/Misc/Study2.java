package Misc;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Study2 {

	public static void main(String[] args) throws InterruptedException 
	{
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
		
		//System.out.println(allpageID);
		
		Iterator<String> itr = allpageID.iterator();
//		while(itr.hasNext())
//		{
//			System.out.println(itr.next());
//		}
		
		String mainID = itr.next();
		String childpage1 = itr.next();
		String childpage2 = itr.next();
		String childpage3 = itr.next();
		
		driver.switchTo().window(childpage3);
		
		Thread.sleep(2000);
		
		WebElement theme = driver.findElement(By.xpath("(//a[@title='Change Theme'])[1]"));
		theme.click();
		Thread.sleep(200);
		theme.click();
		Thread.sleep(200);
		
		driver.close();
		
		Thread.sleep(2000);
		
		driver.switchTo().window(childpage2);
		WebElement theme2 = driver.findElement(By.xpath("(//a[@title='Change Theme'])[1]"));
		theme2.click();
		Thread.sleep(200);
		theme2.click();
		Thread.sleep(200);
		
		driver.close();
		
		Thread.sleep(2000);
		
		driver.switchTo().window(childpage1);
		WebElement theme3 = driver.findElement(By.xpath("(//a[@title='Change Theme'])[1]"));
		theme3.click();
		Thread.sleep(200);
		theme3.click();
		Thread.sleep(200);
		
		driver.close();
		
		
		
		
			
		
		

	}

}
