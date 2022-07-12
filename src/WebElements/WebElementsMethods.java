package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementsMethods {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Nikil\\eclipse-workspace\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		//WebElement methods:
		
		//1.SendKeys() - This method is use to enter value in the input/text field
		
		WebElement input = driver.findElement(By.id("autocomplete"));
		
		input.sendKeys("India");
		
		
		Thread.sleep(2000);
		
		//2.Clear() - This method is use to clear value in the text field.
		
		driver.findElement(By.id("autocomplete"));
		input.clear();
		
		

	}

}
