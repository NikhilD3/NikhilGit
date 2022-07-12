package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class frameStudy {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nikil\\eclipse-workspace\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		
		
		driver.switchTo().frame("frame2");
		
		 WebElement drop1 = driver.findElement(By.id("animals"));
		 
		 Select s = new Select(drop1);
		 
		 s.selectByValue("babycat");
		 
		 driver.switchTo().defaultContent();
		 
		 driver.switchTo().frame("frame1");
		 
		 driver.switchTo().frame("frame3");
		 
		 driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		 
		 driver.switchTo().parentFrame();
		 
		 driver.findElement(By.tagName("input")).sendKeys("Amol");
		 
		 driver.switchTo().defaultContent();
		 
		 System.out.println(driver.findElement(By.xpath("//h1[text()='Frames Examples in Selenium Webdriver']")).getText());
		 
		 driver.switchTo().frame("frame2");
		 
		 WebElement drop2 = driver.findElement(By.id("animals"));
		 
		 Select s2 = new Select(drop2);
		 
		 s2.selectByValue("big baby cat");
		
		 
		 
		 
		 
		 
		
		
		
		
		

	}

}
