package corss_browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void mymethod() 
  {
	  System.setProperty("webdriver.gecko.driver", "C:\\Users\\Nikil\\eclipse-workspace\\geckodriver.exe");
	  WebDriver driver = new FirefoxDriver();
	  driver.manage().window().maximize();
	  driver.get("https://vctcpune.com/");
  }
}
