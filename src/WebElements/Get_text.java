package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_text {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nikil\\eclipse-workspace\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		//driver.get("https://www.google.co.in/");
		
		Thread.sleep(2000);
		
		//1
		//System.out.println(driver.findElement(By.xpath("//a[text()='Create a Page']")).getText());
		
		//System.out.println(driver.findElement(By.xpath("//a[text()='Gmail']")).getText());
		
		//2
		//String text = driver.findElement(By.xpath("//a[text()='Create a Page']")).getText();
		//System.out.println(text);
		
		//WebElement text = driver.findElement(By.xpath("//a[text()='Gmail']"));
		
		//System.out.println(text.getText());
		
		//3
		WebElement element = driver.findElement(By.xpath("//a[text()='Create a Page']"));
		System.out.println(element.getText());
		

	}

}
