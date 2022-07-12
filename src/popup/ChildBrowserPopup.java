package popup;

import java.util.Iterator;
import java.util.Set;

import javax.activation.MailcapCommandMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopup {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nikil\\eclipse-workspace\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://skpatro.github.io/demo/links/");
		
		Thread.sleep(2000);
		
		String mainpageid = driver.getWindowHandle(); // to get main page id
		
		System.out.println(mainpageid);
		
		System.out.println("==========================================");
		
		driver.findElement(By.xpath("//input[@name='NewWindow']")).click(); // to open new window that is child browser
		
		Thread.sleep(2000);
		
		Set<String> allpageid = driver.getWindowHandles(); // to get all page ids
		
		Iterator<String> itr = allpageid.iterator(); // iterator to move through ids
		
//		while(itr.hasNext())
//		{
//			System.out.println(itr.next());
//		}
		
		String Mpageid = itr.next(); // id of main page
		String childpageid = itr.next(); // id of child browser
		
		// now we switch focus to child browser
		
		driver.switchTo().window(childpageid); // switched focus from main page to child browser
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='the7-search']")).sendKeys("Hello this is child browser"); // performed action on child browser web elements
		
		//driver.close(); // will close current focused tab
		//driver.quit(); // will close close all tabs/pages opened by selenium
		
		driver.switchTo().window(Mpageid);

	}

}
