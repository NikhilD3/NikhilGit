package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class frame_webelement {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nikil\\eclipse-workspace\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://skpatro.github.io/demo/iframes/");
		
		WebElement frameelement = driver.findElement(By.id("Frame1"));
		
		driver.switchTo().frame(frameelement);
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()='Category2']")).getText();
		
		driver.switchTo().defaultContent();
		
		System.out.println(driver.findElement(By.xpath("//a[text()='Pavilion']")).getText());
		
		driver.switchTo().frame("Frame2");
		
		System.out.println(driver.findElement(By.xpath("//a[text()='Category3']")).getText());
		
		driver.switchTo().parentFrame();
		
		System.out.println(driver.findElement(By.xpath("//a[text()='Blogger']")).getText());
		
		
		
		
		

	}

}
