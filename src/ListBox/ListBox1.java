package ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox1 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nikil\\eclipse-workspace\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		Thread.sleep(1000);
		
		//1.Identify list box to be handled and store it in reference variable
		
		//WebElement dropbox = driver.findElement(By.name("dropdown-class-example"));
		
		WebElement listbox = driver.findElement(By.id("dropdown-class-example"));
		
		//2.Create Object of 'Select' class which will accept WebElement as Argument
		
		//Select s = new Select(dropbox);
		
		Select s = new Select(listbox);
		
		//3.By using one of the select class methods we can select values from list box 
		
		//s.selectByVisibleText("Option1"); // select by visible text method
		 s.selectByVisibleText("Option1");
		
		 Thread.sleep(1000);
		
		//s.selectByValue("option2"); // select by value method
		 
		 s.selectByValue("option2");
		 
		
		Thread.sleep(1000);
		
		s.selectByIndex(3); // select by index method
		
		

	}

}
