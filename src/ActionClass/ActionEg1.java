package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class ActionEg1 {

	public static void main(String[] args) throws InterruptedException 
	{
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nikil\\eclipse-workspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		Thread.sleep(1000);
		
		WebElement seleniumbutton = driver.findElement(By.linkText("Selenium")); // a webelement from webpage
		// seleniumButton.click();--> using WebElement method
		
		// How to click using Actions class
		// Create object of Actions class and pass driver object
		
		Actions act = new Actions(driver);
		
		//using one the required actions complete the process
		
		//act.moveToElement(seleniumbutton).perform();
		//act.click().perform();
		
		//act.moveToElement(seleniumbutton).click().build().perform();
		
		//act.click(seleniumbutton).perform();
		
		WebElement rightclickbutton = driver.findElement(By.xpath("//span[text()='right click me']"));
		
		//act.moveToElement(rightclickbutton).contextClick().build().perform();
		
		//act.contextClick(rightclickbutton).perform();
		
		// how to double click using Actions class
		
		WebElement doubleclick = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		
		act.doubleClick(doubleclick).perform();

	}

}
