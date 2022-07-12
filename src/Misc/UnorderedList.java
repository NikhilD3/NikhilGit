package Misc;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UnorderedList {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nikil\\eclipse-workspace\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.co.in/");
		
		Thread.sleep(1000);
		
		driver.findElement(By.name("q")).sendKeys("suraj");
		
		Thread.sleep(500);
		
		List<WebElement> searchResult = driver.findElements(By.xpath("(//ul[@jsname='bw4e9b'])[1]//li"));
		
		System.out.println(searchResult.size());
		
		for(WebElement v:searchResult)
		{
		System.out.println(v.getText());
		}
		
		//System.out.println("=========");
		
		
		
		for(WebElement res:searchResult)
		{
			String actualtext=res.getText();
			String expctedtext="suraj mandhare";
					
			
			if(actualtext.equals(expctedtext))
			{
				res.click();
				
				break;
			}
		}
		
		driver.findElement(By.linkText("Images")).click();
		
		

	}

}
