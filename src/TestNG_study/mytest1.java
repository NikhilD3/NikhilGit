package TestNG_study;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class mytest1 {
  @Test
  public void validateUserID() 
  { 
	  Reporter.log("this is user ID", true);
  }
  
  @BeforeMethod
  public void Loginpage()
  {
	  Reporter.log("this is login page", true);
  }
  
  @AfterMethod
  public void logout()
  {
	  Reporter.log("this is logout page", true);
  }
  
  @BeforeClass
  public void browserlaunch()
  {
	  Reporter.log("this is browser launch", true);
  }
  
  @AfterClass
  public void closebrowser()
  {
	  Reporter.log("this is close browser", true);
  }
  
}
