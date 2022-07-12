package ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Study_listbox {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nikil\\eclipse-workspace\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		
		Thread.sleep(2000);
		
		WebElement bday = driver.findElement(By.name("birthday_day"));
		
		Select s = new Select(bday);
		
		s.selectByVisibleText("29");
		
		Thread.sleep(2000);
		
		WebElement bmonth = driver.findElement(By.name("birthday_month"));
		
		Select s2 = new Select(bmonth);
		
		s2.selectByIndex(6);
		
		Thread.sleep(2000);
		
		WebElement byear = driver.findElement(By.name("birthday_year"));
		
		Select s3 = new Select(byear);
		
		s3.selectByValue("1995");
		
		Thread.sleep(2000);
		
		
	

	}

}
