package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nikil\\eclipse-workspace\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		Thread.sleep(1000);
		
		WebElement chkbox = driver.findElement(By.id("checkBoxOption2"));
		
		
		
		if (chkbox.isSelected())
		{
			System.out.println("checkbox2 is selected");
		}
		else
		{
			System.out.println("checkbox2 is not selected");
		}
		
		
		
		
		
		
		
		
		

	}

}
