package ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multi_selectClass {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nikil\\eclipse-workspace\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/select-menu");
		Thread.sleep(1000);
		
		WebElement multiselect = driver.findElement(By.id("cars"));
		
		Select s = new Select(multiselect);
		
		System.out.println(s.isMultiple());
		
		s.selectByIndex(0);
		Thread.sleep(1000);
		s.selectByValue("saab");
		Thread.sleep(1000);
		s.selectByVisibleText("Opel");
		Thread.sleep(1000);
		s.selectByIndex(3);
		Thread.sleep(1000);
		
		//s.deselectByIndex(0);
		//s.deselectByValue("saab");
		//s.deselectByVisibleText("Opel");
		//s.deselectByValue("audi");
		
		//s.deselectAll();
		
		
		//s.getAllSelectedOptions();
		System.out.println(s.getFirstSelectedOption().getText());
		
		

	}

}
