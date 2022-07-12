package TestNG_study;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class testStudy {
  @Test
  public void mymethod1() 
  {
	  Reporter.log("hello A", true);
  }
  
  @Test
  public void mymethod2() 
  {
	  Assert.fail();
	  Reporter.log("hello B", true);
  }
  
  @Test
  public void mymethod3() 
  {
	  Reporter.log("hello C", true);
  }
}
