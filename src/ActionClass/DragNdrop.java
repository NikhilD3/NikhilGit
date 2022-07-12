package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragNdrop {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nikil\\eclipse-workspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		
		Thread.sleep(1000);
		
		// find source and destination
		
		WebElement src = driver.findElement(By.xpath("(//a[@class='button button-orange'])[4]"));
		
		WebElement dest = driver.findElement(By.id("amt7"));
		
		Actions  act = new Actions(driver);
		
		//act.dragAndDrop(src, dest).perform();
		
		act.moveToElement(src).clickAndHold(src).moveToElement(dest).release().build().perform();

	}

}
