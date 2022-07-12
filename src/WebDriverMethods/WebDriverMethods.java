package WebDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethods {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Nikil\\\\eclipse-workspace\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		
		
		//Webdriver: It is an interface use to perform action of browser.
		
		//WebDriver Methods:
		
		//1. get- to enter url in browser or to open an application.
		
		driver.get("https://vctcpune.com/");
		
		//2. close: to close the current tab of the browser opened by Selenium tool.
		
		//driver.close();
		
		//3.quit: to close the all the tabs present in browser opened by Selenium tool.
		
		//driver.quit();
		
		//4. maximize/ minimize() - used to maximize/ minimize the browser
		
		//driver.manage().window().minimize();
		//driver.manage().window().maximize();
		
		
		//5.navigate: this method is use to open an application, move forward, backward & refresh the webpage
		
		//driver.navigate().to("https://www.google.com/");
		//driver.navigate().back();
		//driver.navigate().forward();
		//driver.navigate().refresh();
		
		//6.getTitle: this method is use to get title of a webpage. return type of getTitle method is String.
		
		//System.out.println(driver.getTitle());
		
		//String title = driver.getTitle();
		//System.out.println(title);
		
		//7.getCurrentURL: this method is use to get URL of a webpage. return type of getCurrentURL method is String
		
		String url = driver.getCurrentUrl();
		System.out.println("url is "+url);
	}

}
