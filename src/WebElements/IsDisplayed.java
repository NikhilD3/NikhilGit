package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayed {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nikil\\eclipse-workspace\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		Thread.sleep(1000);
		
		WebElement hide = driver.findElement(By.id("hide-textbox"));
		WebElement show = driver.findElement(By.id("show-textbox"));
		WebElement textbox = driver.findElement(By.id("displayed-text"));
		
		
		if(textbox.isDisplayed())
		{
			System.out.println("Textbox is Displayed");
		}
		else
		{
			System.out.println("Textbox is hidden");
		}
		
		hide.click();
		
		if(textbox.isDisplayed())
		{
			System.out.println("Textbox is Displayed");
		}
		else
		{
			System.out.println("Textbox is hidden");
	    }
		
		show.click();
		
		if(textbox.isDisplayed())
		{			System.out.println("Textbox is Displayed");
		}
		else
		{
			System.out.println("Textbox is hidden");
		}
			

	}

}
