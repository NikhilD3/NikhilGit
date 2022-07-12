package scroll_study;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollIntoView {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nikil\\eclipse-workspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/");
		
		//Thread.sleep(2000);
		
		//WebElement chinchwad = driver.findElement(By.xpath("//strong[text()='Chinchwad Branch']"));
		WebElement quickcontacts = driver.findElement(By.xpath("//span[text()='Quick Contact']"));
		
		JavascriptExecutor je = ((JavascriptExecutor)driver);
		je.executeScript("arguments[0].scrollIntoView(true)", quickcontacts);

	}

}
