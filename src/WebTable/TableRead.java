package WebTable;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableRead {

	public static void main(String[] args) throws InterruptedException 
	{
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nikil\\eclipse-workspace\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		List<WebElement> rows = driver.findElements(By.xpath("//table//tr"));
		
		System.out.println(rows.size());
		
		List<WebElement> column = driver.findElements(By.xpath("//table//tr[1]//th"));

		int totalNumofCol = column.size();
		
		for(WebElement header:column)
		{
			System.out.print(header.getText()+" ");
		}
		
		Thread.sleep(1000);
		
		List<WebElement> allrowsdata = driver.findElements(By.xpath("//table//tr"));
		
		Iterator<WebElement> itr = allrowsdata.iterator();
		
		while(itr.hasNext())
		{
			System.out.print(itr.next().getText()+" ");
			System.out.println();
		}
		
	}
	

}
