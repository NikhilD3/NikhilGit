package ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class fb_study {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nikil\\eclipse-workspace\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.name("firstname")).sendKeys("Nikhil");
		
		Thread.sleep(2000);
		
		driver.findElement(By.name("lastname")).sendKeys("Deshmukh");
		
		Thread.sleep(2000);
		
		driver.findElement(By.name("reg_email__")).sendKeys("8888888888");
		Thread.sleep(2000);
		driver.findElement(By.id("password_step_input")).sendKeys("Nikhil1234");
		
		Thread.sleep(2000);
		
		WebElement day = driver.findElement(By.name("birthday_day"));
		
		Thread.sleep(2000);
		
		Select s = new Select(day);
		
		s.selectByValue("7");
		
		WebElement month = driver.findElement(By.name("birthday_month"));
		
		Thread.sleep(2000);
		
		Select s2 = new Select(month);
		
		s2.selectByVisibleText("Jan");
		
		WebElement year = driver.findElement(By.name("birthday_year"));
		
		Select s3 = new Select(year);
		
		s3.selectByValue("1997");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//label[@class='_58mt'])[2]")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		Thread.sleep(2000);
		
		
		
		
		
		
		

	}

}
